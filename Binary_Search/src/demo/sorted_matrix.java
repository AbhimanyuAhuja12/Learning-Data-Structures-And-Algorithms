package demo;

import java.util.Arrays;

public class sorted_matrix {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(arr,9)));

    }
    static int[] binarysearch(int[][]matrix,int row,int cstart,int cend,int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] > target) {
                cend = mid - 1;
            } else {
                cstart = mid + 1;

            }
        }return new int[]{-1,-1};
    }

    static int[]search(int[][]matrix,int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        if (rows == 1) {
            return binarysearch(matrix, 0, 0, col - 1, target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = col / 2;
        while (rstart < rend) {
            int mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] > target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }
        // now we have two rows remaining
        // check whether the two cols contain target or not
        if (matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }
//            now if the element is not presnet here , than we have to find in 4 different halfes


        // find in first half
        if (matrix[rstart][cmid - 1] <= target) {
            return binarysearch(matrix, rstart, 0, cmid - 1, target);
        }

        // find in second half
        if (matrix[rstart][cmid + 1] <= target && target < matrix[rstart][col - 1]) {
            return binarysearch(matrix, rstart, cmid + 1, col - 1, target);
        }


        // find in third half
        if (matrix[rstart + 1][cmid - 1] >= target) {
            return binarysearch(matrix, rstart+1, 0, cmid - 1, target);
        }

        // find in fourth half
        if (matrix[rstart + 1][cmid + 1] <= target) {
            return binarysearch(matrix, rstart+1, cmid + 1, col - 1, target);
        }
        return new int[]{-1,-1};
    }

}
