package Recursion;

import java.util.Scanner;

public class Nto1PrintinginRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fun(n);
        System.out.println();
        oneToN(n);
        sc.close();
    }
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
    }
    public static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.print(n + " ");
    }
}
