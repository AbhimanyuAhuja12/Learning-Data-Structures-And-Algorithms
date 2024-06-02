package demo;

public class rotation_count {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int pivot =pivot_index(arr);
        System.out.println(pivot);
        System.out.println(pivot+1);

    }
    static int pivot_index(int[]arr){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                ans=mid;

            }
            if(arr[mid]<arr[mid-1]){
                ans=mid-1;
            }
            if(start<mid){
                start=mid+1;
            }
            if(start>=mid+1){
                end=mid-1;
            }

        }return ans;
    }
}
