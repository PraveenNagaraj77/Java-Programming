package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 35, 76, 22, 2, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Recursive QuickSort method
    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        // Recursively sort the two partitions
        sort(nums, low, end);
        sort(nums, start, high);
    }

    // Utility method to swap two elements in the array
    static void swap(int[] arr, int i, int j) {
        if (i != j) { // Optimization: skip unnecessary swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
