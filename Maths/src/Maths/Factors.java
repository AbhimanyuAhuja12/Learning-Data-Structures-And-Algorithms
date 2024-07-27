package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        findFactors(N);
        System.out.println();
        findFactorsSorted(N);
    }

    public static void findFactors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }

    }

    public static void findFactorsSorted(int n) {
        ArrayList<Integer> curr = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+ " ");
                    curr.add(n / i);
                }
            }
        }
        for (int i = curr.size() - 1; i >= 0; i--) {
            System.out.print(curr.get(i)+" ");
        }
    }
}
