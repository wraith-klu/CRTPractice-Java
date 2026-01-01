package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
       int[] arr = {38, 27, 43, 3, 9, 82, 10};
       int [] sortedArr = mergeSort(arr);
       for(int num : sortedArr) {
        System.out.print(num + " ");
       }
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;                          // devide the array into two halves

        // Recursively sort both halves by calling mergeSort function on both halves
        int[] leftHalf = mergeSort(Arrays.copyOfRange(arr, 0, mid));          // Arrays.copyOfRange(arr, 0, mid) creates a new array containing elements from index 0 to mid-1    
        int[] rightHalf = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));    // Arrays.copyOfRange(arr, mid, arr.length) creates a new array containing elements from index mid to end of the array


        return merge(leftHalf, rightHalf); 
    }
    public static int[] merge(int[] leftHalf, int[] rightHalf) {
        int[] arr = new int[leftHalf.length + rightHalf.length];    // new array for keeping the sorted elements
        int i = 0, j = 0, k = 0;                                   // i for leftHalf array, j for rightHalf array, k for new array
        while (i < leftHalf.length && j < rightHalf.length) {     // Traverse both arrays and compare elements
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k++] = leftHalf[i++];
            } else {
                arr[k++] = rightHalf[j++];
            }
        }
        // It may be possible that one of the arrays is not completely traversed
        // So copy the remaining elements of that array in the new array
        while (i < leftHalf.length) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            arr[k++] = rightHalf[j++];
        }
        return arr;
    }
}
