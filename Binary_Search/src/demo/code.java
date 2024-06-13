package demo;

public class code{
    public static void main(String[] args) {
int target=23;
int[]arr={2,4,5,7,8,18,21,23,45,67,89};
int ans= binarysearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if element not found
//@org.jetbrains.annotations.Contract(pure = true)
static int binarysearch(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
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

