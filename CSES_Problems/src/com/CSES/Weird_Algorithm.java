package com.CSES;

import java.util.Scanner;

public class Weird_Algorithm {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n=(n*3)+1;
            }
            System.out.println(n);
        }
    }
}
