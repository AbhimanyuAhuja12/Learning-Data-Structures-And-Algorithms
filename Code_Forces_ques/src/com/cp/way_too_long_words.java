package com.cp;


import java.util.Scanner;

public class way_too_long_words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <=n; i++) {
            String str = input.nextLine();
            int length = str.length();
            if (length < 10) {
                System.out.println(str);
            } else {
                System.out.println(str.charAt(0) +String.valueOf (length - 2) + str.charAt(length - 1));
            }
        }
    }
}

