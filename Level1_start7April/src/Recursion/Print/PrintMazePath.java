package Recursion.Print;

import java.util.Scanner;
public class PrintMazePath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int totalRows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int totalCols = input.nextInt();
        input.close();

        System.out.println("All possible maze paths:");
        generateMazePaths(1, 1, totalRows, totalCols, "");
    }

    /**
     * Recursively generates all paths from (startRow, startCol) to (destRow, destCol)
     * using only horizontal (H) and vertical (V) moves.
     *
     * @param startingRow    Current row position
     * @param startingCol    Current column position
     * @param destinationRow Destination row
     * @param destinationCol Destination column
     * @param path   Accumulated path so far
     */

    private static void generateMazePaths(int startingRow, int startingCol, int destinationRow, int destinationCol, String path) {
        if (startingRow == destinationRow && startingCol == destinationCol) {
            System.out.println(path);
            return;
        }
        if (startingRow > destinationRow || startingCol > destinationCol) {
            return;
        }
        generateMazePaths(startingRow, startingCol + 1, destinationRow, destinationCol, path + "H");
        generateMazePaths(startingRow + 1, startingCol, destinationRow, destinationCol, path + "V");
    }
}
