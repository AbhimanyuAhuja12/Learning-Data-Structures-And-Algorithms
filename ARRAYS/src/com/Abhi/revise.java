package com.Abhi;

import java.util.Arrays;

public class revise {
    public static void main(String[] args) {
//        String[] arr = new String[4];
//        System.out.println(arr[0]);
//
//        int[][]multi_arr={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.deepToString(multi_arr));
//        System.out.println(Arrays.toString(multi_arr));
//        System.out.println(multi_arr[0][1]);


        int[] arr = {72,56,78,23,45,67};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //swap
            swap(arr[start], arr[end]);
            start++;
            end--;
        }
            System.out.println(Arrays.toString(arr));

    }

    public static void swap(int i, int j) {
        int temp=j;
        j=i;
        i=temp;
    }
}
