package Ques;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[]arr={2,-4,5,89,78,57,-45};
        int n=arr.length;
        System.out.println(find(arr,n));

    }static int find(int []arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],find(arr,n-1));
    }
}
