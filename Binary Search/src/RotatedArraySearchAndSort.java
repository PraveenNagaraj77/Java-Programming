import java.util.Arrays;

public class RotatedArraySearchAndSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int index = search(arr, target);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        System.out.println("Target index: " + index);

        int[] sortedArray = recoverSortedArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        int rotationCount = findPivot(arr);
        System.out.println("Rotation count: " + rotationCount);
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            // Handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            else if (arr[start] <= arr[mid]) { // Left side sorted
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right side sorted
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    static int[] recoverSortedArray(int[] arr) {
        int n = arr.length;
        int pivot = findPivot(arr);

        int[] sorted = new int[n];
        int idx = 0;

        // Copy elements from pivot to end
        for (int i = pivot; i < n; i++) {
            sorted[idx++] = arr[i];
        }
        // Copy elements from start to pivot-1
        for (int i = 0; i < pivot; i++) {
            sorted[idx++] = arr[i];
        }

        return sorted;
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[end]) {
                end = mid;
            }
            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else { // arr[mid] == arr[end]
                end--;
            }
        }

        return start; // Pivot is the index of the smallest element = rotation count
    }
}
