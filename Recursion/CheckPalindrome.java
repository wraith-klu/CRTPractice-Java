package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        if (result == true) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }
    public static boolean isPalindrome(int n) {
        if (n == reverse(n)){
            return true;
        }else{
            return false;
        }
    }
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int digit = (int) Math.log10(n);
        return (n % 10) * (int) Math.pow(10, digit) + reverse(n / 10);
    }
    // public static int reverse(int n) {
    //     int rev = 0;
    //     while (n != 0) {
    //         int digit = n % 10;
    //         rev = rev * 10 + digit;
    //         n /= 10;
    //     }
    //     return rev;
    // }
}