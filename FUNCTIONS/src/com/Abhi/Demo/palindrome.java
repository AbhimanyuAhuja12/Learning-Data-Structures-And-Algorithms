package com.Abhi.Demo;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans=ispalindrome(num);
        System.out.println(ans);
    }

    static boolean ispalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;

        }
        if (reverse == temp) {
            return true;
        } else {
            return false;
        }
    }
}
