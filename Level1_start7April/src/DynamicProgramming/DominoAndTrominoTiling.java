package DynamicProgramming;

public class DominoAndTrominoTiling {
    public static void main(String[] args) {

    }
    public int numTilings(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 5;
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = 2* dp[i - 1] + dp[i - 3];
        }
        return dp[n];
    }
}
