package Sorting;

public class QuickSortRecursive {

    // Recursive Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively apply quicksort to subarrays
            quickSort(arr, low, pivotIndex - 1);   // Left subarray
            quickSort(arr, pivotIndex + 1, high);  // Right subarray
        }
    }

    // Partition function (Lomuto partition scheme)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1;       // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap helper method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility method to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test recursive quick sort
    public static void main(String[] args) {
        int[] arr = { 33, 10, 55, 71, 29, 5, 18 };

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
