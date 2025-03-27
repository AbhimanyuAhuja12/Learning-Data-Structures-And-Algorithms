package Basics;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        //GCD

        int start = Math.min(num1, num2);

        for (int i = start; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD is : " + i);
                break;
            }
        }

        //LCM
        int lcm = Math.max(num1, num2); // Start from the max of the two

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }
            lcm += Math.max(num1, num2);  // Increment by the larger number
        }
      /*


        int pointer = Math.max(num1,num2);

        for (int i = pointer; i <=num1*num2 ; i=i+pointer) {
            if(i%num1==0 && i%num2==0){
                System.out.println("LCM is : "+ i);
                break;
            }


       */



        /*
        Euclidean GCD
        GCD(a,b) = GCD(b,a%b)

        while(b!=0) or while(n1%n2!=0)  , you can apply any of this condition{
          int temp=b;
          b=a%b;
          a=temp;
        }

        return a;
         */

        /*
        LCM Formula
        GCD*LCM=n1*n2 (remember while calculating gcd , n1 and n2 will be changed , so you have to store their original values)
         lcm =(a*b)/GCD
         */
    }
}

