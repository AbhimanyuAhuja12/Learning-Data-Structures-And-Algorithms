public class advanced_pattern {
    public static void main(String[] args) {
        pattern_17(5);
    }

    static void pattern_28(int n) {
        //diamond pattern
        int total_col;
        for (int row = 0; row <= 2 * n - 1; row++) {
            if (row >= n) {
                total_col = 2 * n - row;
            } else {
                total_col = row;
            }
            int noOfspaces = n - total_col;
            for (int i = 0; i < noOfspaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < total_col; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }


    static void pattern_30(int n) {
        for(int row = 1; row < n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);

            }
            System.out.println();

        }
    }

    static void pattern_17(int n) {
        for (int row = 1; row < 2 * n; row++) {


            int total_col = row > n ? 2 * n - row : row;
            for (int spaces = 0; spaces < n - total_col; spaces++) {
                System.out.print("  ");
            }
            for (int col = total_col; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= total_col; col++) {
                System.out.print(col + " ");

            }

            System.out.println();
        }
    }
}
