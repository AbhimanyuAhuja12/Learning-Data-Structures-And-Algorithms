package Patterns;

import java.util.Scanner;
/*
 *       *
   *   *
     *
   *   *
 *       *
 */

public class pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (rows==cols || rows+cols==n+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
