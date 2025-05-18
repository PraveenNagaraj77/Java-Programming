package SubsetPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String input = "abc";

        // Get all subsets in an array
        String[] subsetsArray = generateSubsetsAsArray("", input);

        // Print the array
        System.out.println("All Subsets of \"" + input + "\":");
        System.out.println(Arrays.toString(subsetsArray));
    }

    // Method that returns subsets as a String array
    static String[] generateSubsetsAsArray(String processed, String unprocessed) {
        List<String> resultList = new ArrayList<>();
        generateSubsets(processed, unprocessed, resultList);
        return resultList.toArray(new String[0]);  // Convert List to Array
    }

    // Recursive logic to generate subsets
    static void generateSubsets(String processed, String unprocessed, List<String> result) {
        if (unprocessed.isEmpty()) {
            result.add(processed);  // Add final processed result to list
            return;
        }

        char ch = unprocessed.charAt(0);

        // Include the character
        generateSubsets(processed + ch, unprocessed.substring(1), result);

        // Exclude the character
        generateSubsets(processed, unprocessed.substring(1), result);
    }
}
