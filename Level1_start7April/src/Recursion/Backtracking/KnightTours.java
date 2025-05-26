package Recursion.Backtracking;

import java.util.Scanner;

public class KnightTours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chessBoard = new int[n][n];
        int StartingRow = scanner.nextInt();
        int StartingCol = scanner.nextInt();

        knightTours(chessBoard, StartingRow, StartingCol, 1);
    }

    private static void knightTours(int[][] chessBoard, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= chessBoard.length || col >= chessBoard.length || chessBoard[row][col] != 0) {
            return;
        }else if(move == chessBoard.length * chessBoard.length) {
            displayChessBoard(chessBoard);
            chessBoard[row][col] = 0; // backtrack
            return;
        }

        chessBoard[row][col] = move;

        //right calls
        knightTours(chessBoard, row - 2, col + 1, move + 1);
        knightTours(chessBoard, row - 1, col + 2, move + 1);
        knightTours(chessBoard, row + 1, col + 2, move + 1);
        knightTours(chessBoard, row + 2, col + 1, move + 1);

        //Left calls
        knightTours(chessBoard, row + 2, col - 1, move + 1);
        knightTours(chessBoard, row + 1, col - 2, move + 1);
        knightTours(chessBoard, row - 1, col - 2, move + 1);
        knightTours(chessBoard, row - 2, col - 1, move + 1);

        chessBoard[row][col] = 0;
    }

    private static void displayChessBoard(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("___________________________");
    }
}
