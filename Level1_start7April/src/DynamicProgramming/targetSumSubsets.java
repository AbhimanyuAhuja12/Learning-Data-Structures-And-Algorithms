package DynamicProgramming;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class targetSumSubsets {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
//        int target = input.nextInt();
//
//        generateSubsets(arr, 0, new ArrayList<Integer>());
//        for (ArrayList<Integer> itr : result) {
//            int sum = 0;
//            for (int i : itr) {
//                sum += i;
//            }
//            if (sum == target) {
//                System.out.println(true);
//                return;
//            }
//        }
//        System.out.println(false);
//        return;
//    }
//
//    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//
//    private static void generateSubsets(int[] arr, int ptr, ArrayList<Integer> curr) {
//        if (ptr == arr.length) {
//            result.add(new ArrayList<>(curr));
//            return;
//        }
//
//        curr.add(arr[ptr]);
//        generateSubsets(arr, ptr + 1, curr);
//
//        curr.remove(curr.size() - 1);
//        generateSubsets(arr, ptr + 1, curr);
//    }
//}

import java.util.*;

public class targetSumSubsets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

//        boolean result = isTargetSumSubset(arr, 0, 0, target);
//        System.out.println(result);
        boolean result = targetSumSubsetsTab(arr, target);
        System.out.println(result);
    }

    // Recursive function to check if any subset adds to the target
    private static boolean isTargetSumSubset(int[] arr, int index, int currSum, int target) {
        if (index == arr.length) {
            return currSum == target;
        }

        // Option 1: Include current element
        if (isTargetSumSubset(arr, index + 1, currSum + arr[index], target)) {
            return true;
        }

        // Option 2: Exclude current element
        if (isTargetSumSubset(arr, index + 1, currSum, target)) {
            return true;
        }

        return false;
    }

    private static boolean targetSumSubsetsTab(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];
                        if(j>=val && dp[i-1][j-val]==true){
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        return dp[arr.length][target];
    }
}

