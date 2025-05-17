package Recursion;

import java.util.Scanner;

public class FindMaxInArray {
     static int max=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println(findMax(arr,0));
    }
    private static int findMax(int[]arr , int idx){
        if(idx==arr.length-1) return arr[idx];
        findMax(arr,idx+1);
        if(arr[idx]>max){
            max=arr[idx];
        }
        return max;
    }

    private static int findMaxAnotherWay(int[]arr , int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int misa = findMaxAnotherWay(arr,idx+1);
        if(misa<arr[idx]){
            return arr[idx];
        }else{
            return misa;
        }
    }
}
