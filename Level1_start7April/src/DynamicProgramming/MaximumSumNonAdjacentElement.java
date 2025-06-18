package DynamicProgramming;

import java.util.Scanner;

public class MaximumSumNonAdjacentElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        input.close();
        int[] dp = new int[values.length+1];
        for(int i =0;i<dp.length;i++){
            dp[i] =-1;
        }
        System.out.println(MaximumSumRec(values, 0, false));
        System.out.println(MaximumSumMemo(values,0,dp));
    }

    private static int MaximumSumRec(int[] arr, int index, boolean prevIncluded) {
        if (index == arr.length) {
            return 0;
        }
        if (prevIncluded) {
            return MaximumSumRec(arr, index + 1, false);
        } else {
            int include = arr[index] + MaximumSumRec(arr, index + 1, true);

            int exclude = MaximumSumRec(arr, index + 1, false);

            return Math.max(include, exclude);
        }
    }
    public static int MaximumSumRec2(int[] arr, int index) {
        // Base Case: when index is out of bounds
        if (index >= arr.length) return 0;

        // Choice 1: Include current element and skip next
        int include = arr[index] + MaximumSumRec2(arr, index + 2);

        // Choice 2: Exclude current element and move to next
        int exclude = MaximumSumRec2(arr, index + 1);

        // Return max of including or excluding
        return Math.max(include, exclude);
    }

    public static int MaximumSumMemo(int[] arr, int index,int[] dp) {
        if (index >= arr.length) return 0;

        if(dp[index]!=-1){
            return dp[index];
        }

        int include = arr[index] + MaximumSumMemo(arr, index + 2,dp);

        int exclude = MaximumSumMemo(arr, index + 1 , dp);

        dp[index]= Math.max(include,exclude);
        return dp[index];
    }
}
