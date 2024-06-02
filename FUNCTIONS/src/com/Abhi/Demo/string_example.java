package com.Abhi.Demo;

import java.util.Scanner;

public class string_example {
    public static void main(String[] args) {
//        System.out.println(greet());
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter your name: ");
//        String naam=input.next();

        System.out.println(mygreet("abhi"));

//        System.out.println(greet);


    }

     static String mygreet(String name) {
         String message="hello " + name;
         return message;
    }

    static String greet(){
             String greeting="how are you";
             return greeting;
//            System.out.println("greeting");

        }
    }

