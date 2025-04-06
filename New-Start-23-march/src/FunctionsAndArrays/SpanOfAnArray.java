package FunctionsAndArrays;

import java.util.Scanner;

/*
Difference between maximum and minimum element
 */
public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

       // int max=Integer.MIN_VALUE;
       // int min = Integer.MAX_VALUE;
        int max = arr[0];
        int min =arr[0];
        for (int i = 0; i <n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Span of Array: " + (max-min));

    }
    /*
    Math.max(int a , int b);
     */
}
