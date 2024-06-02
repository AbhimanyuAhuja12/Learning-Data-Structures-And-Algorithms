package com.Abhi.Demo;

public class function_overloading {
//    if the two functions has same name but should have different parameters
    // at compile time
    // either the no. of arguments should be different or either the type of argument should be different

    public static void main(String[] args) {
        fun(87);
        fun("abhimanyu");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);

    }
}
