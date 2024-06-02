package Ques_2;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,3,4};
        int target=6;
        System.out.println(Search_binary(arr,target,0,arr.length-1));
    }
    static int Search_binary(int[]arr,int target,int start, int end){
        if(start>end){
            return-1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                 return Search_binary(arr,target,start,mid-1);
            }
            else{
                 return Search_binary(arr,target,mid+1,end);
            }
        }
            if(target>=arr[mid] && target<=arr[end]){
               return  Search_binary(arr,target,mid+1,end);
            }

               return Search_binary(arr,target,start,mid-1);

        }

}
