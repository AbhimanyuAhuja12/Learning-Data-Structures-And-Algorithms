package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PI(n,1);
        PI(n);
    }
    //with signature change
    public static void PI(int n , int start){
        if(start>n) return;
        System.out.print(start + "\t");
        PI(n,start+1);
    }

    // without signature change
    public static void PI(int n){
        if(n==0) return;
        PI(n-1);
        System.out.println(n);
    }
}
