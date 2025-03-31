package Patterns;

import java.util.Scanner;

/*
 Diamond pattern
 */
public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int spaces = n / 2;
        int stars = 1;

        for (int rows = 1; rows <= n; rows++) {

            for (int i = 1; i <=spaces ; i++) {
                System.out.print("\t");
            }

            for (int i = 1; i <=stars ; i++) {
                System.out.print("*\t");
            }

            if (rows <= (n-1) / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }

    }
}