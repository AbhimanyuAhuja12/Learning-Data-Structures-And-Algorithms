package Stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        System.out.println(Arrays.toString(findSlidingWindowMax(arr, k)));

    }

    private static int[] findSlidingWindowMax(int[] arr, int k) {
        int n = arr.length;
        if (k <= 0 || k > n) {
            return new int[0]; // Handle edge cases
        }
        int[] ans = new int[n - k + 1];
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[n];
        stack.push(n - 1);
        nge[n - 1] = n;

        // Next Greater Element (NGE) calculation
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) { // Corrected condition to handle duplicates
                stack.pop();
            }
            if (stack.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(i);
        }

        int j = 0;
        for (int i = 0; i <= n - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            ans[i] = arr[j];
        }
        return ans;
    }
}