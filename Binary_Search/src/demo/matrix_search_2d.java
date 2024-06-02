package demo;

import java.util.Arrays;

public class matrix_search_2d {
    public static void main(String[] args) {
        int[][]arr={
                {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}
        };
        int target=3;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));




    }static int[] search(int[][]matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(col>=0 && row<matrix.length){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]>target){
                col--;
            }else {
                row++;
            }
        }return new int[]{-1,-1};
    }
}
