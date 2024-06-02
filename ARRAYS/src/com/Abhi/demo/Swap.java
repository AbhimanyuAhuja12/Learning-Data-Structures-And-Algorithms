package com.Abhi.demo;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        without using third variable
        int[]arr={1,2,3,4,5};
//        arr[1]=arr[2]+arr[1];
//        arr[2]=arr[1]-arr[2];
//        arr[1]=arr[1]-arr[2];
//        System.out.println(arr[1]+" "+ arr[2]);
//        swap(arr,1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }

    static void swap(int[]arr, int index_1, int index_2) {
        int temp=arr[index_2];
        arr[index_2]=arr[index_1];
        arr[index_1]=temp;
}
}
