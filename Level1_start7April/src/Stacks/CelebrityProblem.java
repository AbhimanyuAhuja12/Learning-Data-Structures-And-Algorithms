package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (number of people at the party):");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix values (0 or 1):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int celebrityIndex = findCelebrity(matrix);
        if (celebrityIndex == -1) {
            System.out.println("There is no celebrity at the party.");
        } else {
            System.out.println("The celebrity is person at index: " + celebrityIndex);
        }
    }

    // brute force O(n^2) approach
    public static int whoIsCelebrity(int[][] matrix){
        int n = matrix.length;

        for(int row=0;row<n;row++){
            boolean isRowZero =false;
            for (int col = 0; col < n; col++) {
                if(matrix[row][col]==1){
                    isRowZero=true;
                    break;
                }
            }
            if(isRowZero==false){
                boolean isColOne = true;
                for(int i =0 ; i<n;i++){
                    if(i!=row && matrix[i][row]==0){
                        isColOne=false;
                        break;
                    }
                }
                if(isColOne) return row;
            }
        }
        return -1;
    }

    public static int findCelebrity(int[][] matrix) {
        int n = matrix.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people onto the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Eliminate non-celebrities
        while (stack.size() >= 2) {
            int personA = stack.pop();
            int personB = stack.pop();

            if (matrix[personA][personB] == 1) {
                // Person A knows Person B => Person A cannot be the celebrity
                stack.push(personB);
            } else {
                // Person A does not know Person B => Person B cannot be the celebrity
                stack.push(personA);
            }
        }

        // Step 3: Verify the remaining candidate
        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // A celebrity knows no one and is known by everyone
                if (matrix[candidate][i] == 1 || matrix[i][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }
}
