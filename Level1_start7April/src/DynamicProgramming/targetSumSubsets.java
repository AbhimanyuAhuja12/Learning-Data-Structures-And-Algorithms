package DynamicProgramming;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class targetSumSubsets {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
//        int target = input.nextInt();
//
//        generateSubsets(arr, 0, new ArrayList<Integer>());
//        for (ArrayList<Integer> itr : result) {
//            int sum = 0;
//            for (int i : itr) {
//                sum += i;
//            }
//            if (sum == target) {
//                System.out.println(true);
//                return;
//            }
//        }
//        System.out.println(false);
//        return;
//    }
//
//    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//
//    private static void generateSubsets(int[] arr, int ptr, ArrayList<Integer> curr) {
//        if (ptr == arr.length) {
//            result.add(new ArrayList<>(curr));
//            return;
//        }
//
//        curr.add(arr[ptr]);
//        generateSubsets(arr, ptr + 1, curr);
//
//        curr.remove(curr.size() - 1);
//        generateSubsets(arr, ptr + 1, curr);
//    }
//}

import java.util.*;

public class targetSumSubsets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

        boolean result = isTargetSumSubset(arr, 0, 0, target);
        System.out.println(result);
    }

    // Recursive function to check if any subset adds to the target
    private static boolean isTargetSumSubset(int[] arr, int index, int currSum, int target) {
        if (index == arr.length) {
            return currSum == target;
        }

        // Option 1: Include current element
        if (isTargetSumSubset(arr, index + 1, currSum + arr[index], target)) {
            return true;
        }

        // Option 2: Exclude current element
        if (isTargetSumSubset(arr, index + 1, currSum, target)) {
            return true;
        }

        return false;
    }
}

