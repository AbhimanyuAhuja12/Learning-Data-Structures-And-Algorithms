package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();

        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    public static int[] rotate(int[] arr, int k) {
        if (k == 0 || k==arr.length) return arr;
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
