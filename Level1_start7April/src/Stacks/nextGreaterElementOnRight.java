package Stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElementOnRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        findNextGreatest(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void findNextGreatest(int[] arr, int length) {
        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            int current = arr[i];
            if (stack.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = stack.peek();
            }

            stack.push(current);

        }
    }
}


