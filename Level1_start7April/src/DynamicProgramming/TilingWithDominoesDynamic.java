package DynamicProgramming;

import java.util.Scanner;

public class TilingWithDominoesDynamic {
    public static void main(String[] args) {
        // we will get M*N floor dimensions and M*1 tile dimensions
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] dp = new int[n + 1];

        for (int i = 1; i < n; i++) {
            if (i < m) {
                dp[i] = 1;
            } else if (i == m) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }
        System.out.println(dp[n]);
    }
}
