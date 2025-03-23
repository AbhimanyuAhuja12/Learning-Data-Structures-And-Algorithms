package Basics;
 /*
        we have to print this pattern
        *****
           *
          *
         *
        *****

         */

public class PrintingZ {
    public static void main(String[] args){
        int n=7;
        for(int i=0 ;i<n;i++){
            System.out.print("*");
        }
        System.out.println();

            for(int spaces=n-2;spaces>0;spaces--) {
                int gaps=spaces;
                while (gaps != 0) {
                    System.out.print(" ");
                    gaps--;
                }
                System.out.println("*");

        }


        for(int i=0 ;i<n;i++){
            System.out.print("*");
        }

    }
}
