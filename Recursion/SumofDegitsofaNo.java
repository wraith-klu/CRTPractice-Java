package Recursion;

import java.util.Scanner;

public class SumofDegitsofaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
        sc.close();
    }
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
