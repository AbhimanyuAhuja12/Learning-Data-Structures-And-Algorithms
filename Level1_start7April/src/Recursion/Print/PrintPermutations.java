package Recursion.Print;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        printPermutations(input, "");
    }
     /**
      * Recursively generate all permutations of the given string
      * @param remaining The remaining characters to permuted
      * @param  current  The current permutation being build
      */
    private static void printPermutations(String remaining, String current) {
        // Base case: If no characters are left to permute
        if (remaining.isEmpty()) {
            System.out.println(current);
            return;
        }
        // Recur for each character in the remaining string
        for (int i = 0; i < remaining.length(); i++) {
            char chosenChar  = remaining.charAt(i);
            String nextRemaining  = remaining.substring(0, i) + remaining.substring(i + 1);
            printPermutations(nextRemaining , current + chosenChar );
        }
    }
}
