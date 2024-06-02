package com.Abhi.Demo;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        System.out.println(factorial(num));
//        System.out.println("FACTORIAL:" +ans);
    }

    static long factorial(long n) {
          long fact=1;
        if (n==0 || n == 1) {
             fact = 1;
        } else {
            while (n > 0) {
                fact = fact * n;
                n--;

            }
        }
        return fact;
    }
}
