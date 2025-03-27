package Basics;

import java.util.Scanner;

/*
1<N<10^9
rotations can be negative also
10^-9<k<10^9
 */

public class RotateANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //Actual Number
        int k = input.nextInt(); //no of rotations
        input.close();

        int temp = N;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        if (k < 0) k = count + k;

        k = k % count;

        int div = (int) Math.pow(10, k);
//      System.out.println("div:"+ div);
        int rem = N % div;
        int q = N / div;
//      System.out.println("N:"+ N);
        int ans = (rem * (int) Math.pow(10, count - k)) + q;

        System.out.println(ans);
    }


    /*
    implementing without Math.pow function
    int div=1;
    int mul=1;
    for(int i=0;i<count;i++){
      if(i<k){
       div=div*10;
    }else{
       mul=mul*10;
    }

    int q=N/div;
    int rem=N%div;

    int ans = rem*mul+q;
    return ans;
     */
}
