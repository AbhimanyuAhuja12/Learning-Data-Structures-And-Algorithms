package com.Abhi.Demo;



public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        //a=20;
        //b=10;
        //for swapping, we use third variable
        //temp=a;
        //a=b;
        //b=temp;
        swap(a, b);
        System.out.println(a+" "+b);
    }
static void swap(int a, int b){
     int temp= a;
     a=  b;
     b=temp;
}
}
