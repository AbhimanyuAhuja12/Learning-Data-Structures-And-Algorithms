package Patterns;

import java.util.Scanner;

/*
pattern to print
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int row = 1; row <= n; row++) {
            int cols = row;
            while (cols > 0) {
                System.out.print("*");
                cols--;
            }
            System.out.println();
        }

        /*
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


    }
}
