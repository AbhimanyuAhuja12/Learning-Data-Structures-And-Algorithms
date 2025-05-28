package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostPath {
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
        minimumCostPathUsingRecursion(matrix, 0, 0, rows - 1, cols - 1, "",0);
    }

    private static int minimumCostPathUsingRecursion(int[][] matrix, int sr, int sc, int dr, int dc, String curr, int cost) {
        if (sr == dr && sc == dc) {

        }
        if (sr > dr || sc > dc || sr < 0 || sc < 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int c1 = minimumCostPathUsingRecursion(matrix, sr + 1, sc, dr, dc, curr + "V", cost + matrix[sr][sc]);
        int c2 = minimumCostPathUsingRecursion(matrix, sr, sc + 1, dr, dc, curr + "H", cost + matrix[sr][sc]);
        int c = c1+c2;
        return c;
    }
}
