package Recursion;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        sort(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        sort(arr, n - 1);
        insert(arr, n - 1, arr[n - 1]);
    }
    public static void insert(int[] arr, int n, int key) {
        if (n == 0 || arr[n - 1] <= key) {
            arr[n] = key;
            return;
        }
        arr[n] = arr[n - 1];
        insert(arr, n - 1, key);
    }
}
