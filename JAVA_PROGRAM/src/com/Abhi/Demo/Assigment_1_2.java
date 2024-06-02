package com.Abhi.Demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class Assigment_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

////       ques----Factorial Program In Java
//        int fact=1;
//        System.out.println("enter the number: ");
//        int num = input.nextInt();
//        if (num == 0 || num == 1) {
//            fact = 1;
//            System.out.println("factorial: "+ fact);
//        } else {
//            for (int i = num; i >= 1; i--) {
//                fact = fact * i;
//            }
//            System.out.println("factorial: "+fact);
//        }



//        Ques--Calculate Average Of N Numbers
//        int sum=0;
//        int count=0;
//        while(true) {
//            System.out.println("enter the number: ");
//            int num = input.nextInt();
//            if (num > 0) {
//                sum = sum + num;
//                count++;
//            } else {
//                break;
//            }
//        }
//             int Average= sum/count;
//             System.out.println("Average is : " +Average);

///ques----Calculate Discount Of Product
//        double discount;
//        System.out.println("enter the mrp of product: ");
//double price= input.nextDouble();
//if(price<500){
//    discount=price*0.10;
//    price=price - discount;
//}
//else if(price>500&& price<1000){
//    discount=  price * 0.15;
//    price= price-discount;
//}
//else if(price>1000&& price<2000) {
//    discount = price * 0.20;
//    price = price - discount;
//}
//else if(price>2000&& price<3500){
//    discount=  price * 0.25;
//    price= price-discount;
//} else{
//    discount=  price * 0.35;
//    price= price-discount;
//}
//        System.out.println("price after discount: " +price);




////        ques---Calculate Distance Between Two Points
//        System.out.println("enter x1: ");
//        int x1= input.nextInt();
//        System.out.println("enter y1: ");
//        int y1= input.nextInt();
//        System.out.println("enter x2: ");
//        int x2= input.nextInt();
//        System.out.println("enter y2: ");
//        int y2= input.nextInt();
//        int dist=((x2-x1)^2+(y2-y1)^2)^1/2;
//        System.out.println("distance :  "+ dist);





//        ques----Reverse A String In Java
//        String str= "Geeks";
////        StringBuilder x= new StringBuilder(" ");
//        []
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//
//        for (int i=str.length()-1;i>=0; i--)
//        {
//            ch[]= str.charAt(i); //extracts each character
////            x.insert(ch); //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ch);





//        ques--Armstrong Number In Java(153----1^3+5^3+3^3=153{sum of the cubes of each digit is equal to the number itself})

        System.out.println("enter the number");
        long num=input.nextInt();

        long sum=0;
        long temp=num;
        if(num<10){
            System.out.println("It's an armstrong number");
        }
        else{
            while(num>0) {
                long rem = num % 10;
                rem = (rem*rem*rem);
                sum=sum+rem;
                num=num/10;
            }
        }
        System.out.println("sum:"+sum);
        if(sum==temp){
                System.out.println("it's an armstrong number");}

            else{
                        System.out.println("not a armstrong number");


            }



        }




}



