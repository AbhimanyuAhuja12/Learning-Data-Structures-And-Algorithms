package TwoDArrays;

import java.util.Scanner;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int target = input.nextInt();
        input.close();
        System.out.println(search(matrix,target));
    }
    private static int search(int[][]matrix , int target){

    }
}
