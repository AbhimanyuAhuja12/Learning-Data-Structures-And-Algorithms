package Basics;
import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(countDigits(num));

        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.println(count);

    }

    public static int countDigits(int num){
        String str = num + "";
         return str.length();
    }
}
