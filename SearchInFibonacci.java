import java.util.Scanner;

public class SearchInFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        boolean found = searchInFibonacci(n, target);
        if (found) {
            System.out.println("Element found in Fibonacci series");
        } else {
            System.out.println("Element not found in Fibonacci series");
        }
        sc.close();
    }
    public static boolean searchInFibonacci(int n, int target) {
        int a = 0, b = 1;
        if (target == a || target == b) {
            return true;
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            if (c == target) {
                return true;
            }
            a = b;
            b = c;
        }
        return false;
    }
}
