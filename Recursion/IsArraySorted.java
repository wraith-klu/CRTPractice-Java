package Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
         // Checking Current Element with Next Element and Recursively Calling for Next Index. if Both are True, then Only Return True.
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1); 
    }
}
