package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        int[] jumps = new int[steps];
        for (int i = 0; i < steps; i++) {
            jumps[i] = scanner.nextInt();
        }

        Integer[] dp = new Integer[steps + 1];
        dp[steps] = 0;

        for (int i = steps - 1; i >= 0; i--) {
            if (jumps[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= jumps[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }

        System.out.println(dp[0]);
        System.out.println(findMinMovesThroughRecursion(jumps,0));
    }



    private static int findMinMovesThroughRecursion(int[] jumps, int floor) {
        if (floor == jumps.length) {
            return 0;
        }
        if(floor>jumps.length){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= jumps[floor]; i++) {
            int rec = findMinMovesThroughRecursion(jumps, floor + i);
            if(rec!=Integer.MAX_VALUE){
                min = Math.min(min,rec+1);
            }
        }
       return min;
    }

    private static int findMinMovesMemo(int[] jumps, int floor, Integer[] dp) {
        if (floor == jumps.length) return 0;                // Reached end
        if (floor > jumps.length) return Integer.MAX_VALUE; // Overshot

        if (dp[floor] != null) return dp[floor];            // Memoized result

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= jumps[floor]; i++) {
            int rec = findMinMovesMemo(jumps, floor + i, dp);
            if (rec != Integer.MAX_VALUE) {
                min = Math.min(min, rec + 1);
            }
        }

        dp[floor] = min;  // Store result
        return dp[floor];
    }

}
