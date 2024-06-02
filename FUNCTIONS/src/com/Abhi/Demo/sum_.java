package com.Abhi.Demo;

import java.util.Scanner;

public class sum_ {
    static int sum=0;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers you want sum of: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = input.nextInt();


            int ans = sum(num);


            System.out.println(ans);
        }
    }
    static int sum(int num) {

        sum += num;
        return sum;
    }
}