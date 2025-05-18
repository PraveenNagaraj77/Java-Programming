public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {15, 12, 10, 8, 6, 3, 1}; // Example array (descending order)
        int target = 6; // Target value to search
        int ans = orderAgnosticBinarySearch(arr, target); // Call the search method
        System.out.println(ans); // Print the result (index or -1 if not found)
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}