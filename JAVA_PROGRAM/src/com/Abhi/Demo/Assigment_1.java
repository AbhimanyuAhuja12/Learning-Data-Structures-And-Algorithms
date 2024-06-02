package com.Abhi.Demo;

import java.util.Scanner;

public class Assigment_1 {
    public static void main(String[] args) {
//      Even odd problem
//        System.out.println("enter the number");
//        Scanner input = new Scanner(System.in);
//         int num=input.nextInt();
//         if(num%2==0){
//             System.out.println("even number");
//         }
//         else{
//             System.out.println("odd number");
//         }
//        Taking input as name and print greeting message
//        System.out.println("enter your name");
//        Scanner input = new Scanner(System.in);
//        String name=input.nextLine();
//        System.out.println("Welcome to the bootcamp " + name);

//        Calculating Simple INtrest

//        System.out.println("enter the principal Amount: ");
//        Scanner input = new Scanner(System.in);
//        float principal_amount=input.nextFloat();
//        System.out.println("enter the Rate of intrest: ");
//        float Rate=input.nextFloat();
//        System.out.println("enter the Time period in years : ");
//        float Time_period=input.nextFloat();
//        float SI=(principal_amount*Rate*Time_period)/100;
//        System.out.println("Simple intrest is :" + SI);


//        System.out.println("enter first number");
//        Scanner input = new Scanner(System.in);
//         int num1=input.nextInt();
//        System.out.println("enter second number");
//        int num2=input.nextInt();
//        System.out.println("Enter operators(+,-,*,/)");
//        char operator= input.next().charAt(0);
//        float add = num1+num2;
//        float sub= num1-num2;
//        float multiplication=num1*num2;
//        float division=num1/num2;
//
//        if(operator=='+'){
//            System.out.println(add);
//        }
//        if(operator=='-'){
//            System.out.println(sub);
//        }
//        if(operator=='*'){
//            System.out.println(multiplication);
//        }
//        else{
//            System.out.println(division);
//        }


//        calculating fibonacci series upto n numbers
//        System.out.println("Enter the number you want fibonacci of:");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int i, first_term=0,second_term=1;
//        for (i = 2; i < num; i++) {
//           int Fib=first_term+second_term;
//           first_term=second_term;
//           second_term=Fib;

//  System.out.println(Fib);

//int a=0,b=1,c, count=2;
//while(count<=num){
////    int temp=b;
//    c=a+b;
//    a=b;
//    b=c;
//    count++;
////    System.out.println(c);
//
//  }
//System.out.println(b);
//        }

//     ques----   Take integer inputs till the user enters 0 and print the sum of all numbers
//        Scanner input = new Scanner(System.in);
//        int sum=0;
//        while(true){
//            int num = input.nextInt();
//            if(num==0) {
//                break;
//            }
//            sum+=num;
//            System.out.println("sum:" + sum);
//        }



//ques----Take integer inputs till the user enters 0 and print the largest number from all.
    Scanner input = new Scanner(System.in);
    int num;
    int max=0;
    while(true) {
        System.out.println("enter the number: ");
        num = input.nextInt();
        if (num == 0) {
            System.out.println("program ended");
            break;
        }
        if (num > max) {
            max = num;
        }
    } System.out.println( "largest number is : " + max);


    }
}
