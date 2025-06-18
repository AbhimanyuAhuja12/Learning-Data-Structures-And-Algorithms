package DynamicProgramming;

import java.util.Scanner;

public class Count_Subsequences_of_type_regularExpression {
    // we have to Count Subsequences of type a^ib^jc^k
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String expression = input.next();

        System.out.println(CountSubsequences(expression));

    }

    private static int CountSubsequences(String expression) {
        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == 'a') {
                a = 2 * a + 1;
            } else if (ch == 'b') {
                ab = 2 * ab + a;
            } else if (ch == 'c') {
                abc = 2 * abc + ab;
            }
        }
        return abc;
    }
}
