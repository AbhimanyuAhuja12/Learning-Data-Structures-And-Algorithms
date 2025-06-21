package DynamicProgramming;

import java.util.Scanner;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
        }
        System.out.println(dp[n]);
    }
    private static void FriendsCombination(int[] arr , int index){

    }
}
