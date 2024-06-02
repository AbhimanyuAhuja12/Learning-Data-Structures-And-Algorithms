package com.Abhi.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
//    if you don't know the size of array, and also if you do not want to mention it prior, then we use array list.
//    it is like vector in C++(similar)
//    Array_list<data_type> var_name=new Array_list<here the data_type is not mandatory>();
//    slower than the standard array
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);

//it has .to string function internally
//        list.add(465);
//        list.add(445);
//        list.add(456);
//        list.add(456);
//        list.add(455);
//        list.add(454);
//        System.out.println(list);
//        list.set(0,88);
//        System.out.println(list);
//        System.out.println(list.contains(45));

//        for (int i = 0; i <5 ; i++) {
//           list.add( input.nextInt());
//        }
//        //for output
////        System.out.println(list);
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(list.get(i));//pass index here by using get function ...here list[index] syntax will not work here
//
//        }
//        for taking infinite number of inputs from user
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        System.out.println(list);
    }


}
