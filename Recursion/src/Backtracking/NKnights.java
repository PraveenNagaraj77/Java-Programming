package Backtracking;

public class NKnights {

    static int count = 0;
    static int maxPrints = 5; // Change this to control how many boards are printed

    public static void main(String[] args) {
        int n = 4; // N x N board and N knights
        boolean[][] board = new boolean[n][n];
        solve(board, 0, 0, n);
        System.out.println("\nTotal valid arrangements: " + count);
    }

    // Main backtracking method
    static void solve(boolean[][] board, int row, int col, int knightsLeft) {
        if (knightsLeft == 0) {
            count++;
            if (maxPrints > 0) {
                printKnights(board);
                maxPrints--;
            }
            return;
        }

        if (row == board.length) return;

        if (col == board.length) {
            solve(board, row + 1, 0, knightsLeft);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            solve(board, row, col + 1, knightsLeft - 1);
            board[row][col] = false; // Backtrack
        }

        solve(board, row, col + 1, knightsLeft);
    }

    // Check if it's safe to place a knight at board[row][col]
    static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves = {
                {-2, -1}, {-2, +1},
                {-1, -2}, {-1, +2}
        };

        for (int[] move : moves) {
            int r = row + move[0];
            int c = col + move[1];

            if (r >= 0 && c >= 0 && r < board.length && c < board.length && board[r][c]) {
                return false;
            }
        }

        return true;
    }

    // Print only knight positions
    static void printKnights(boolean[][] board) {
        System.out.print("Knight Positions: ");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }
        System.out.println();
    }
}
