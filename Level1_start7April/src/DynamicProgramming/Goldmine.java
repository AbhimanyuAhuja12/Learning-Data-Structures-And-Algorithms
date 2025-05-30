package DynamicProgramming;

import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] mine = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mine[i][j] = input.nextInt();
            }
        }
        int MaxGoldCollected = Integer.MIN_VALUE;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = -1;
            }
        }
        for (int r = 0; r < mine.length; r++) {
            if (mine[r][0] != 0) {
                int goldCollected = findPathForMaxGoldMemo(mine, r, 0, dp);
                if (goldCollected > MaxGoldCollected) {
                    MaxGoldCollected = goldCollected;
                }
            }
        }
        System.out.println(MaxGoldCollected);

        System.out.println(findPathForMaxGoldMTabulation(mine));
    }

    private static int findPathForMaxGold(int[][] mine, int row, int col) {
        if (row > mine.length - 1 || col > mine[0].length - 1 || row < 0 || mine[row][col] == 0) {
            return Integer.MIN_VALUE;
        }
        if (col == mine[0].length - 1) {
            return mine[row][col];
        }
        //diagonal up
        int up = findPathForMaxGold(mine, row - 1, col + 1);

        // straight , same row
        int straight = findPathForMaxGold(mine, row, col + 1);

        //diagonal down
        int down = findPathForMaxGold(mine, row + 1, col + 1);

        return Math.max(Math.max(up, down), straight) + mine[row][col];
    }


    private static int findPathForMaxGoldMemo(int[][] mine, int row, int col, int[][] dp) {
        if (row > mine.length - 1 || col > mine[0].length - 1 || row < 0 || mine[row][col] == 0) {
            return Integer.MIN_VALUE;
        }
        if (col == mine[0].length - 1) {
            return mine[row][col]; // Last column, just return current gold
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        //diagonal up
        int up = findPathForMaxGoldMemo(mine, row - 1, col + 1, dp);

        // straight , same row
        int straight = findPathForMaxGoldMemo(mine, row, col + 1, dp);

        //diagonal down
        int down = findPathForMaxGoldMemo(mine, row + 1, col + 1, dp);

        int maxNext = Math.max(Math.max(up, down), straight);

        // If all paths were invalid, don't add current cell
        if (maxNext == Integer.MIN_VALUE) {
            dp[row][col] = Integer.MIN_VALUE;
        } else {
            dp[row][col] = maxNext + mine[row][col];
        }
        return dp[row][col];
    }

    private static int findPathForMaxGoldMTabulation(int[][] mine) {
        int[][] dp = new int[mine.length][mine[0].length];

        for (int col = mine[0].length - 1; col >= 0; col--) {
            for (int row = 0; row < mine.length; row++) {
                if (col == mine[0].length - 1) {
                    dp[row][col] = mine[row][col];
                } else if (row == 0) {
                    dp[row][col] = Math.max(dp[row][col + 1], dp[row + 1][col + 1]) + mine[row][col];
                } else if (row == mine.length - 1) {
                    dp[row][col] = Math.max(dp[row][col + 1], dp[row - 1][col + 1]) + mine[row][col];
                } else {
                    dp[row][col] = Math.max(Math.max(dp[row][col + 1], dp[row - 1][col + 1]), dp[row + 1][col + 1]) + mine[row][col];
                }
            }
        }
        int maxGoldCollected = dp[0][0];
        for (int r = 1; r < dp.length; r++) {
            if (dp[r][0] > maxGoldCollected) {
                maxGoldCollected = dp[r][0];
            }
        }
        return maxGoldCollected;
    }
}
