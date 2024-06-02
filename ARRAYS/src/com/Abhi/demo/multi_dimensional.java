package com.Abhi.demo;

import java.util.Arrays;
import java.util.Scanner;

public class multi_dimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*syntax
        rows is mandatory but not columns...
        data_type[][] var_name=new data_type[rows][columns];
                data_type[][] var_name= {
                                         {},
                                         {},
                                         {}
                                          }
                                 1 2 3
                                 4 5 6
                                 7 8 9
                */
//        int [][]arr =new int[3][3];
//        int [][]arr={
//                     {1,2,3},
//                     {4,5,6},
//                     {7,8,9}
//                        };
//        int[][] arr = new int[3][3];
////        input
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = input.nextInt();
//            }
//        }
//        output
//        for (int row = 0; row <3 ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col]+ " ");
//
//        }
//            System.out.println();
//        }

//
//               for (int row = 0; row <3 ; row++) {
//                   System.out.println(Arrays.toString(arr[row]));
//               }


//        now by enhanced for loop
//        for(data_type var_name(like i) : name){
//        System.out.println();
//    }

//
//        for(int []a: arr){
//            System.out.println(Arrays.toString(a));
//        }





//        now the column size is not fixed

        int[][]arr={
                {1,2,3,4},
                {5,6},
                {7,8,9,12,34}
        };
//        for (int row = 0; row <arr.length ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
//        by arrays.to string method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }
//        now by enhanced for loop
    for(int[]a:arr){
        System.out.println(Arrays.toString(a));
    }
    }

}
