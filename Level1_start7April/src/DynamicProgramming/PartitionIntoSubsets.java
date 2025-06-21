package DynamicProgramming;

import java.util.Scanner;

public class PartitionIntoSubsets {
    public static void main(String[] args) {
        /*
        Given two numbers n and k where n represents a number of elements in a set,
        find a number of ways to partition the set into k subsets.
        */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        if (n == 0 || k == 0 || n < k) {
            System.out.println(0);
            return;
        }
        long[][] dp = new long[k + 1][n + 1];

        for (int teams = 1; teams <= k; teams++) {
            for (int players = 1; players <= n; players++) {
                if (players < teams) {
                    dp[teams][players] = 0;
                } else if (teams == players) {
                    dp[teams][players] = 1;
                } else {
                    dp[teams][players] = dp[teams - 1][players - 1] + dp[teams][players - 1] * teams;
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}
