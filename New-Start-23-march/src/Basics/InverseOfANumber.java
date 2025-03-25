package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();
        input.close();

        int inverse=0;
        int counter=1;
        while(num!=0){
            int rem=num%10;
            inverse=inverse + (counter * (int)Math.pow(10,rem-1));
            num=num/10;
            counter++;
        }
        System.out.println(inverse);
    }
}
