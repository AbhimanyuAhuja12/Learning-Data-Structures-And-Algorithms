package TwoDArrays;

import java.util.Arrays;
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
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    private static int[] search(int[][]matrix , int target){
          int i = 0;
          int j = matrix.length-1;
          while(i<matrix.length && j>=0){
              if(matrix[i][j]==target){
                  return new int[]{i,j};
              }else if(matrix[i][j]<target){
                  i++;
              }else{
                  j--;
              }
          }
          return new int[]{-1,-1};
    }
}
