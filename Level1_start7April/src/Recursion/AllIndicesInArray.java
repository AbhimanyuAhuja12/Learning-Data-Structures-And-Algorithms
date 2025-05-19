package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllIndicesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

        // System.out.println(generateAllIndices(arr, target, 0, result));
        System.out.println(Arrays.toString(allIndices(arr,target,0,0)));
    }

    private static ArrayList<Integer> generateAllIndices(int[] arr, int target, int ptr, ArrayList<Integer> result) {
        if (ptr == arr.length) return result;
        if (arr[ptr] == target) {
            result.add(ptr);
        }
        return generateAllIndices(arr, target, ptr + 1, result);
    }

    private static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}
