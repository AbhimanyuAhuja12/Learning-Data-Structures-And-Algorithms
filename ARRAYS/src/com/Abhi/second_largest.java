package com.Abhi;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,7,8};
        int max=arr[0];
        int second_max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }if(arr[i]<max && second_max<arr[i]){
                second_max=arr[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("second_max:"+ second_max);
    }
}
