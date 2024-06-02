package com.Abhi.Demo;

public class shadowing {
     static int x=20;// this will be now shadowed for line 8
    public static void main(String[] args) {
        System.out.println(x);//20
        int x=40;//( the class variable at line4 is shadowed by this(shadowing is only done after the initialization of variable, not after it's declaration)
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
// scopes are overlapping