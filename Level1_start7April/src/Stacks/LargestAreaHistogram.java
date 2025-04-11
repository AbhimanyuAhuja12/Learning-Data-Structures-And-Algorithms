package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(findLargestArea2(arr, n));
    }

    // O(n^2) approach
    private static int findLargestArea(int[] arr, int length) {
        int area = 0;

        for (int i = 0; i < length; i++) {
            int leftBreadth = 0;
            int rightBreadth = 0;
            for (int left = i - 1; left >= 0; left--) {
                if (arr[left] >= arr[i]) {
                    leftBreadth++;
                } else {
                    break;
                }
            }

            for (int right = i + 1; right < length; right++) {
                if (arr[right] >= arr[i]) {
                    rightBreadth++;
                } else {
                    break;
                }
            }

            int breadth = leftBreadth + rightBreadth + 1;

            area = Math.max(area, (arr[i] * breadth));
        }
        return area;
    }

    private static int findLargestArea2(int[] arr, int length) {
        int[] rb = new int[length];
        Stack<Integer> RightStack = new Stack<>();
        RightStack.push(length - 1);
        rb[length - 1] = length;

        for (int i = length - 2; i >= 0; i--) {
            while (!RightStack.isEmpty() && arr[i] <=  arr[RightStack.peek()]) {
                RightStack.pop();
            }
            if (RightStack.isEmpty()) {
                rb[i] = length;
            } else {
                rb[i] = RightStack.peek();
            }
            RightStack.push(i);
        }

        int[] lb = new int[length];
        Stack<Integer> Leftstack = new Stack<>();
        Leftstack.push(0);
        lb[0] = -1;

        for (int i = 1; i < length; i++) {
            while (!Leftstack.isEmpty() && arr[i] <= arr[Leftstack.peek()]) {
                Leftstack.pop();
            }
            if (Leftstack.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] =Leftstack.peek();
            }
            Leftstack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            int breath = rb[i] - lb[i] - 1;
            int area = arr[i] * breath;

            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}


