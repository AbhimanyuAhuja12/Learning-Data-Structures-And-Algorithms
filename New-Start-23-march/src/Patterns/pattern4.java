package Patterns;

import java.util.Scanner;
/*
* * * * *
  * * * *
    * * *
      * *
        *
 */
public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int spaces =0;
        int stars=n;

        for (int rows = 1; rows <=n ; rows++) {
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars--;
        }
    }
}
