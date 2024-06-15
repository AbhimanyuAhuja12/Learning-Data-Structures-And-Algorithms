package Backtracking;

import java.util.ArrayList;

public class NqueensReturnList {
    public static void main(String[] args) {
        int n=4;
        ArrayList<ArrayList<String>>ans = new ArrayList<>();
        boolean[][]board =new boolean[n][n];
        System.out.println(findQueens(board,0,ans));


    }
        public static ArrayList<ArrayList<String>> findQueens ( boolean[][] board, int row,ArrayList<ArrayList<String>>ans){

           if (row == board.length) {
                display(board,ans);
                return ans;

           }


            // placing queen one by one

            for (int col = 0; col < board.length; col++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = true;
                    findQueens(board, row + 1,ans);
                    board[row][col] = false;
                }
            }
            return ans;

        }


    private static boolean isSafe(boolean[][] board, int row, int col) {
        // we have to check if queen is present above or not
        // we don't have to check down , we are placing queen one by one from above
        //we will check in above row , left diagonal , right diagonal


        // for checking in row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // for checking in left diagonal
        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // for checking in Right diagonal
        int minRight = Math.min(row, (board.length - col - 1));
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board, ArrayList<ArrayList<String>>ans) {
        ArrayList<String> curr = new ArrayList<>();

        for (boolean[] row : board) {
            String str="";
            for (boolean element : row) {
                if (element) {
                    str=str + 'Q' ;
                } else {
                    str=str + '.' ;
                }
            }
            curr.add(str);

        } ans.add(curr);

    }

}


