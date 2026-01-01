public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
  
    // Function to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge temporary arrays back into arr
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function for iterative merge sort
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        // Start with subarrays of size 1, then 2, 4, 8...
        for (int curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {

            // Pick starting point of subarrays to be merged
            for (int left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {

                int mid = Math.min(left_start + curr_size - 1, n - 1);
                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Merge subarrays arr[left_start...mid] & arr[mid+1...right_end]
                merge(arr, left_start, mid, right_end);
            }
        }
    }    
}
