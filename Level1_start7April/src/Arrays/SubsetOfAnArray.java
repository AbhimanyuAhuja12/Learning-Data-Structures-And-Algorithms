package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        printAllSubsets(arr);
    }

    public static void printAllSubsets(int[] arr) {
        int limit = (int) Math.pow(arr.length, 2);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);

        }
    }
}
