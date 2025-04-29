package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

        System.out.println(Arrays.toString(findIndexes(arr, target)));
    }

    private static int[] findIndexes(int[] arr, int target) {
        return new int[]{findIndexFromStart(arr, target), findIndexFromLast(arr, target)};
    }

    private static int findIndexFromStart(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    private static int findIndexFromLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return index;
    }
}
