package Recursion.Backtracking;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] maze = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        findPaths(maze, "", 0, 0);
    }

    private static void findPaths(int[][] maze, String path, int rowPtr, int colPtr) {
        // base condition
        if (rowPtr == maze.length - 1 && colPtr == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        // Check for invalid moves or already visited cells
        if (rowPtr < 0 || colPtr < 0 || rowPtr >= maze.length || colPtr >= maze[0].length || maze[rowPtr][colPtr] != 0) {
            return;
        }

        // Mark the cell as visited
        maze[rowPtr][colPtr] = -1;

        // instead of putting -1 and again putting 0 , we can make a boolean matrix of size maze
        // and put true and false

        // Explore all 4 directions
        findPaths(maze, path + "T", rowPtr - 1, colPtr); // Top
        findPaths(maze, path + "L", rowPtr, colPtr - 1); // Left
        findPaths(maze, path + "D", rowPtr + 1, colPtr); // Down
        findPaths(maze, path + "R", rowPtr, colPtr + 1); // Right

        // Unmark the cell for backtracking
        maze[rowPtr][colPtr] = 0;
    }
}
