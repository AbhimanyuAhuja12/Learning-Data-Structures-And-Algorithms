package Stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int[] prices = new int[days];
        for (int i = 0; i < days; i++) {
            prices[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(findSpan(prices, days)));
    }

    public static int[] findSpan(int[] arr, int n) {
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                span[i] = i - stack.peek();
            } else {
                span[i] = i + 1;
            }

            stack.push(i);
        }
        return span;
    }
}
