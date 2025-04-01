package Patterns;

import java.util.Scanner;
/*
  *
 * *
*   *
 * *
  *
 */
public class pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int outerSpace = n / 2;
        int innerSpace = -1;

        for (int rows = 1; rows <= n; rows++) {

            for (int i = 1; i <= outerSpace; i++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int i = 1; i <= innerSpace; i++) {
                System.out.print(" ");
            }
            if (rows>1 && rows<n) System.out.print("*");

            System.out.println();

            if (rows <= n / 2) {
                outerSpace--;
                innerSpace += 2;
            } else {
                outerSpace++;
                innerSpace -= 2;
            }
        }


    }
}
