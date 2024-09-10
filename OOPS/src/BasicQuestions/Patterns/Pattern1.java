package BasicQuestions.Patterns;


public class Pattern1 {
    /*
1
12
123
1234
12345
*/
    public static void main(String[] args) {
        pattern3(5);
    }
    public static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        /*
                *
              * * *
             * * * * *
            * * * * * * *
          * * * * * * * * *

         */
        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){

                    System.out.print("*");
            }
            System.out.println();
        }




    }
    public static void pattern3(int n){
        /*
            *
          * * *
         * * * * *
       * * * * * * *
     * * * * * * * * *
       * * * * * * *
         * * * * *
          * * *
            *

         */

        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){

                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=n;row>=1;row--){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        /*
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
         */
    }

}
