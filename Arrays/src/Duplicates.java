import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4};

        // Get the length of the array to track where to place elements
        int n = arr.length;

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found, shift the elements
                if (arr[i] == arr[j]) {
                    // Shift the remaining elements left
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;  // Reduce the size of the array
                    j--;  // Stay at the current position after shift
                }
            }
        }

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, n)));
    }
}
