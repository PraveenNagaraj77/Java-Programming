package Strings;

public class Stream {
    public static void main(String[] args) {
        System.out.println("Result without 'i': " + skip("", "priiiiiaveen"));
        System.out.println("Result without 'apple': " + skipApple("", "xxappleyapplez"));
        System.out.println("Result skipping 'app' but not 'apple': " + skipAppNotApple("appbanapplappz"));

    }

    // Skip all occurrences of 'i'
    static String skip(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);

        if (ch == 'i') {
            return skip(p, up.substring(1));  // Skip 'i'
        } else {
            return skip(p + ch, up.substring(1));  // Include current character
        }
    }

    // Skip all occurrences of the word "apple"
    static String skipApple(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        if (up.startsWith("apple")) {
            return skipApple(p, up.substring(5));  // Skip the entire word "apple"
        } else {
            return skipApple(p + up.charAt(0), up.substring(1));  // Include current character
        }
    }


    // Skip "app" only if it is not part of "apple"
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        // If starts with "app" but not with "apple", skip "app"
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
