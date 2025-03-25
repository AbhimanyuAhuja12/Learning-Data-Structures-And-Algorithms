package Basics;

import java.util.Scanner;

public class printingFibonacciTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        if (N <= 0) return;

        int firstFib = 0;
        int secFib = 1;

        if (N == 1) {
            System.out.println(firstFib);
            return;
        }

        System.out.print(firstFib + "," + secFib);


        for (int i = 2; i < N; i++) {
            int nextFib = firstFib + secFib;
            System.out.print("," + nextFib);
            firstFib = secFib;
            secFib = nextFib;

        }
    }

    /*
    // Naïve recursive function (O(2^N))
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    */


}
