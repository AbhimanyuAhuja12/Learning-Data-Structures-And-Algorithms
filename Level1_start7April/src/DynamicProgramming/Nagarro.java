package DynamicProgramming;

import java.util.Scanner;

public class Nagarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =5;
    }
    private static int factorial(int n){
        if(n==0 || n==1){
        return 1;
        }
        return n * factorial(n-1);
    }
    private static boolean isPower(int n ){
        int curr=1;
        for(int i=1;i<1000;i++){
            curr*=2;
            if(curr==n){
                return true;
            }
        }
        return false;
    }
}

class Node{
    private int value;
    Node next;

    Node(int value){
       this.value=value;
    }
}
