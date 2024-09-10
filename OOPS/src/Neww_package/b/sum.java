package Neww_package.b;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b= input.nextInt();

        sum s = new sum();// we have to create an object for 'non-static' method
        System.out.println("Sum : "+ s.SUM(a,b));
//        System.out.println(main.a);
    }
     int SUM(int a , int b){
//        System.out.println(main.a);
        return a+b;

    }
}
