package ArrayRecursion;

import java.util.Arrays;
import java.util.Collections;

public class SortedArray {
    public static void main(String[] args) {
        // Original int array
        Integer[] numbers = {42, 23, 4, 8, 16, 15};  // Use Integer[] for Collections.reverseOrder()

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Ascending order sort using Arrays.sort()
        Arrays.sort(numbers);  // Default is ascending order
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));

        // Descending order sort using Arrays.sort() and Collections.reverseOrder()
        Arrays.sort(numbers, Collections.reverseOrder());  // Custom comparator for descending order
        System.out.println("Sorted Array (Descending): " + Arrays.toString(numbers));
    }
}
