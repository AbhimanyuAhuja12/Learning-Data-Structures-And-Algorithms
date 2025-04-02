package Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int spaces = n / 2;
        int stars = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int i = 1; i <= spaces; i++) {
                if (rows == (n / 2) + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int i = 1; i <= stars; i++) {
                System.out.print("*\t");
            }

            if (rows <= n / 2) {
                stars++;
            } else {
                stars--;
            }
            System.out.println();
        }
    }
}
