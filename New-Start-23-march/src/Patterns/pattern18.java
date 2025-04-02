package Patterns;

import java.util.Scanner;
/*
hourglass, upper hollow hourglass
 */

public class pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int stars = n;
        int spaces = 0;
        int gaps = n - 4;

        for (int rows = 1; rows <= n; rows++) {
            for (int i = 0; i <= spaces; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= stars; i++) {
                if (rows > 1 && rows <= n / 2 && i > 1 && i < stars) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (rows <= n / 2) {
                stars -= 2;
                spaces++;
            } else {
                stars += 2;
                spaces--;
            }
            System.out.println();
        }
    }
}
