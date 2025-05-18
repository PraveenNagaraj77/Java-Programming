public class MountainSearch {
    public static void main(String[] args) {
        int[] mountainArray = {1, 3, 5, 7, 9, 6, 4, 2};
        int target = 6;

        int index = findInMountainArray(mountainArray, target);
        System.out.println("Target index: " + index);
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = findPeakIndex(arr);

        // Try to find target in ascending part
        int index = binarySearch(arr, target, 0, peak, true);
        if (index != -1) return index;

        // Try to find target in descending part
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    static int findPeakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (ascending) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;
    }
}
