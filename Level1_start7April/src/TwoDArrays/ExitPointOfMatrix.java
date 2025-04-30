package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program finds the exit point of a matrix. Starting at the top-left corner (0,0),
 * the direction of movement changes based on the cell's value (0 or 1).
 * If the traversal exits the matrix boundary, the program returns the last valid position.
 */
public class ExitPointOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.toString(findExit(matrix)));
    }

    /**
     * Traverses the matrix based on cell values and returns the exit coordinates.
     *
     * @param matrix the input matrix with 0s and 1s
     * @return the coordinates {row, column} where the exit occurs
     */
    private static int[] findExit(int[][] matrix) {
        int row = 0;
        int col = 0;
        // dir  0 -> east , 1 ->south , 2 -> west , 3 -> north
        int direction = 0;

        while (true) {
            direction = (direction + matrix[row][col]) % 4;

            if (direction == 0) {
                col++;
            } else if (direction == 1) {
                row++;
            } else if (direction == 2) {
                col--;
            } else {
                row--;
            }

            if (row < 0) {
                row++;
                break;
            } else if (col < 0) {
                col++;
                break;
            } else if (row == matrix.length) {
                row--;
                break;
            } else if (col == matrix[0].length) {
                col--;
                break;
            }
        }
        return new int[]{row, col};
    }
}

/*
package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program finds the exit point of a matrix. Starting at the top-left corner (0,0),
 * the direction of movement changes based on the cell's value (0 or 1).
 * If the traversal exits the matrix boundary, the program returns the last valid position.

public class ExitPointOfMatrix {

    // Direction constants
    private static final int EAST = 0;
    private static final int SOUTH = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        // Reading matrix input
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int[] exitPoint = findExitPoint(matrix);
        System.out.println(Arrays.toString(exitPoint));

        scanner.close();
    }


     * Traverses the matrix based on cell values and returns the exit coordinates.
     *
     * @param matrix the input matrix with 0s and 1s
     * @return the coordinates {row, column} where the exit occurs

    private static int[] findExitPoint(int[][] matrix) {
        int direction = EAST;
        int row = 0;
        int col = 0;

        while (true) {
            direction = (direction + matrix[row][col]) % 4;

            switch (direction) {
                case EAST:
                    col++;
                    break;
                case SOUTH:
                    row++;
                    break;
                case WEST:
                    col--;
                    break;
                case NORTH:
                    row--;
                    break;
                default:
                    // Should never happen
                    break;
            }

            // Check for exit condition (out of matrix bounds)
            if (row < 0) {
                row++;
                break;
            } else if (col < 0) {
                col++;
                break;
            } else if (row >= matrix.length) {
                row--;
                break;
            } else if (col >= matrix[0].length) {
                col--;
                break;
            }
        }

        return new int[]{row, col};
    }
}
 */

/*
package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExitPointOfMatrix {

    private static final int EAST = 0;
    private static final int SOUTH = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int[] exitPoint = findExitRecursive(matrix, 0, 0, EAST);
        System.out.println(Arrays.toString(exitPoint));

        scanner.close();
    }

    private static int[] findExitRecursive(int[][] matrix, int row, int col, int direction) {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length) {
            // Out of bounds, step back
            switch (direction) {
                case EAST: col--; break;
                case SOUTH: row--; break;
                case WEST: col++; break;
                case NORTH: row++; break;
            }
            return new int[]{row, col};
        }

        direction = (direction + matrix[row][col]) % 4;

        // Move to next cell
        switch (direction) {
            case EAST: return findExitRecursive(matrix, row, col + 1, direction);
            case SOUTH: return findExitRecursive(matrix, row + 1, col, direction);
            case WEST: return findExitRecursive(matrix, row, col - 1, direction);
            case NORTH: return findExitRecursive(matrix, row - 1, col, direction);
        }

        return new int[]{row, col}; // fallback, shouldn't reach
    }
}

 */