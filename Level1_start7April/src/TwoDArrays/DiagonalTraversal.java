package TwoDArrays;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        printInDiagonalFashion(matrix);
    }

    private static void printInDiagonalFashion(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            int row = 0;
            int currCol = col;
            while (row < matrix.length && currCol < matrix.length) {
                System.out.println(matrix[row][currCol]);
                row++;
                currCol++;
            }
        }
    }
}
/*
Gap Strategy
Upper triangular diagonal
for(int g=0;g<arr.length;g++){
   for(int i =0 , j=g;j<arr.length;j++,i++){
   System.out.println(arr[i][j]);
   }
}
 */

/*
let's say now we want to print lower triangular diagonals also
for(int g =1;g<arr.length;g++){
for(int j=0,i=g;i<arr.length;i++,j++){
  System.out.println(arr[i][j]);
}
}
 */