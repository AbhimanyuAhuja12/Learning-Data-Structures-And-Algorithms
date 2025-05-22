package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMazePaths {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int totalRows = scanner.nextInt();

            System.out.print("Enter number of columns: ");
            int totalCols = scanner.nextInt();

            List<String> paths = getMazePaths(0, 0, totalRows - 1, totalCols - 1);
            System.out.println("Possible maze paths: " + paths);
        }
    }

    /**
     * Recursively generates all paths from (startRow, startCol) to (destRow, destCol)
     * using only horizontal (H) and vertical (V) moves.
     *
     * @param startRow starting row index
     * @param startCol starting column index
     * @param destRow destination row index
     * @param destCol destination column index
     * @return list of all valid paths
     */
    private static List<String> getMazePaths(int startRow, int startCol, int destRow, int destCol) {
        // Base case: reached destination
        if (startRow == destRow && startCol == destCol) {
            List<String> basePath = new ArrayList<>();
            basePath.add("");  // No more moves needed
            return basePath;
        }

        List<String> resultPaths = new ArrayList<>();

        // Horizontal move (right)
        if (startCol < destCol) {
            List<String> horizontalPaths = getMazePaths(startRow, startCol + 1, destRow, destCol);
            for (String path : horizontalPaths) {
                resultPaths.add("H" + path);
            }
        }

        // Vertical move (down)
        if (startRow < destRow) {
            List<String> verticalPaths = getMazePaths(startRow + 1, startCol, destRow, destCol);
            for (String path : verticalPaths) {
                resultPaths.add("V" + path);
            }
        }

        return resultPaths;
    }
}
