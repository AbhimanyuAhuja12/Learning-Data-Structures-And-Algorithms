package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = input.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= jumps[i] && i + j < dp.length; j++) {
                dp[i] += dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }


    public static int countWaysThroughRecursion(int[] jumps, int idx) {
        int n = jumps.length;
        if (idx == n) return 1;          // Reached the top
        if (idx > n) return 0;           // Out of bounds

        int totalWays = 0;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            totalWays += countWaysThroughRecursion(jumps, idx + jump);
        }

        return totalWays;
    }

    public static int countWaysMemo(int[] jumps, int idx, Integer[] dp) {
        int n = jumps.length;
        if (idx == n) return 1;
        if (idx > n) return 0;

        if (dp[idx] != null) return dp[idx];

        int totalWays = 0;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            totalWays += countWaysMemo(jumps, idx + jump, dp);
        }

        dp[idx] = totalWays;
        return totalWays;
    }

}
