package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of disks");
        int n = input.nextInt();
        System.out.println("Enter IDS of 3 towers");
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
        // we have to print the instructions to put all the disks from t1 to t2
        // disks should be in ascending order

        PrintInstructions(n,t1,t2,t3);
    }private static void PrintInstructions(int n , int A , int B , int C){
        if(n==0)return;
        PrintInstructions(n-1,A,C,B);
        System.out.println(n+"[" + A + "->" + B + "]");
        PrintInstructions(n-1,C,B,A);
    }
}
