package BasicQuestions;
//Question 1: Rat Count House
/*
Problem Description :
        The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of
         size ‘n’
         as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of
         food each rat consumes and each ith element of array ‘arr’ represents the
         amount of food present in ‘i+1’ house number, where 0 <= i

        Note:

        Return -1 if the array is null
        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
        Computed values lie within the integer range.
        Example:

        Input:
        r: 7
        unit: 2
        n: 8
        arr: 2 8 3 5 7 4 1 2
        Output:
        4
*/

import java.util.*;

public class Problem1_RatCountHouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int units = input.nextInt();
        int n= input.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(solve(r,units,n,arr));
    }

    public static int solve(int rats, int units, int n, int[] arr){
        if(arr.length==0) return -1;

        int foodReq=rats*units;

        int count=0;
        int foodAvailable=0;
        for(int i=0;i<arr.length;i++){
            foodAvailable+=arr[i];
            count++;
            if(foodAvailable>foodReq) return count;
        }
        return 0;
    }
}
