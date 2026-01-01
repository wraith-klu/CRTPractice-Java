package Recursion;

/*  
    Bubble Sort - Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, 
                compares adjacent elements and swaps them if they are in the wrong order. 
                The pass through the list is repeated until the list is sorted.
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 9};
        bubbleSort(arr, arr.length);
    }
    static void bubbleSort(int[] arr, int n) {
        if (n == 1) {     // Base case: If the array size is 1, it's already sorted
            // printArray(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }   
            return;
        }
        
        for (int i = 0; i < n - 1; i++) {  
            if (arr[i] > arr[i + 1]) {
                // swap arr[i] and arr[i+1]
                swap(arr, i, i + 1);
            }
        }
        bubbleSort(arr, n - 1);     // Recursive call for the remaining array as last element is already sorted
    }
    static int swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return 0;
    }
    // static void printArray(int[] arr) {
    //     for (int num : arr) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }
}
