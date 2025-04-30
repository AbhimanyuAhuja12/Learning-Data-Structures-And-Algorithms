package TwoDArrays;

import java.util.Scanner;

public class SpiralMatrix {
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

        PrintInSpiralTraversal(matrix);
    }

    private static void PrintInSpiralTraversal(int[][] matrix) {

        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;

        int total_elements = matrix.length * matrix[0].length;
        int count = 0;
        while (count < total_elements) {
            //left wall->minC
            for (int i = minRow, j = minCol; i <= maxRow && count < total_elements; i++) {
                System.out.print(matrix[i][j]+"\t");
                count++;
            }
            minCol++;

            //bottom wall->maxR
            for (int i = maxRow, j = minCol; j <= maxCol && count < total_elements; j++) {
                System.out.print(matrix[i][j]+"\t");
                count++;
            }
            maxRow--;

            //right wall ->maxC
            for (int i = maxRow, j = maxCol; i >= minRow && count < total_elements; i--) {
                System.out.print(matrix[i][j]+"\t");
                count++;
            }
            maxCol--;

            //top wall -> minR
            for (int i = minRow, j = maxCol; j >= minCol && count < total_elements; j--) {
                System.out.print(matrix[i][j]+"\t");
                count++;
            }
            minRow++;
        }
    }
}
