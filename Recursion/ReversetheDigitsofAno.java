package Recursion;

import java.util.Scanner;

public class ReversetheDigitsofAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = reverseDigits(n);
        System.out.println("Reversed digits of " + n + " is: " + result);
        sc.close();
    }

    public static int reverseDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int digits = (int) Math.log10(n) ;
        return (n % 10) * (int) Math.pow(10, digits) + reverseDigits(n / 10);
    }
}
