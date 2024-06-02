package ques3;

import java.util.Arrays;

public class MergeSort_inPlace {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        merge_sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void merge_sort(int[] arr, int start, int end) {
        if(end-start==1) return ;

        int mid=(start+end)/2;

        merge_sort(arr,start,mid);
        merge_sort(arr,mid,end);

        mergeInplace(arr,start,mid,end);
    }

    private static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[]ans=new int[end-start];

        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            ans[k]=arr[i];
            i++;
            k++;

        }
        while (j< end) {
            ans[k]=arr[j];
            j++;
            k++;

        }

        for(int x=0;x<ans.length;x++){
            arr[start+x]=ans[x];
        }


    }
}
