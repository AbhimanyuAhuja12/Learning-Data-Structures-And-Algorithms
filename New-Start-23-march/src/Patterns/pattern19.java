package Patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();


        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1) {
                    if (col == n || col <= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else if (row <= n / 2) {
                    if (col == n / 2 + 1 || col == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else if (row == n / 2 + 1) {
                    System.out.print("*\t");

                } else if (row < n) {
                    if (col == 1 || col == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else {
                    if (col == 1 || col >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        /*
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (rows <= n / 2) {
                    if (cols < n && cols > n / 2 + 1 && rows <= n / 2) {
                        System.out.print("\t");
                    } else if (cols <= n / 2 && cols >= 1 && rows > 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                } else {
                    if (cols > 1 && cols <= n / 2 && rows > n / 2 + 1) {
                        System.out.print("\t");
                    } else if (cols > n / 2 + 1 && rows < n && rows > n / 2 + 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }

            }
            System.out.println();
        }
        
         */
    }
}
