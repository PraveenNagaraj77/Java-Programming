import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Praveen";
        char target = 'v';

        // Convert the string to a char array and print
        System.out.println(Arrays.toString(name.toCharArray()));

        // Call search methods
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    // Search using a traditional for loop
    static boolean search(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    // Search using a for-each loop on char array
    static boolean search2(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
