package Recursion;

/* Selection Sort - Selection Sort is a sorting algorithm that repeatedly selects the smallest (or largest) 
                    element from the unsorted portion of the array and swaps it with the first unsorted element, 
                    gradually growing the sorted portion of the array.
                    
*/ 
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 5, 4, 7, 3, 6, 2, 8, 1, 9, 12, 22, 11};
        selectionSort(arr, 0, arr.length);
    
    }
    static void selectionSort(int[] arr, int index, int n) {
        if (index == n) { // Base case: If the entire array is traversed
            for (int num : arr) {
                System.out.print(num + " ");
            }
            return;
        }
        int minIndex = index;
        for (int j = index + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j; // Update minIndex if a smaller element is found
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        int temp = arr[minIndex];
        arr[minIndex] = arr[index];
        arr[index] = temp;


        selectionSort(arr, index + 1, n); // Recursive call for the next index
    }
    
}
