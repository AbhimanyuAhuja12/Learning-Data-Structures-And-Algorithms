package Recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PZZ(n);
    }
    private static void PZZ(int n){
        if(n==0){
            return;
        }
        System.out.println("PRE\t"+n);
        PZZ(n-1);
        System.out.println("IN\t"+n);
        PZZ(n-1);
        System.out.println("POST "+n);
    }
}
