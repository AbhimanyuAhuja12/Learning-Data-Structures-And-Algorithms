package Recursion.Print;

import java.util.Scanner;

/**
 * A program to generate all possible paths from the top-left corner to the bottom-right corner
 * in a 2D maze using horizontal (H), vertical (V), and diagonal (D) jumps of variable lengths.
 */
public class PrintMazePathsWithJump {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int totalRows = scanner.nextInt();

            System.out.print("Enter number of columns: ");
            int totalCols = scanner.nextInt();

            scanner.close();

            System.out.println("\nAll possible maze paths from (1,1) to (" + totalRows + "," + totalCols + "):");
            generateMazePaths(1, 1, totalRows, totalCols, "");
        }
    }

    /**
     * Recursively generates and prints all valid paths from the current position to the destination.
     *
     * @param currentRow     Current row index (1-based)
     * @param currentCol     Current column index (1-based)
     * @param targetRow      Destination row index (1-based)
     * @param targetCol      Destination column index (1-based)
     * @param pathSoFar      Accumulated path encoded with direction and jump size
     */
    private static void generateMazePaths(int currentRow, int currentCol, int targetRow, int targetCol, String pathSoFar) {
        // Base case: reached the destination
        if (currentRow == targetRow && currentCol == targetCol) {
            System.out.println(pathSoFar);
            return;
        }

        // Guard clause: out of bounds
        if (currentRow > targetRow || currentCol > targetCol) {
            return;
        }

        // Horizontal jumps (right)
        for (int jump = 1; jump <= targetCol - currentCol; jump++) {
            generateMazePaths(currentRow, currentCol + jump, targetRow, targetCol, pathSoFar + "H" + jump);
        }

        // Vertical jumps (down)
        for (int jump = 1; jump <= targetRow - currentRow; jump++) {
            generateMazePaths(currentRow + jump, currentCol, targetRow, targetCol, pathSoFar + "V" + jump);
        }

        // Diagonal jumps (down-right)
        for (int jump = 1; jump <= Math.min(targetRow - currentRow, targetCol - currentCol); jump++) {
            generateMazePaths(currentRow + jump, currentCol + jump, targetRow, targetCol, pathSoFar + "D" + jump);
        }
    }
}
