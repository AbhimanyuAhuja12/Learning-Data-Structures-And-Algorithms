package com.Abhi.Demo;

import java.util.Scanner;

public class Conditions {
//    public static void main(String[] args) {
//     in do-while loop , one loop will always be executed, because conition is checked after the bloack is executed
//        int n=1;
//        do{
//            System.out.println("hello world");
//            n++;
//        }while(n<=2);
//    }

//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int max = a;
//        if (b > max) {
//            max = b;
//
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);
//    }

//        int max;
//        max = Math.max(a, b);
//         int maxx=Math.max(max,c);
//        System.out.println(maxx);

//        int max=Math.max(c,Math.max(a,b));
//        System.out.println(max);
//
//    }
//        char ch = input.next().trim().charAt(0);
//        if(ch>='a'&&ch<='z'){
//            System.out.println("lower case");
//        }else{
//            System.out.println("upper case");
//        }
////

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
//
    }
}






//}

