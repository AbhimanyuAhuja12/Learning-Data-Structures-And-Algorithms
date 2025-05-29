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
//        minimumCostPathUsingRecursion(matrix, 0, 0, rows - 1, cols - 1, "", 0);
//        System.out.println(min_cost);
//        System.out.println(min_path);
        int cost = MinCostPathTabulation(matrix);
        int cost2 = MinCostRec(matrix,0,0);
        System.out.println(cost);
        System.out.println(cost2);
    }

    static int min_cost = Integer.MAX_VALUE;
    static String min_path = "";

    private static void minimumCostPathUsingRecursion(int[][] matrix, int sr, int sc, int dr, int dc, String path, int cost) {
        if (sr == dr && sc == dc) {
            cost += matrix[sr][sc];
            if (cost < min_cost) {
                min_cost = cost;
                min_path = path;
            }
            return;
        }
        if (sr > dr || sc > dc) {
            return;
        }

        cost += matrix[sr][sc];
        minimumCostPathUsingRecursion(matrix, sr + 1, sc, dr, dc, path + "V", cost);
        minimumCostPathUsingRecursion(matrix, sr, sc + 1, dr, dc, path + "H", cost);


    }

//    static int[][] dp = new int[matrix.length][matrix[0].length];

//    private static void minimumCostPathUsingMemoization(int[][] matrix, int sr, int sc, int dr, int dc, String path, int cost) {
//        if (sr == dr && sc == dc) {
//            cost += matrix[sr][sc];
//            if (cost < min_cost) {
//                min_cost = cost;
//                min_path = path;
//            }
//            return;
//        }
//        if (sr > dr || sc > dc) {
//            return;
//        }
//        if (dp[sr][sc] != 0) {
//             dp[sr][sc];
//        }
//
//        cost += matrix[sr][sc];
//        minimumCostPathUsingMemoization(matrix, sr + 1, sc, dr, dc, path + "V", cost);
//        minimumCostPathUsingMemoization(matrix, sr, sc + 1, dr, dc, path + "H", cost);
//
//        dp[sr][sc] = cost;
//    }

    private static int MinCostPathTabulation(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        // Start from bottom-right and move backward
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    // Destination cell
                    dp[i][j] = matrix[i][j];
                } else if (i == m - 1) {
                    // Last row: only move right
                    dp[i][j] = matrix[i][j] + dp[i][j + 1];
                } else if (j == n - 1) {
                    // Last column: only move down
                    dp[i][j] = matrix[i][j] + dp[i + 1][j];
                } else {
                    // Take min of right and down
                    dp[i][j] = matrix[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0]; // Top-left cell has min path cost
    }



    private static int MinCostRec(int[][] matrix , int sr , int sc){
        if(sr>matrix.length-1 || sc>matrix[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(sr== matrix.length-1 && sc==matrix[0].length-1){
            return matrix[sr][sc];
        }

        int h = MinCostRec(matrix,sr,sc+1);
        int v = MinCostRec(matrix,sr+1,sc);

        return matrix[sr][sc] + Math.min(h, v);
    }
}
