package DynamicProgramming;

import java.util.Scanner;

public class PainFence {
    public static void main(String[] args) {
        /*
        Given a fence with n posts and k colors, the task is to find out the
        number of ways of painting the fence so that not more than
        two consecutive posts have the same color.
         */
        Scanner input = new Scanner(System.in);
        int no_of_fence = input.nextInt();   //n
        int no_of_colors = input.nextInt();  //k
        input.close();
        int n = no_of_fence;
        int k = no_of_colors;

        // tabulation (iteration dp)
        long same = no_of_colors * 1;  //(k*1)
        long different = no_of_colors * (no_of_colors - 1);  //k*(k-1)
        long total = same + different;

        for (int i = 3; i <= no_of_fence; i++) {
            same = different * 1;
            different = total * (no_of_colors - 1);
            total = same + different;
        }
        System.out.println(total);
        System.out.println(CounWaysRecHelper(n, k));

        // Start from fence 0 with no previous color (-1)
        System.out.println(CountWaysRec2(0, -1, 0, n, k));
    }

    private static int CounWaysRecHelper(int n, int k) {
        if (n == 0 || k == 0) return 0;
        if (n == 1) return 1;

        // Start from fence 0 with no previous color (-1)
        System.out.println(CountWaysRec2(0, -1, 0, n, k));

        System.out.println(CountWayRec3(n,k));

        // first fence we have all the options , so we have to multiply K choices
        int ans = k * CountWaysRec(n - 1, k, 0, 0);
        return ans;
    }

    private static int CountWaysRec(int n, int k, int index, int sameColor) {
        if (index == n) {
            return 1;
        }
        int totalWays = 0;

        if (sameColor == 1) {
            // if sameColor == 1 means previous 2 fences have same color
            // Can only paint different color (k - 1 choices)
            totalWays += (k - 1) * CountWaysRec(n, k, index + 1, 0);
        } else {
            // previous 2 fences have different colors
            // now to paint next fence we have 2 options to paint it differently
            // from the last fence color or same paint color as last fence

            // here we are doing same color , so we have only one choice
            totalWays += CountWaysRec(n, k, index + 1, 1);

            // now we are exploring different colors so we have (k-1) choices
            totalWays += (k - 1) * CountWaysRec(n, k, index + 1, 0);

        }
        return totalWays;
    }

    private static int CountWaysRec2(int index, int prevColor, int sameCount, int n, int k) {
        if (index == n) return 1; // all fences painted

        int totalWays = 0;

        // Try every color (0 to k-1)
        for (int color = 0; color < k; color++) {
            if (color == prevColor) {
                // Only allowed if we haven't used it twice in a row
                if (sameCount < 2) {
                    totalWays += CountWaysRec2(index + 1, color, sameCount + 1, n, k);
                }
            } else {
                // Different color: reset sameCount
                totalWays += CountWaysRec2(index + 1, color, 1, n, k);
            }
        }

        return totalWays;
    }

    private static int CountWayRec3(int n, int k) {

        // base cases
        if (n == 1) return k;
        if (n == 2) return k * k;

        // Ways in which last fence
        // is of different color.
        int cnt1 = CountWayRec3(n - 1, k) * (k - 1);

        // Ways in which last 2 fences
        // are of same color.
        int cnt2 = CountWayRec3(n - 2, k) * (k - 1);

        return cnt1 + cnt2;
    }

    private static int countWaysMemo(int n, int k, int[] memo) {

        // base cases
        if (n == 1) return k;
        if (n == 2) return k * k;

        if (memo[n] != -1) return memo[n];

        // Ways in which last fence
        // is of different color.
        int cnt1 = countWaysMemo(n - 1, k, memo) * (k - 1);

        // Ways in which last 2 fences
        // are of same color.
        int cnt2 = countWaysMemo(n - 2, k, memo) * (k - 1);

        return memo[n] = cnt1 + cnt2;
    }
}
