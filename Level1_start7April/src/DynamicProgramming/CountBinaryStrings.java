package DynamicProgramming;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //we have to return no of strings which do not have consecutive zeros

        int count1 = countStrings(n);
        int count2 = countStrings2(n);
        System.out.println(count1);
        System.out.println(count2);
    }

    private static int countStrings(int n) {
        // using extra space
        int[] dp0 = new int[n + 1];
        int[] dp1 = new int[n + 1];
        dp0[1] = 1;
        dp1[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp1[i] = dp1[i - 1] + dp0[i - 1];
            dp0[i] = dp1[i - 1];
        }
        return dp0[n] + dp1[n];
    }
    private static int countStrings2(int n){
        int old_count_zeros =1;
        int old_count_ones =1;

        for(int i =2;i<=n;i++){
            int new_count_zeros = old_count_ones;
            int new_count_ones = old_count_ones + old_count_zeros;

            old_count_ones =new_count_ones;
            old_count_zeros = new_count_zeros;
        }
        return old_count_ones + old_count_zeros;
    }
}
