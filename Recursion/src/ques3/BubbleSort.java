package ques3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        bubble_sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

//    static void bubble_sort(int[] arr,int n) {
//        int didSwap=0;
//        if (n == 1) return;
//        for(int i=0;i<n-1;i++) {
//            if (arr[i] > arr[i + 1]) {
//                swap(arr, i, i + 1);
//                didSwap++;
//            }
//        }
//        if(didSwap==0) return ;
//        bubble_sort(arr,n-1);
//    }
//    static void swap(int[]arr,int first,int second){
//        int temp=arr[second];
//        arr[second]=arr[first];
//        arr[first]=temp;


    static void bubble_sort(int[] arr, int length) {
        if (length == 1) {
            return;
        }
        int didSwap=0;
        int i = 0;
        int j = 1;
        while (i < j && i<length && j<length) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
                i++;
                j++;
                didSwap++;
            } else {
                i++;
                j++;
            }
        }
        if(didSwap==0) return;
        bubble_sort(arr, arr.length - 1);


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

    }
}





