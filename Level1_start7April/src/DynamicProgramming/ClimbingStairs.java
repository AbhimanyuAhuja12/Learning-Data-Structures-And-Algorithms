package DynamicProgramming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt(); //n

        System.out.println(countPathsThroughRecursion(steps));
        System.out.println(countPathsThroughDPMemoization(steps, new int[steps + 1]));
        System.out.println(countPathsThroughDPTabulation(steps));
    }

    private static int countPathsThroughRecursion(int stepsRemaining) {
        if (stepsRemaining == 0) {
            return 1;
        } else if (stepsRemaining < 0) {
            return 0;
        }

        int pathsFromOneStep = countPathsThroughRecursion(stepsRemaining - 1);
        int pathsFromTwoSteps = countPathsThroughRecursion(stepsRemaining - 2);
        int pathsFromThreeSteps = countPathsThroughRecursion(stepsRemaining - 3);
        int totalPaths = pathsFromOneStep + pathsFromTwoSteps + pathsFromThreeSteps;

        return totalPaths;
    }

    private static int countPathsThroughDPMemoization(int stepsRemaining, int[] dp) {
        if (stepsRemaining == 0) {
            return 1;
        } else if (stepsRemaining < 0) {
            return 0;
        }

        if (dp[stepsRemaining] != 0) {
            return dp[stepsRemaining];
        }

        int pathsFromOneStep = countPathsThroughDPMemoization(stepsRemaining - 1, dp);
        int pathsFromTwoSteps = countPathsThroughDPMemoization(stepsRemaining - 2, dp);
        int pathsFromThreeSteps = countPathsThroughDPMemoization(stepsRemaining - 3, dp);
        int totalPaths = pathsFromOneStep + pathsFromTwoSteps + pathsFromThreeSteps;

        dp[stepsRemaining] = totalPaths;

        return totalPaths;
    }

    private static int countPathsThroughDPTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

}
