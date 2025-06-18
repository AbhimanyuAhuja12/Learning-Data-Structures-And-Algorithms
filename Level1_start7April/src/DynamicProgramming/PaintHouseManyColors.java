package DynamicProgramming;

import java.util.Scanner;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no_of_colors = input.nextInt();
        int no_of_houses = input.nextInt();
        int[][] cost = new int[no_of_houses][no_of_colors];
        for(int i=0;i<no_of_houses;i++){
            for (int j = 0; j < no_of_colors; j++) {
                cost[i][j] = input.nextInt();
            }
        }

        System.out.println(findMinCostTab(cost));
        System.out.println(findMinCostTabOptimized(cost));
    }
    private static int findMinCostTab(int[][] cost){
        // its time complexity is O(n^3)
        int[][] dp = new int[cost.length][cost[0].length];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = cost[0][i];
        }
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] =cost[i][j] + minimum(dp,i-1,j);
            }
        }
        return minimum(dp,dp.length-1,-1);
    }
    private static int minimum(int[][] cost , int row , int excludeCol){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<cost[0].length;i++){
            if(i!=excludeCol && min>cost[row][i]){
                min=cost[row][i];
            }
        }
        return min;
    }

    private static int findMinCostTabOptimized(int[][] cost){
        // its time complexity is O(n^2)
        int[][] dp = new int[cost.length][cost[0].length];

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = cost[0][i];
            if(dp[0][i]<=min){
                second_min=min;
                min=dp[0][i];
            }else if(second_min>=dp[0][i]){
                second_min = dp[0][i];
            }
        }

        for(int i=1;i<dp.length;i++){
            int new_min=Integer.MAX_VALUE;
            int new_second_min=Integer.MAX_VALUE;
            for(int j=0;j<dp[0].length;j++){
                if(dp[i-1][j]!=min){
                    dp[i][j] = cost[i][j] + min;
                    if(dp[i][j]<new_min){
                        new_second_min=new_min;
                        new_min=dp[i][j];
                    }else if(dp[i][j]<new_second_min){
                        new_second_min=dp[i][j];
                    }
                }else{
                    dp[i][j] = cost[i][j] + second_min;
                    if(dp[i][j]<new_min){
                        new_second_min=new_min;
                        new_min=dp[i][j];
                    }else if(dp[i][j]<new_second_min){
                        new_second_min=dp[i][j];
                    }
                }
            }
            min = new_min;
            second_min=new_second_min;
        }
        return min;
    }
}
