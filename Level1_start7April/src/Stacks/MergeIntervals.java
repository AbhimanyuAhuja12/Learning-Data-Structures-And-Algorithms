package Stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int[][] Ans = (mergeOverlappingIntervals(arr));
        for (int i = 0; i < Ans.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static int[][] mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(a -> a[0]));
        Stack<int[]> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] top = stack.peek();
            int[] curr = arr[i];

            if (top[1] < curr[0]) {
                stack.push(curr);
            } else {
                top[1] = Math.max(top[1], curr[1]);
            }
        }

        int[][] result = new int[stack.size()][2];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}

