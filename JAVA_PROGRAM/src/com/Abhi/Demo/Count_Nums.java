package com.Abhi.Demo;

public class Count_Nums {
    public static void main(String[] args) {

// first you have to find the remainder of n by 10 which will give you last value of n, than compare it with
//        if true, count will be added
//        and then n will be divided by 10 for removing the last value
        int n=7865432;
//    int count=0;
//    while(n>0) {
//        int rem = n % 10;//last_value will be stored in the rem variable
//        if (rem == 3) {
//            count++;
//        }n=n/10;
//    }
//        System.out.println(count);
//    }

//        Reverse of number ques

//        int reverse;
//        while (n > 0) {
//            int rem = n % 10;
//            reverse = rem;
//            n=n/10;
//
//            System.out.print(reverse);
//        }

        int reverse=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            reverse=reverse*10+ rem;
        }
        System.out.println(reverse);
    }
}
