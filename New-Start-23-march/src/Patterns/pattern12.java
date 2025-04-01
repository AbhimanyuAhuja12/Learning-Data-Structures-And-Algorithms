package Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int first=0;
        int sec =1;
        int fib;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(first + "\t");
                fib = first+sec;
                first=sec;
                sec=fib;
            }
            System.out.println();
        }
    }
}
