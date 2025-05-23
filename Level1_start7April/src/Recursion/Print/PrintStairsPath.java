package Recursion.Print;
import java.util.Scanner;
public class PrintStairsPath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of stairs
        scanner.close();

        System.out.println("All possible paths to climb " + n + " stairs:");
        generatePaths(n, "");
    }

    /**
     * Recursively prints all the paths to climb stairs.
     * Each path is a combination of steps of size 1, 2, or 3 that sum to n.
     *
     * @param remainingStairs Number of stairs left to climb
     * @param currentPath     The path taken so far
     */
    private static void generatePaths(int remainingStairs, String currentPath) {
        if (remainingStairs == 0) {
            System.out.println(currentPath);
            return;
        }

        if (remainingStairs < 0) {
            return;
        }

        // Try taking 1, 2, and 3 steps
        generatePaths(remainingStairs - 1, currentPath + "1");
        generatePaths(remainingStairs - 2, currentPath + "2");
        generatePaths(remainingStairs - 3, currentPath + "3");
    }
}
