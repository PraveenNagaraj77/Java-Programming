package Backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
        System.out.println("1. Paths with diagonal moves (D=Diagonal, V=Vertical, H=Horizontal):");
        ArrayList<String> diagonalPaths = pathDiagonal("", 3, 3);
        System.out.println(diagonalPaths);
        System.out.println("Total Diagonal Paths: " + diagonalPaths.size());

        System.out.println("\n2. Paths without diagonal (returned list):");
        ArrayList<String> nonDiagonalPaths = pathRet("", 3, 3);
        System.out.println(nonDiagonalPaths);
        System.out.println("Total Non-Diagonal Paths: " + nonDiagonalPaths.size());

        System.out.println("\n3. Paths without diagonal (printed directly):");
        path("", 3, 3);

        System.out.println("\n4. Total number of paths without diagonal (count method):");
        System.out.println(count(3, 3));  // Should match number of non-diagonal paths

        System.out.println("\n5. Paths with restrictions and backtracking (U=Up, D=Down, L=Left, R=Right):");
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
    }

    // Method to count number of paths without diagonal
    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int down = count(row - 1, col);     // move vertically
        int right = count(row, col - 1);    // move horizontally
        return down + right;
    }

    // Print all paths (no diagonal)
    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + 'D', row - 1, col);
        }
        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    }

    // Return all paths as a list (no diagonal)
    static ArrayList<String> pathRet(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();

        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        if (row > 1) {
            list.addAll(pathRet(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathRet(p + 'R', row, col - 1));
        }

        return list;
    }

    // Return all paths with diagonal movement allowed
    static ArrayList<String> pathDiagonal(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();

        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        if (row > 1 && col > 1) {
            list.addAll(pathDiagonal(p + 'D', row - 1, col - 1));
        }

        if (row > 1) {
            list.addAll(pathDiagonal(p + 'V', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathDiagonal(p + 'H', row, col - 1));
        }

        return list;
    }

    // Print all valid paths avoiding obstacles using backtracking
    static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // Mark current cell as visited
        maze[row][col] = false;

        // Move Down
        if (row < maze.length - 1) {
            pathRestrictions(p + 'D', maze, row + 1, col);
        }

        // Move Right
        if (col < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, row, col + 1);
        }

        // Move Up
        if (row > 0) {
            pathRestrictions(p + 'U', maze, row - 1, col);
        }

        // Move Left
        if (col > 0) {
            pathRestrictions(p + 'L', maze, row, col - 1);
        }

        // Backtrack (unmark cell)
        maze[row][col] = true;
    }
}
