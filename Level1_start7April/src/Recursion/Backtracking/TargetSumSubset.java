package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int targetSum = scanner.nextInt();
        ArrayList<Integer> curr = new ArrayList<>();
        findSubsets(arr, 0, targetSum, 0, curr);
        //printTargetSumSubsets(arr,0,targetSum,0,"");

    }

    private static void findSubsets(int[] arr, int ptr, int targetSum, int currentSum, ArrayList<Integer> curr) {
        if (currentSum > targetSum) {
            return; // pruning: no need to continue
        }

        if (ptr == arr.length) {
            if (currentSum == targetSum) {
                System.out.println(curr);
            }
            return;
        }

        // Include current element
        curr.add(arr[ptr]);
        findSubsets(arr, ptr + 1, targetSum, currentSum + arr[ptr], curr);

        // Exclude current element (backtrack)
        curr.remove(curr.size() - 1);
        findSubsets(arr, ptr + 1, targetSum, currentSum, curr);
    }


    private static void printTargetSumSubsets(int[] arr, int idx, int targetSum, int SumSoFar, String set) {
        if (idx == arr.length) {
            if (targetSum == SumSoFar) {
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, targetSum, SumSoFar + arr[idx], set + arr[idx] + ",");
        printTargetSumSubsets(arr, idx + 1, targetSum, SumSoFar, set);
    }
}
