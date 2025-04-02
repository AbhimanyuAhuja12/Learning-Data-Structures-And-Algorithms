package Patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (cols == 1 || cols == n) {
                    System.out.print("*\t");
                } else if (rows >= n / 2 + 1 && ((rows + cols == n + 1) || (rows == cols))) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
