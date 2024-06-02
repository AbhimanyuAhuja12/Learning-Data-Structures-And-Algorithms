package com.Abhi.demo;

public class Max {
    public static void main(String[] args) {
        int[]arr={23,34,156,12,111,96};
        System.out.println("maximum :"+max(arr));
        System.out.println("minimum :"+min(arr));
    }
    static int max(int[]array){
        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }return max;
    }
    static int min(int[]array){
        int min=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }return min;
}
    }
