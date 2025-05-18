package ArrayRecursion;

import java.util.ArrayList;

public class LinerSearchFind {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 7, 5};

        // Check if the target is found
        System.out.println(find(arr, 4, 0));  // true, because 4 is in the array

        // Find the first index of target
        System.out.println(findIndex(arr, 4, 0));  // 3, 4 is at index 3

        // Find the index of target from the last index
        System.out.println(findIndexFromLast(arr, 4, arr.length - 1));  // 3, 4 is at index 3 from the end

        // Find all indices of target and return as an ArrayList
        ArrayList<Integer> result = findAllIndex(arr, 4);
        System.out.println(result);  // Outputs all indices where 4 is found
    }

    // Find if target is in the array
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // Find the index of target from the start
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    // Find the index of target from the last element
    static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexFromLast(arr, target, index - 1);
        }
    }

    // Method to find all indices of target element and return as an ArrayList
    static ArrayList<Integer> findAllIndex(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();  // Initialize a new ArrayList
        findAllIndex(arr, target, 0, list);  // Start the recursive search from index 0
        return list;  // Return the populated ArrayList
    }

    // Helper method for the actual recursion, which adds the indices to the list
    static void findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return;  // Base case: end of array, stop recursion
        }
        if (arr[index] == target) {
            list.add(index);  // If the target matches, add the index to the list
        }
        findAllIndex(arr, target, index + 1, list);  // Recurse to the next index
    }
}
