//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {

//
//        int[] arr=new int[5];
//        System.out.println(arr[2]);
//        Scanner input=new Scanner(System.in);
import java.io.*;
import java.util.*;

        public class Main {

            public static void main(String[] args) throws Exception {
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int[]arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = input.nextInt();
                }
                int data = input.nextInt();
                for (int i=0 ;i< n; i++) {
                    if (arr[i] ==data) {
                        System.out.println(i);
                        break;
//                    } else {
//                        System.out.println("-1");
//                    }

                }

            }}}


