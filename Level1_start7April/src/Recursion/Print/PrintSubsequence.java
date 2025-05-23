package Recursion.Print;

import java.util.Scanner;

public class PrintSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        generateSubsequences(input, "");
    }

    /**
     * Recursively generates and prints all subsequences of a given string.
     *
     * @param remaining The part of the string yet to be processed.
     * @param current   The current subsequence being built.
     */
    private static void generateSubsequences(String remaining, String current) {
        if (remaining.isEmpty()) {
            System.out.println(current);
            return;
        }

        char firstChar = remaining.charAt(0);
        String rest = remaining.substring(1);

        // Include the first character
        generateSubsequences(rest, current + firstChar);

        // Exclude the first character
        // you can do generateSubsequences(rest,current+""); also
        generateSubsequences(rest, current);
    }
}
