package com.Abhi.Demo;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(2, 3, 5, 67, 54, 23, 12);

//    can store variable no. of arguments

        multiple(2 ,5 ,"hello","ggjfjd");//ordering of argument is imp
        // variable length argument can't be in between, it must be last in this list.
    }
    static void multiple(int a, int b,String...v){
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
