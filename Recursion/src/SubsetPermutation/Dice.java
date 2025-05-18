package SubsetPermutation;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        ArrayList<String> result = dice("", 4);
        System.out.println("Combinations: " + result);
        System.out.println("Count: " + result.size());
    }

    static ArrayList<String> dice(String p, int target) {
        ArrayList<String> result = new ArrayList<>();

        if (target == 0) {
            result.add(p);
            return result;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(dice(p + i, target - i));
        }

        return result;
    }
}
