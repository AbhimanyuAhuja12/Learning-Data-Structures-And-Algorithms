package Patterns;

import java.util.Scanner;
/*
       *
     * *
   * * *
 * * * *
 */

public class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int rows = 1; rows <= n; rows++) {
            int spaces = n - rows;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
