package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] weights = new int[size];
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            weights[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }
        int capacity = input.nextInt();

        int[][] dp = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        int ans1 = MaximizeValueRec(weights, values, capacity, 0);
        System.out.println(ans1);

        int ans2 = MaximizeValueMem(weights, values, capacity, 0, dp);
        System.out.println(ans2);

        int ans3 = MaximizeValueTab(weights,values,capacity);
        System.out.println(ans3);

    }

    private static int MaximizeValueRec(int[] weights, int[] values, int capacity, int ptr) {
        /*
        TC : O(2^n)(exponentia due to branching at each level)
        SC : O(capacity)
         */
        if (ptr == weights.length) {
            return 0;
        }

        int notIncluded = MaximizeValueRec(weights, values, capacity, ptr + 1);

        int Included = 0;
        if (capacity >= weights[ptr]) {
            Included = values[ptr] + MaximizeValueRec(weights, values, capacity - weights[ptr], ptr);
        }

        return Math.max(notIncluded, Included);
    }

    private static int MaximizeValueMem(int[] weights, int[] values, int capacity, int ptr, int[][] dp) {
         /*
            TC: O(n * capacity)
            SC: O(n * capacity) for DP array + O(capacity) for recursion stack in worst case
         */
        if (ptr == weights.length) {
            return 0;
        }

        if (dp[ptr][capacity] != -1) {
            return dp[ptr][capacity];
        }

        int notIncluded = MaximizeValueMem(weights, values, capacity, ptr + 1, dp);

        int Included = 0;
        if (capacity >= weights[ptr]) {
            Included = values[ptr] + MaximizeValueMem(weights, values, capacity - weights[ptr], ptr, dp);
        }

        dp[ptr][capacity] = Math.max(notIncluded, Included);

        return Math.max(notIncluded, Included);
    }

    private static int MaximizeValueTab(int[] weights , int[] values ,int capacity){
        int[] dp =new int[capacity+1];
        for(int bagc=1;bagc<=capacity;bagc++){
            int max =0;
            for(int i=0;i<weights.length;i++){
                if(weights[i]<=bagc){
                    int rem_bag_cap = bagc - weights[i];
                    int rem_bag_val = dp[rem_bag_cap];
                    int total_bag_val = rem_bag_val + values[i];

                    if(total_bag_val>max){
                        max=total_bag_val;
                    }
                }
            }
            dp[bagc] = max;
        }
        return dp[capacity];
    }
}
