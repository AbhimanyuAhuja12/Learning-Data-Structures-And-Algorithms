package Ques_2;

import java.util.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[]arr={1,2,3,8,9,12};
//        System.out.println(Sorted(arr));
        System.out.println(isSorted(arr,0));

    }static boolean Sorted(int[]arr){
        if(arr.length==1){
            return true;
        }
        return (arr[0]<arr[1]) && Sorted(Arrays.copyOfRange(arr,1,arr.length));
    }

    static boolean isSorted(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && isSorted(arr,index+1);
    }
}
