package Recursion;
import java.util.Scanner;
/**
 * Recursively prints numbers in decreasing and then increasing order.
 * Example: For n = 3, output will be:
 * 3
 * 2
 * 1
 * 1
 * 2
 * 3
 */
public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printDecreasingIncreasing(n);
    }
    /**
     * Prints numbers from n down to 1 (decreasing), then back from 1 to n (increasing).
     *
     * @param n positive integer input
     */
    public static void printDecreasingIncreasing(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);                      // Decreasing phase
        printDecreasingIncreasing(n - 1);
        System.out.println(n);                      // Increasing phase
    }
}