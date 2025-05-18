package Backtracking;

public class NQueens {

    public static void main(String[] args) {
        int n = 4; // You can change N here
        boolean[][] board = new boolean[n][n];
        System.out.println("Solutions for " + n + "-Queens problem:");
        int solutions = solveNQueens(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    // Main solver function using backtracking
    static int solveNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; // Place queen
                count += solveNQueens(board, row + 1); // Recurse for next row
                board[row][col] = false; // Backtrack
            }
        }

        return count;
    }

    // Check if it's safe to place a queen at board[row][col]
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    // Utility method to print the board
    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
