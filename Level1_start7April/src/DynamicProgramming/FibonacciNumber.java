package DynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(fibMemoization(n , new int[n+1]));
    }
    private static int fibMemoization(int n , int[]qb){
        //qb  - question bank
        if(n==0 || n==1){
            return n;
        }
        //dp
        if (qb[n]!=0){
            return qb[n];
        }

        int fib1 = fibMemoization(n-1,qb);
        int fib2 =fibMemoization(n-2,qb);
        int fibN = fib1 + fib2;

        //store(memoize) it in dp array
        qb[n] = fibN;
        return fibN;
    }
}
