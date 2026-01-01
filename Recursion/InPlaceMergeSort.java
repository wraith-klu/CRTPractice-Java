package Recursion;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        inPlaceMergeSort(arr, 0, arr.length);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void inPlaceMergeSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        // Sort both halves
        inPlaceMergeSort(arr, s, mid);
        inPlaceMergeSort(arr, mid, e);

        // Merge both sorted halves
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        // Compare and merge
        while (i < mid && j < e) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i < mid) {
            mix[k++] = arr[i++];
        }
        while (j < e) {
            mix[k++] = arr[j++];
        }

        // Copy back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
