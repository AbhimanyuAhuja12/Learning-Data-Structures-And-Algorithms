package Patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int spaces = n / 2;
        int stars = 1;
        int val = 1;
        for (int rows = 1; rows <= n; rows++) {

            for (int i = 1; i <= spaces; i++) {
                System.out.print("\t");
            }
            int column_val=val;
            for (int i = 1; i <= stars; i++) {
                System.out.print(column_val + "\t");
                if(i<=stars/2){
                    column_val++;
                }else{
                    column_val--;
                }
            }
            if (rows <= n / 2) {
                spaces--;
                stars += 2;
                val++;
            } else {
                val--;
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }


    }
}
