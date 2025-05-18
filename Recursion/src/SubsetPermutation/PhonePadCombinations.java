package SubsetPermutation;

import java.util.*;

public class PhonePadCombinations {

    public static void main(String[] args) {
        String digits = "23";  // You can change this input

        PhonePadCombinations ppc = new PhonePadCombinations();
        String[] combos = ppc.letterCombinations(digits);

        System.out.println("Combinations: " + Arrays.toString(combos));
        System.out.println("Count: " + combos.length);
    }

    public String[] letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new String[0];  // return empty array for empty input
        }

        List<String> result = new ArrayList<>();

        String[] mapping = new String[] {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        backtrack("", digits, mapping, result);

        // Convert List to Array before returning
        return result.toArray(new String[0]);
    }

    private void backtrack(String processed, String unprocessed, String[] mapping, List<String> result) {
        if (unprocessed.isEmpty()) {
            result.add(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            backtrack(processed + ch, unprocessed.substring(1), mapping, result);
        }
    }
}
