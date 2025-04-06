package FunctionsAndArrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //we have to find the max element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");

                }
            }
            System.out.println();
        }
        input.close();
    }

}
