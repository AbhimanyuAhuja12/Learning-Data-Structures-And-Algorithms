package Basics;
import java.util.Scanner;

public class printingDigits {
    public static void main(String []  args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        /*
        int reverse =0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }

        while(reverse!=0){
            int rem = reverse%10;
            System.out.println(rem);
            reverse=reverse/10;
        }
        */
        int digit=0;
        int currNum=num;
        while(currNum!=0){
            currNum=currNum/10;
            digit++;
        }
        int div = (int) Math.pow(10,digit-1);
        while(div!=0){
            int quotient=num/div;
            System.out.println(quotient);
            num=num%div;
            div=div/10;
        }
    }
}
