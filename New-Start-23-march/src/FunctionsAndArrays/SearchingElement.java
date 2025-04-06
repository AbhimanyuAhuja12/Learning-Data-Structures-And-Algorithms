package FunctionsAndArrays;

import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + "elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        boolean isSorted = isArraySorted(arr, n);
        System.out.println("Which element you want to find");
        int target = input.nextInt();
        int ans = 0;
        if (isSorted) {
            ans = findElementThroughBinarySearch(target, arr, n);
        } else {
            ans = findElementThroughLinearSearch(target, arr, n);
        }

        if (ans >= 0) {
            System.out.println("Your element is present at index:" + ans);
        } else {
            System.out.println("Your element is not present in the Array");
        }
    }

    private static boolean isArraySorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static int findElementThroughLinearSearch(int target, int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int findElementThroughBinarySearch(int target, int[] arr, int length) {
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
