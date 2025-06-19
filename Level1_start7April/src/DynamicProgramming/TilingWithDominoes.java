package DynamicProgramming;

import java.util.Scanner;

public class TilingWithDominoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
    static int countRecur(int n, int[] memo) {

        // Base Case: invalid n
        if (n < 0) return 0;

        // Base case: valid n
        if (n == 0) return 1;

        // If value is memoized
        if (memo[n] != -1) return memo[n];

        int ans = 0;

        // count ways if one tile
        // is placed vertically
        ans = countRecur(n - 1, memo);

        // count ways if two tiles
        // are placed horizontally.
        ans += countRecur(n - 2, memo);

        return memo[n] = ans;
    }
}
