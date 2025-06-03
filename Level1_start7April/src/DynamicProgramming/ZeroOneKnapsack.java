package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class ZeroOneKnapsack {
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
        int[][] dp = new int[size + 1][capacity + 1];
        for (int i = 0; i <= size; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans1 = MaximizeTheValueRec(weights, values, capacity, 0);
        int ans2 = MaximizeTheValueRec2(weights, values, capacity, 0, 0, 0);
        int ans3 = MaximizeTheValueMemo(weights, values, capacity, 0, dp);
        int ans4 = MaximizeTheValueTab(weights,values,capacity);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }

    private static int MaximizeTheValueRec(int[] weights, int[] values, int capacity, int ptr) {
        //base conditions
        if (ptr == weights.length) {
            return 0;
        }

        int notIncluded = MaximizeTheValueRec(weights, values, capacity, ptr + 1);
        int Included = 0;
        if (weights[ptr] <= capacity) {
            Included = values[ptr] + MaximizeTheValueRec(weights, values, capacity - weights[ptr], ptr + 1);
        }

        return Math.max(Included, notIncluded);
    }

    private static int MaximizeTheValueRec2(int[] weights, int[] values, int capacity, int ptr, int curr_val, int curr_weight) {
        // 🛑 Base Case: if over capacity, invalid path
        if (curr_weight > capacity) {
            return 0;
        }

        // ✅ Base Case: all items considered
        if (ptr == weights.length) {
            return curr_val;
        }

        // 💡 Option 1: Include current item (only if it doesn’t exceed capacity)
        int included = MaximizeTheValueRec2(weights, values, capacity, ptr + 1, curr_val + values[ptr], curr_weight + weights[ptr]);

        // 💡 Option 2: Don’t include current item
        int notIncluded = MaximizeTheValueRec2(weights, values, capacity, ptr + 1, curr_val, curr_weight);

        return Math.max(included, notIncluded);
    }

    private static int MaximizeTheValueMemo(int[] weights, int[] values, int capacity, int ptr, int[][] dp) {
        //base conditions
        if (ptr == weights.length) {
            return 0;
        }

        if (dp[ptr][capacity] != -1) {
            return dp[ptr][capacity];
        }

        int notIncluded = MaximizeTheValueMemo(weights, values, capacity, ptr + 1, dp);

        int Included = 0;
        if (weights[ptr] <= capacity) {
            Included = values[ptr] + MaximizeTheValueMemo(weights, values, capacity - weights[ptr], ptr + 1, dp);
        }

        dp[ptr][capacity] = Math.max(Included, notIncluded);

        return Math.max(Included, notIncluded);
    }


    private static int MaximizeTheValueTab(int[] weights, int[] values, int capacity) {
        int[][] dp = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                    if(weights[i-1]<=j){
                        int remCapacity = j - weights[i-1];
                        dp[i][j] =Math.max(dp[i-1][j],values[i-1] + dp[i-1][remCapacity]) ;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
        }
        return dp[dp.length-1][capacity];
    }
}
