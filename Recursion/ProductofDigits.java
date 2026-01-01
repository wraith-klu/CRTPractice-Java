package Recursion;

import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = productOfDigits(n);
        System.out.println("Product of digits of " + n + " is: " + result);
        sc.close();
    }
    public static int productOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int product = (n%10) * productOfDigits(n / 10);
        return product;
    }
}
