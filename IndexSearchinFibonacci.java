import java.util.Arrays;
import java.util.Scanner;

public class IndexSearchinFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the target number to search: ");
        int target = sc.nextInt();

        int[] fib = fibonacci(n);
        System.out.println("\nFibonacci Series: " + Arrays.toString(fib));
        
        int index = searchInFibonacci(n, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the series");
        }
        sc.close();
    }
    public static int numberAtIndex(int n, int index) {
        int[] fib = fibonacci(n);
        if (index >= 0 && index < fib.length) {
            return fib[index];
        }
        return -1; // Invalid index
    }
    public static int searchInFibonacci(int n, int target) {
        int[] fib = fibonacci(n);
        for (int i = 0; i < fib.length; i++) {
            if (fib[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] fibonacci(int n) {
        int[] fib = new int[n];
        int a = 0, b = 1;
        if (n >= 1) fib[0] = a;
        if (n >= 2) fib[1] = b;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            fib[i] = c;
            a = b;
            b = c;
        }
        return fib;
    }
}