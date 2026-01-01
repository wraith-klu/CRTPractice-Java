package Recursion;

public class FindTargetinLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(findTarget(arr, target, 0));
    }
    static boolean findTarget(int[] arr, int target, int index) {
        if (index == arr.length) { // Base Condition - If Reached End of Array and Element Not Found, then Return False.
            return false;
        }
        return arr[index] == target || findTarget(arr, target, index + 1); // Checking Current Element with Target and Recursively Calling for Next Index. if Both are False, then Only Return False.
    }
}