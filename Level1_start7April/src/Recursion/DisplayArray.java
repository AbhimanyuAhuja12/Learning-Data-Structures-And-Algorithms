package Recursion;
import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
        }

        display(arr,0);
    }private static void display(int[]arr , int idx){
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        display(arr,idx+1);
    }
}
