package Patterns;

import java.util.Scanner;

/*
this pattern we have to print
 * * * * *
 * * * *
 * * *
 * *
 *
 */

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

//        for (int rows = 1; rows <= n; rows++) {
//            for (int col = n; col >= rows; col--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for(int rows = n; rows>=1; rows--){
           for(int cols=1;cols<=rows;cols++){
           System.out.print("*");
           }
           System.out.println();
        }


        /*
          for(int row =1;row<=n;row++){
             int col=row;
             while(col<=n){
             System.out.print("*");
             col++;
             }
             System.out.println();
          }
         */

        /*
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n - i));
        }
         */

    }
}
