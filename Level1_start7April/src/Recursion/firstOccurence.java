package Recursion;
import java.util.Scanner;

public class firstOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        int target = input.nextInt();
        input.close();

        System.out.println(findFirstOtherMethod(arr,target,0));

    }
    private static int findFirst(int[] arr , int target , int idx){
        if(idx==arr.length) return -1;
        int ptr = findFirst(arr,target,idx+1);
        if(arr[idx]==target){
            return idx;
        }else{
            return ptr;
        }

    }
    private static int findFirstOtherMethod(int[] arr, int target, int idx) {
        if (idx == arr.length) return -1;
        if (arr[idx] == target) return idx;
        return findFirstOtherMethod(arr, target, idx + 1);
    }

}
