package com.Abhi.Demo;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        /* SYNTAX for functions
        access modifiers return_type name(){
              body
         }
         return statement;
         */
//        sum();//function call
         int ans=sum2(20,45);
        System.out.println("answer:" +ans);
//        greeting();
    }
    //if we want to pass arguments inside the function, so you can pass values inside the function when you are calling it
    static int sum2(int a, int b){
        int sum=a+b;
        return sum;
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number ");
        int num1 = input.nextInt();
        System.out.println("enter second number ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
//        System.out.println("sum: " + sum);
        return sum;

    }
    static void greeting(){
        System.out.println("hello world");
    }
}