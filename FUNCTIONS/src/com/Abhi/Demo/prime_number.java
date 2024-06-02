package com.Abhi.Demo;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(Prime(num));

    }

    static boolean Prime(int num) {
        if (num < 1) {
            return false;
        }
        int c = 2;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;

            }
        return c*c>num;
        }
    }

