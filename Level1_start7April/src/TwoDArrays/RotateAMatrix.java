package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAMatrix {
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

//        System.out.println(Arrays.deepToString(rotateMatrixUsingExtraSpace(matrix)));

        rotateMatix(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    private static void rotateMatix(int[][] matrix) {
        // first we will take transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                // we cant swap the whole matrix , we only have to swap the upper triangular part
                // because we swap the whole matrix , for some elements , there will 2 swaps

                // swap
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i =0;i< matrix.length;i++){
            int start=0;
            int end=matrix.length-1;
            while(start<=end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }

    private static int[][] rotateMatrixUsingExtraSpace(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        int ptrR = 0;
        int ptrC = matrix.length - 1;
        for (int i = 0; i < matrix.length && ptrC >= 0; i++) {
            ptrR = 0;
            for (int j = 0; j < matrix[0].length && ptrR < matrix.length; j++) {
                result[ptrR][ptrC] = matrix[i][j];
                ptrR++;
            }
            ptrC--;
        }
        return result;

        // except of all these things we can do result[j][n-i-1]=matrix[i][j];
    }
}
