package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        // int product= n * factorial(n - 1);
        // return product;
        return n * factorial(n - 1);
    }
}





/*
Dry Run (Step-by-Step)

Function Call Stack
Call No.	Function Call	Condition	Action
1	factorial(4)	n ≠ 0	4 * factorial(3)
2	factorial(3)	n ≠ 0	3 * factorial(2)
3	factorial(2)	n ≠ 0	2 * factorial(1)
4	factorial(1)	n ≠ 0	1 * factorial(0)
5	factorial(0)	n = 0	return 1

Returning Phase (Backtracking)

Returning From	Returned Value
factorial(0)	1
factorial(1)	1 * 1 = 1
factorial(2)	2 * 1 = 2
factorial(3)	3 * 2 = 6
factorial(4)	4 * 6 = 24

Final Answer
factorial(4) = 24

Call Stack Visualization (Easy to Remember)

factorial(4)
 → 4 * factorial(3)
     → 3 * factorial(2)
         → 2 * factorial(1)
             → 1 * factorial(0)
                 → 1

Key Exam Points ✅

Base Case: n == 0

Recursive Case: n * factorial(n-1)

Time Complexity: O(n)

Space Complexity: O(n) (recursive stack)
*/