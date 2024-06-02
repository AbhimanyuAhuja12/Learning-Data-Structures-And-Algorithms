package demo;

public class infinite_Array_searching {
    public static void main(String[] args) {
        int []arr ={2,5,8,9,45,67,89,99,101};
        int target=9;
        System.out.println(ans(arr,target));
    }

    static int ans(int[]arr,int target) {
        // firstly we have taken the size of box as 2
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int new_start = end + 1;
            end = end + 2 *(end-start+1);
            start=new_start;
        }return Binary_Search(arr,target,start,end);
    }
    static int Binary_Search(int[] arr,int target,int start, int end){
        while(start<=end){
            // now we have to calculate the value of middle element
//    int mid=(start+end)/2 ;//might be possible that (start+end) may exceed the value of integer ,so we use
            int mid =start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    }

