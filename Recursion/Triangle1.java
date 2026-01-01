package Recursion;
import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        int c = 0;
        triangle1(r, c);
        triangle2(r, c);
        sc.close();
    }

    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle1(r, c + 1);
        } else {
            System.out.println();        
            triangle1(r - 1, 0);
        }
    }
    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }
}
