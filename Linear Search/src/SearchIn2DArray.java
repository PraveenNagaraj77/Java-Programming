import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {12, 18, 11, 16, 17},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 56;
        int[] ans = search(arr, target);  // Format: {row, column}
        System.out.println("Target found at: " + Arrays.toString(ans));

        System.out.println("Maximum value: " + maxIn2D(arr));
        System.out.println("Minimum value: " + minIn2D(arr));
    }

    // Searches for the target in a 2D array and returns its position
    static int[] search(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    // Returns the maximum value in the 2D array
    static int maxIn2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // Returns the minimum value in the 2D array
    static int minIn2D(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }
}
