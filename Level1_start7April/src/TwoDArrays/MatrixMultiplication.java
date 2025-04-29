package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Invalid output");
            return;
        }
        printMatrix(MultiplyMatrices(matrix1, matrix2));
    }

    public static int[][] MultiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for(int k=0;k<matrix2.length;k++){
                    result[i][j]+=matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
