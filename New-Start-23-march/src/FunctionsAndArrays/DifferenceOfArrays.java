package FunctionsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOfArrays {
    // assumption n2 arr will be greater than n1 arr
    // we have to keep in mind about carry
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        int [] resultArr = new int[n2];
        int i = n1-1;
        int j =n2-1;
        int k = n2-1;

        int borrow =0;

        while(k>=0){
            int digit1= (i>=0) ? arr1[i] : 0;
            int digit2 = arr2[j] + borrow;

            int newDigit;
            if(digit2>=digit1){
                newDigit = digit2 - digit1 ;
                borrow=0;
            }else {
                newDigit = (digit2 + 10) - digit1 ;
                borrow =-1;
            }
            resultArr[k]=newDigit;


            i--;
            j--;
            k--;
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
