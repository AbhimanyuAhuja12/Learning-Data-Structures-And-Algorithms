package com.Abhi.Demo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        int ans = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the operator");
//        char op = input.next().trim().charAt(0);
//        while (true) {
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//                System.out.println("enter two numbers");
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
//                if (op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '%') {
//                    ans = num1 % num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 + num2;
//                    }
//                }
//            } else if (op == 'x' || op == 'X') {
//                break;
//            } else {
//                System.out.println("invalid operation");
//            }
//            System.out.println(ans);
//
//        }
//    }
//}
    Scanner input = new Scanner(System.in);
    // Take input from user till user does not press X or x
    int ans = 0;
        while (true) {
                // take the operator as input
                System.out.print("Enter the operator: ");
                char op = input.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                ans = num1 + num2;
                }
                if (op == '-') {
                ans = num1 - num2;
                }
                if (op == '*') {
                ans = num1 * num2;
                }
                if (op == '/') {
                if (num2 != 0) {
                ans = num1 / num2;
                }
                }
                if (op == '%') {
                ans = num1 % num2;
                }
                } else if (op == 'x' || op == 'X') {
                break;
                } else {
                System.out.println("Invalid operation!!");
                }
                System.out.println(ans);
                }
}
}