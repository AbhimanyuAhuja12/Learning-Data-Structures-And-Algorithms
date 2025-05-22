package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalRows = input.nextInt();
        int totalCols = input.nextInt();

        ArrayList<String> getPaths = getMazePaths(1, 1, totalRows, totalCols);
        System.out.println(getPaths);
    }

    private static ArrayList<String> getMazePaths(int startRow, int startCol, int destinationRow, int destinationCol) {
        if (startRow == destinationRow && startCol == destinationCol) {
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        }

        ArrayList<String> allPaths = new ArrayList<>();

        // Horizontal moves: H1, H2, ..., as long as within bounds
        for (int jump = 1; jump <= destinationCol - startCol; jump++) {
            ArrayList<String> horizontalPaths = getMazePaths(startRow, startCol + jump, destinationRow, destinationCol);
            for (String path : horizontalPaths) {
                allPaths.add("H" + jump + path);
            }
        }

        // Vertical moves: V1, V2, ..., as long as within bounds
        for (int jump = 1; jump <= destinationRow - startRow; jump++) {
            ArrayList<String> verticalPaths = getMazePaths(startRow + jump, startCol, destinationRow, destinationCol);
            for (String path : verticalPaths) {
                allPaths.add("V" + jump + path);
            }
        }

        // Diagonal moves: D1, D2, ..., as long as within bounds
        for (int jump = 1; jump <= destinationRow - startRow && jump <= destinationCol - startCol; jump++) {
            ArrayList<String> diagonalPaths = getMazePaths(startRow + jump, startCol + jump, destinationRow, destinationCol);
            for (String path : diagonalPaths) {
                allPaths.add("D" + jump + path);
            }
        }

        return allPaths;
    }
}
