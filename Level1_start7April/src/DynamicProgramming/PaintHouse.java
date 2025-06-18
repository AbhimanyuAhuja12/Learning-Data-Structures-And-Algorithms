package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        // we have paint house such that no adjacent house should be painted in same color
        // we will only get 3 colors red,blue,green and also we have to minimize the cost
        Scanner input = new Scanner(System.in);
        int no_of_houses = input.nextInt();

        int[][] color_cost = new int[3][no_of_houses];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < no_of_houses; j++) {
                color_cost[i][j] = input.nextInt();
            }
        }
        input.close();

        System.out.println(findMinCostToPaintHouse(color_cost, no_of_houses));
        System.out.println(MinCostRec(color_cost,0,-1));
    }


    private static int MinCostRec(int[][] cost , int col , int lastColor) {

        if (col > cost[0].length - 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;

        for (int color = 0; color < 3; color++) {
            if (color != lastColor) {
                int currCost = cost[color][col] + MinCostRec(cost, col + 1, color);
                min = Math.min(min, currCost);
            }
        }
        return min;
    }

    private static int findMinCostToPaintHouse(int[][] cost, int no_of_houses) {
        int red = cost[0][0];
        int blue = cost[1][0];
        int green = cost[2][0];

        for (int i = 1; i < no_of_houses; i++) {
           int newRed = cost[0][i] + Math.min(blue,green);
           int newBLue = cost[1][i] + Math.min(green,red);
           int newGreen = cost[2][i] + Math.min(blue,red);

           red=newRed;
           blue=newBLue;
           green=newGreen;
        }

        return Math.min(Math.min(red,blue),green);
    }

    private static void minCost(int costs[][], int N) {

        // Corner Case
        if (N == 0)
            return;

        // Auxiliary 2D dp array
        int dp[][] = new int[N][3];

        // Base Case
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        for (int i = 1; i < N; i++) {

            // If current house is colored
            // with red the take min cost of
            // previous houses colored with
            // (blue and green)
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2])
                    + costs[i][0];

            // If current house is colored
            // with blue the take min cost of
            // previous houses colored with
            // (red and green)
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2])
                    + costs[i][1];

            // If current house is colored
            // with green the take min cost of
            // previous houses colored with
            // (red and blue)
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1])
                    + costs[i][2];
        }

        // Print the min cost of the
        // last painted house
        System.out.println(
                Math.min(dp[N - 1][0],
                        Math.min(dp[N - 1][1], dp[N - 1][2])));
    }

}
