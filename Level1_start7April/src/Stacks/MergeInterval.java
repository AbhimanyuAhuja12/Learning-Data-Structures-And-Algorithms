package stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }

       int[][] Ans = (mergeOverlappingIntervals(arr));
        for (int i = 0; i <Ans.length ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print( Ans[i][j]+ " ");
            }
            System.out.println();

        }
    }

    private static int[][] mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(a -> a[0]));

    }
}
