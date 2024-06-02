package com.Abhi.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice {//code for second largest element
    public static void main(String[] args) {
        int[]arr={6,6,6,6,6,6,16};
        int n=arr.length;
        Arrays.sort(arr);
        int largest=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]!=largest){
                int second_largest=arr[i];
                System.out.println(second_largest);
                break;
            }
        }

    }
}
