package com.Abhi.Demo;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

