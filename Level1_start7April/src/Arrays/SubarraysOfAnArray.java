package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarraysOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(generateAllSubarray(arr));
        printAllSubarrays(arr);
    }

    public static ArrayList<ArrayList<Integer>> generateAllSubarray(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> currList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                currList.add(arr[j]);
                list.add(new ArrayList<>(currList));
            }
        }
        return list;
    }

    public static void printAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] +"\t");
                }
                System.out.println();
            }
        }
    }
}
