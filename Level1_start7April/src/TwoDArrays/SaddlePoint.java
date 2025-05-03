package TwoDArrays;

import java.util.Scanner;

public class SaddlePoint {
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

        System.out.println(findSaddlePoint(matrix));
    }

    private static int findSaddlePoint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int ptr = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    ptr = j;
                }
            }
            boolean isSaddlePoint = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][ptr] > min) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if (isSaddlePoint) {
                return min;
            }

        }
        return -1;
    }
}
