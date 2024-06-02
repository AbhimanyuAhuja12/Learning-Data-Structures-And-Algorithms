package com.cp;

import java.util.Scanner;

public class Team {
//    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        int count=0;
//        int result=0;
//        int sum=0;
//        int n=input.nextInt();
//        int[]a=new int[3];
//        int[]b =new int[1001];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=3;j++){
//                a[j]=input.nextInt();
//                sum=a[0]+a[1]+a[2];
//            }
//            b[i]=sum;
//            if(b[i]>=2){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a == 1 && b == 1) || (a == 1 && c == 1) || (b == 1 && c == 1))
                count++;

        }
        System.out.println(count);
    }
}
