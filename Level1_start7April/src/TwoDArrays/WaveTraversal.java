package TwoDArrays;

import java.util.Scanner;

public class WaveTraversal {
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

        PrintInWaveTraversal(matrix);
    }

    private static void PrintInWaveTraversal(int[][] matrix) {
        for (int cols = 0; cols < matrix[0].length; cols++) {
            if (cols % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    System.out.print(matrix[rows][cols] + "\t");
                }
                System.out.println();
            } else {
                for (int rows = matrix.length-1; rows >= 0; rows--) {
                    System.out.print(matrix[rows][cols] + "\t");
                }
                System.out.println();
            }
        }
    }
}
