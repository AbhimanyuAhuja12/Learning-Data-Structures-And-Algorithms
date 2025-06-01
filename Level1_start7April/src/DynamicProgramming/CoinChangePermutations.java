package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = input.nextInt();
        }
        int amount = input.nextInt();
        int totalPermutatiosn = generatePermutations(coins, amount, 0);
        System.out.println(totalPermutatiosn);
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = generatePermutationsMemo(coins, amount, 0, dp);
        System.out.println(ans);

        int res = coinChangePermutationsTab(coins,amount);
        System.out.println(res);
    }

    private static int generatePermutations(int[] coins, int amount, int currSum) {
        if (currSum == amount) {
            return 1;
        }
        if (currSum > amount) {
            return 0;
        }
        int totalWays = 0;
        for (int i = 0; i < coins.length; i++) {
            totalWays += generatePermutations(coins, amount, currSum + coins[i]);
        }

        return totalWays;
    }

    private static int generatePermutationsMemo(int[] coins, int amount, int currSum, int[] dp) {
        if (currSum == amount) {
            return 1;
        }
        if (currSum > amount) {
            return 0;
        }
        if (dp[currSum] != -1) {
            return dp[currSum];
        }
        int totalWays = 0;

        for (int i = 0; i < coins.length; i++) {
            totalWays += generatePermutationsMemo(coins, amount, currSum + coins[i], dp);
        }

        dp[currSum] = totalWays;
        return totalWays;
    }

    private static int coinChangePermutationsTab(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length ; j++) {
                if(i>=coins[j]) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }

        return dp[amount];
    }
}