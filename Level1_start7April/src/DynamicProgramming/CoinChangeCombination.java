package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

        // recursion
        int res = coinChangeCombinationRec(arr, 0, target, 0);
        System.out.println(res);

        //Memo
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(coinChangeCombinationMemo(arr, 0, target, 0, dp));
        System.out.println(coinChangeCombinationTab(arr, target));
    }

    private static int coinChangeCombinationRec(int[] arr, int ptr, int target, int currSum) {
        if (currSum == target) {
            return 1;
        }
        if (ptr == arr.length || currSum > target) {
            return 0;
        }

        int notIncluded = coinChangeCombinationRec(arr, ptr + 1, target, currSum);

        int Included = coinChangeCombinationRec(arr, ptr, target, currSum + arr[ptr]);

        int ans = notIncluded + Included;

        return ans;
    }

    private static int coinChangeCombinationMemo(int[] arr, int ptr, int target, int currSum, int[][] dp) {
        if (currSum == target) {
            return 1;
        }
        if (ptr == arr.length || currSum > target) {
            return 0;
        }

        if (dp[ptr][currSum] != -1) {
            return dp[ptr][currSum];
        }

        int notIncluded = coinChangeCombinationMemo(arr, ptr + 1, target, currSum, dp);

        int Included = coinChangeCombinationMemo(arr, ptr, target, currSum + arr[ptr], dp);

        dp[ptr][currSum] = notIncluded + Included;

        return dp[ptr][currSum];
    }


    private static int coinChangeCombinationTab(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
