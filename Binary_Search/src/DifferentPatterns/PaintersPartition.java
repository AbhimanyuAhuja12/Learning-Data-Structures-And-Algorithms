package DifferentPatterns;

import java.util.Arrays;

public class PaintersPartition {
    public static void main(String[] args) {
        int n = 4;
        int  k = 2;
        int arr[] = {10,20,30,40};
        System.out.println(minTime(arr,n,k));

    }public static int minTime(int[] arr,int n,int k){
          // start =max of arr
        // end = sum of arr
        int ans = Integer.MAX_VALUE;
        int start =-1;
        int end=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>start){
                start=arr[i];
            }
            end+=arr[i];
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(k>n) return -1;
            
            if(canPaint(arr,k,mid,n)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    private static boolean canPaint(int[] arr, int k, int mid, int n) {
        int minPainter =1;
        int wallsPainted=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>mid) return false;

            if(wallsPainted+arr[i]>mid){
                minPainter++;
                if(minPainter>k) return false;
                wallsPainted=arr[i];

            }else{
                wallsPainted+=arr[i];
            }
        }return true;
    }
}
// instead of searching the ans from binary search you can search it from linear search
// in basic approach and in optimized approach you can tell about binary search.
