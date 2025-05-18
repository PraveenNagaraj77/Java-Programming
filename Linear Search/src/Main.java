public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int index = linearSearch(nums, target);
        int element = linearSearchElement(nums, target);
        boolean found = linearSearchBoolean(nums, target);

        System.out.println("The target is located at index: " + index);
        System.out.println("The target element is: " + element);
        System.out.println("Is target found? " + found);
    }

    /**
     * Searches the target in the array and returns the index if found.
     * If not found, returns -1.
     */
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1; // target not found
    }

    /**
     * Searches the target in the array and returns the element if found.
     * If not found, returns -1.
     */
    static int linearSearchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return -1; // target not found
    }

    /**
     * Searches the target in the array and returns true if found, false otherwise.
     */
    static boolean linearSearchBoolean(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false; // target not found
    }
}
