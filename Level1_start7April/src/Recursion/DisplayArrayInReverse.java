package Recursion;

public class DisplayArrayInReverse {
    public static void main(String[] args) {
        int[]arr = {34,56,78,12,36};
        displayReverse(arr,0);
    }
    private static void displayReverse(int[]arr , int idx){
        if(idx==arr.length) return;
        System.out.println(arr[arr.length-idx-1]);
        displayReverse(arr,idx+1);
    }
    private static void displayReverseOtherMethod(int[]arr , int idx){
        if(idx==arr.length) return;
        displayReverse(arr,idx+1);
        System.out.println(arr[idx]);

    }
}
