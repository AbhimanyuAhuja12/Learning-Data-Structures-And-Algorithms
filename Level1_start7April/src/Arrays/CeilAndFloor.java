package Arrays;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int val = input.nextInt();
        input.close();
        FindCeilAndFloor(arr, val);
    }

    public static void FindCeilAndFloor(int[] arr, int val) {
        Integer ceil = null;
        Integer floor = null;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == val) {
                ceil = val;
                floor = val;
                break;
            } else if (arr[mid] < val) {
                floor = arr[mid]; //potential value for floor
                start = mid + 1;
            } else {
                ceil = arr[mid]; //potential value for ceil
                end = mid - 1;
            }
        }

        System.out.println("ceil:   " + (ceil != null ? ceil : "No ceil found"));
        System.out.println("floor:  " + (floor != null ? floor : "No floor found"));

    }
}
