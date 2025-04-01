package Patterns;

import java.util.Scanner;
/*
diagonal line
*
  *
    *
      *
        *

 */
public class pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        /*
        int spaces=0;

        for (int rows = 1; rows <= n ; rows++) {
            for (int i = 1; i <=spaces ; i++) {
                System.out.print("\t");
            }
            System.out.println("*");
            spaces++;
        }

         */

        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=n ; cols++) {
                if(rows==cols){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
