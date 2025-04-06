package FunctionsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2Array {
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
        /*
        normal addition , no carry
        if (n2 > n1) {
            int ptr = n1 - 1;
            for (int i = n2 - 1; i >= 0 && ptr>0; i--) {
                int val = (ptr <= i) ? arr1[ptr] : 0;
                ptr--;
                arr2[i] = arr2[i] + val;
            }
            System.out.println(Arrays.toString(arr2));
        } else if(n1>n2){
            int ptr = n2 - 1;
            for (int i = n1 - 1; i >= 0 && ptr>0; i--) {
                int val = (ptr <= i) ? arr1[ptr] : 0;
                ptr--;
                arr1[i] = arr1[i] + val;
            }
            System.out.println(Arrays.toString(arr1));
        }else{
            for (int i = 0; i <n1 ; i++) {
                arr1[i] = arr1[i] + arr2[i];
            }
            System.out.println(Arrays.toString(arr1));
        }


         */

        int[] sumArr = new int[n2 > n1 ? n2 : n1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sumArr.length - 1;
        int carry = 0;
        while (k >= 0) {
            int val1 = (i >= 0) ? arr1[i] : 0;
            int val2 = (j >= 0) ? arr2[j] : 0;
            int currVal = val1 + val2 + carry;
            sumArr[k] = currVal % 10;
            carry = currVal / 10;
            i--;
            j--;
            k--;
        }
        if (carry > 0) {
            int[] finalResult = new int[sumArr.length + 1];
            finalResult[0] = carry;
            System.arraycopy(sumArr, 0, finalResult, 1, sumArr.length);
            System.out.println(Arrays.toString(finalResult));
        } else {
            System.out.println(Arrays.toString(sumArr));
        }
    }
    /*
     int i = n1 - 1;
        int j = n2 - 1;
        int k = sumArr.length - 1;
        int carry = 0;
    while (k >= 0) {
            int sum = carry;
            if(i>=0){
            sum+=arr[i];
            }
            if(j>=0){
            sum+=arr[j];
            }
            carry = sum / 10;
            sum=sum % 10;
            sumArr[k] = sum;

            i--;
            j--;
            k--;
        }
        if (carry > 0) {
    int[] finalResult = new int[sumArr.length + 1];
    finalResult[0] = carry;
    System.arraycopy(sumArr, 0, finalResult, 1, sumArr.length);
    System.out.println(Arrays.toString(finalResult));
} else {
    System.out.println(Arrays.toString(sumArr));
}
     */

}
