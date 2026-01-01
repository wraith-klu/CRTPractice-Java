package Recursion;

// Recursive Fibonacci calculates the nth term by adding the previous two Fibonacci numbers using recursion.

import java.util.Scanner;

public class FibonacciRecursionSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index value, n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of n: " + fibonacci(n)); 
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <2) {
            return n;
        }
        // Recursive Call for (n-1)th and (n-2)th Fibonacci Numbers and Adding Them to Get nth Fibonacci Number. 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}



/*
Dry Run (Recursive Calls)

Call Expansion (Top-Down)
fibonacci(6)
= fibonacci(5) + fibonacci(4)

fibonacci(5)
= fibonacci(4) + fibonacci(3)

fibonacci(4)
= fibonacci(3) + fibonacci(2)

fibonacci(3)
= fibonacci(2) + fibonacci(1)

fibonacci(2)
= fibonacci(1) + fibonacci(0)

Base Case Returns

fibonacci(1) = 1
fibonacci(0) = 0

Backtracking (Return Values)

Function Call	Returned Value
fibonacci(2)	1 + 0 = 1
fibonacci(3)	1 + 1 = 2
fibonacci(4)	2 + 1 = 3
fibonacci(5)	3 + 2 = 5
fibonacci(6)	5 + 3 = 8

Final Answer
fibonacci(6) = 8


Recursion Tree (Very Important for Exams)

fibonacci(6)
 ├── fibonacci(5)
 │    ├── fibonacci(4)
 │    │    ├── fibonacci(3)
 │    │    │    ├── fibonacci(2)
 │    │    │    │    ├── fibonacci(1) → 1
 │    │    │    │    └── fibonacci(0) → 0
 │    │    │    └── fibonacci(1) → 1
 │    │    └── fibonacci(2)
 │    │         ├── fibonacci(1) → 1
 │    │         └── fibonacci(0) → 0
 │    └── fibonacci(3)
 │         ├── fibonacci(2)
 │         │    ├── fibonacci(1) → 1
 │         │    └── fibonacci(0) → 0
 │         └── fibonacci(1) → 1
 └── fibonacci(4)
      ├── fibonacci(3)
      │    ├── fibonacci(2)
      │    │    ├── fibonacci(1) → 1
      │    │    └── fibonacci(0) → 0
      │    └── fibonacci(1) → 1
      └── fibonacci(2)
           ├── fibonacci(1) → 1
           └── fibonacci(0) → 0


Key Exam Points ✅
Base Cases: fibonacci(0) = 0, fibonacci(1) = 1
Recursive Case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

Time Complexity: O(2^n) (Exponential Time Complexity)
Space Complexity: O(n) (due to recursive call stack)

*/