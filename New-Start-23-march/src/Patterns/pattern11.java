package Patterns;

import java.util.Scanner;
/*
1
2 3
4 5 6
7 8 9 19
11 12 13 14 15
 */
public class pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int count=1;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }
}
