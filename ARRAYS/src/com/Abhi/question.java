package com.Abhi;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class question {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
//        int smallest=arr[0];
//        int sec_smallest=100000000;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<smallest){
//                sec_smallest=smallest;
//                smallest=arr[i];
//            }
//            if(arr[i]>smallest && arr[i]<sec_smallest){
//                sec_smallest=arr[i];
//            }
//
//        }
//        System.out.println(sec_smallest);
//        System.out.println(smallest);


     //ROTATE AN ARRAY
        int n=arr.length;
        int k=3;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
            

        }

    }
}
