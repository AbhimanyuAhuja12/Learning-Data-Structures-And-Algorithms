package Recursion.Backtracking;

import java.util.Scanner;

public class Nqueens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chessBoard = new int[n][n];

        printQueens(chessBoard, "", 0);
    }

    private static void printQueens(int[][] chessBoard, String qsf, int row) {

        if (row == chessBoard.length) {
            System.out.println(qsf + ".");
            return;
        }
        for (int col = 0; col < chessBoard.length; col++) {
            if (isItSafePlaceForQueen(chessBoard, row, col)) {
                chessBoard[row][col] = 1;
                printQueens(chessBoard, qsf + row + "-" + col + ",", row + 1);
                chessBoard[row][col] = 0;
            }
        }
    }

    private static boolean isItSafePlaceForQueen(int[][] chessBoard, int row, int col) {
        // check vertically
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        return true;

    }
}


/*
import java.util.*;

public class NQueensOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input board size
        scanner.close();

        List<String> validArrangements = new ArrayList<>();

        // These boolean arrays help track unsafe positions
        boolean[] columns = new boolean[n];           // Tracks occupied columns
        boolean[] diagonals = new boolean[2 * n - 1]; // Tracks '\' diagonals (row - col + n - 1)
        boolean[] antiDiagonals = new boolean[2 * n - 1]; // Tracks '/' diagonals (row + col)

        // Start recursive backtracking from row 0
        backtrack(0, n, columns, diagonals, antiDiagonals, new ArrayList<>(), validArrangements);

        // Print all valid queen placements in compact "row-col" format
        for (String config : validArrangements) {
            System.out.println(config + ".");
        }
    }
*/
    /*
    /**
     * Recursive backtracking function to place queens row by row.
     *
     * @param row            Current row index
     * @param boardSize      Size of the board (n)
     * @param columns        Tracks if a column is occupied
     * @param diagonals      Tracks if a '\' diagonal is occupied
     * @param antiDiagonals  Tracks if a '/' diagonal is occupied
     * @param currentConfig  List storing current queen positions like "row-col"
     * @param results        List of all valid queen configurations
     */
    /*
private static void backtrack(int row, int boardSize,
                              boolean[] columns,
                              boolean[] diagonals,
                              boolean[] antiDiagonals,
                              List<String> currentConfig,
                              List<String> results) {

    // Base case: all queens are successfully placed
    if (row == boardSize) {
        results.add(String.join(",", currentConfig));
        return;
    }

    // Try placing a queen in each column of the current row
    for (int col = 0; col < boardSize; col++) {
        int diagIndex = row - col + boardSize - 1;  // Index for '\' diagonal
        int antiDiagIndex = row + col;              // Index for '/' diagonal

        // Skip if the column or either diagonal is already occupied
        if (columns[col] || diagonals[diagIndex] || antiDiagonals[antiDiagIndex]) {
            continue;
        }

        // Mark the column and diagonals as occupied
        columns[col] = true;
        diagonals[diagIndex] = true;
        antiDiagonals[antiDiagIndex] = true;

        // Add current queen position in "row-col" format
        currentConfig.add(row + "-" + col);

        // Recurse to the next row
        backtrack(row + 1, boardSize, columns, diagonals, antiDiagonals, currentConfig, results);

        // Backtrack: unmark column and diagonals
        columns[col] = false;
        diagonals[diagIndex] = false;
        antiDiagonals[antiDiagIndex] = false;

        // Remove last queen position
        currentConfig.remove(currentConfig.size() - 1);
    }
}
}

 */