package ques3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={34,12,56,23,89,1};
//        selection_sort(arr,arr.length);
        selection_sort2(arr,6,0,0);
        System.out.println(Arrays.toString(arr));

    }static void selection_sort(int[]arr,int n){
        if(n==1) return ;
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
//        System.out.println(max);
        swap(arr,max,n-1);
        selection_sort(arr,n-1);
    }

    static void swap(int[]arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }


    static void selection_sort2(int[]arr,int r ,int c,int max){
        if(r==1) return;

        if(c<r){
            if(arr[c]>arr[max]){
                selection_sort2(arr,r,c+1,c);
            }else{
                selection_sort2(arr,r,c+1,max);
            }
        }
        else {
            //swap
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection_sort2(arr,r-1,0,0);
        }

    }
}
