package Patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int spaces = (2 * n) - 3;
        int stars = 1;

        for (int rows = 1; rows <= n; rows++) {
            int value = 1;

            for (int i = 1; i <= stars; i++) {
                System.out.print(value + "\t");
                value++;
            }
            for (int i = 1; i <= spaces; i++) {
                System.out.print("\t");
            }

            if (rows == n) { // Avoid duplication in the last row
                value--;
                stars--;
            }
            for (int i = 1; i <= stars; i++) {
                    value--;
                    System.out.print(value + "\t");

            }
            stars++;
            spaces -= 2;

            System.out.println();

        }
    }
}
