package Patterns;

import java.util.Scanner;
/*
hollow diamond pattern
        *	*	*	    *	*	*
        *	*				*	*
        *						*
        *	*				*	*
        *	*	*		*	*	*
*/
public class pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int stars=(n/2)+1;
        int spaces=1;

        for (int rows = 1; rows <= n; rows++) {

            for (int i = 1; i <=stars ; i++) {
                System.out.print("*\t");
            }
            for (int i = 1; i <=spaces ; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <=stars ; i++) {
                System.out.print("*\t");
            }
            System.out.println();
              if(rows<=n/2){
                  stars--;
                  spaces+=2;
              }else{
                  stars++;
                  spaces-=2;
              }
        }
    }
}
