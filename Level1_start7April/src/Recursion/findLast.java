package Recursion;

import java.util.Scanner;

public class findLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
//        System.out.println(findLastIndex(arr, target, arr.length - 1));
        System.out.println(findLastIndexOtherMethod(arr,target,0));
    }

    private static int findLastIndex(int[] arr, int target, int ptr) {
        if (ptr < 0) return -1;
        if (arr[ptr] == target) {
            return ptr;
        }
        return findLastIndex(arr, target, ptr - 1);
    }

    private static int findLastIndexOtherMethod(int[] arr, int target, int ptr) {
        if (ptr == arr.length) {
            return -1;
        }
       // liisa:-> last index in smaller array
        int liisa = findLastIndexOtherMethod(arr, target, ptr + 1);
        if (arr[ptr] == target && liisa == -1) {
            return ptr;
        } else {
            return liisa;
        }
    }
}
