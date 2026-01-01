package Recursion;

import java.util.Scanner;

public class OnetoNineRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        reverseFun(n);
        sc.close();
    }
    public static void reverseFun(int n) {
        if (n == 0) {
            return;
        }
        reverseFun(n - 1);
        System.out.print(n + " ");
    }
}
