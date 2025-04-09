package Stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/*
 - ans +
 pop ans push :-rule
 */

public class nextSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(findNextSmallest2(arr, n)));
    }

    public static int[] findNextSmallest(int[] arr, int n) {
        // in this code we have started from end
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n - 1]);
        nse[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) nse[i] = stack.peek();
            else nse[i] = -1;

            stack.push(arr[i]);
        }

        return nse;
    }

    // now we will start from front
    public static int[] findNextSmallest2(int[] arr, int n) {
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int pos = stack.peek();
                nse[pos] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int pos = stack.peek();
            nse[pos] = -1;
            stack.pop();
        }

        return nse;
    }
}
