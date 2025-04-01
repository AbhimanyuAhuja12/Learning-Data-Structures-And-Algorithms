package Patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();


        for (int rows = 0; rows <n ; rows++) {
            int nCr=1;
            for (int cols = 0; cols <=rows ; cols++) {
                System.out.print(nCr+"\t");
                nCr= nCr* (rows-cols)/(cols+1);

            }
            System.out.println();
        }
        /*
        nCr+1 = nCr * (n-r) / (k+1)
         */
    }
}
