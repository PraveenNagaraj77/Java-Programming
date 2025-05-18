public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 45, 87};
        int start = 3;
        int end = 10;
        int target = 8;

        System.out.println("Target found at index: " + searchInRange(nums, start, end, target));
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        if (arr == null || arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1; // Target not found in range
    }
}
