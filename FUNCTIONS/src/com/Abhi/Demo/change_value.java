package com.Abhi.Demo;

import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        int[] arr = {1, 3, 45, 67, 78};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=99;
    }
}
//if you make a change to the object via the reference variable, same object will be change
//output is changed because we are modifying