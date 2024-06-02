public class normal_patterns {
    public static void main(String[] args) {
        pattern_5(5);
    }


    static void pattern_1(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern_2(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    static void pattern_3(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    static void pattern_4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern_5(int n){
        int total_col;
        for (int row = 0; row <=2*n-1 ; row++) {
            if (row >= n) {
                total_col = 2 * n - row ;
            } else {
                total_col = row;
            }
            for (int col = 0; col < total_col; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
