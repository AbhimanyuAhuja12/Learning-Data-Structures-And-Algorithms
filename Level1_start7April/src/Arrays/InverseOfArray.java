package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(inverseArrayWithoutExtraSpace(arr)));
    }

    public static int[] inverseArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            res[val] = i;
        }

        return res;
    }

    public static int[] inverseArrayWithoutExtraSpace(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int val = arr[i] % n;
            arr[val] = arr[val] + (i * n);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

        return arr;
    }
}
