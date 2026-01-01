package Recursion;

import java.util.Scanner;

public class SumofNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result1 = sum1toN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result1);
        int result2 = sumNto1(n);
        System.out.println("Sum of first " + n + " natural numbers in reverse order is: " + result2);
        sc.close();
    }
    public static int sum1toN(int n) {
        if (n == 1) {
            return 1;
        }
        sum1toN(n - 1);
        int sum = n + sum1toN(n - 1);
        return sum;
    }
    public static int sumNto1(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumNto1(n - 1);
        return sum;
    }
}
