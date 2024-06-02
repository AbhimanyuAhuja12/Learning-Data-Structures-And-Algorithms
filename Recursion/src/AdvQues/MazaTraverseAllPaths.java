package AdvQues;

import java.util.Arrays;
import java.util.Scanner;

public class MazaTraverseAllPaths {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        int row=input.nextInt();
//        int col=input.nextInt();
//        boolean[][] maze =new boolean[3][3];   // it is initialized false
        boolean[][] maze ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][]path=new int[maze.length][maze[0].length];
//        CountAllPaths("",maze,0,0);
        CountAllPathsPrintMatrix("",maze,0,0,path,1);
    }
    public static void CountAllPaths(String p,boolean[][]maze, int row , int col){
        // base condition
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) return;

        maze[row][col]=false;

         // traversing up
        if(row>0){
            CountAllPaths(p+"Up",maze,row-1,col);
        }

        // traversing down
        if(row< maze.length-1){
            CountAllPaths(p+"Down",maze,row+1,col);
        }

        // traversing right
        if(col<maze[0].length-1){
            CountAllPaths(p+"Right",maze,row,col+1);
        }

        // traversing left
        if(col>0){
            CountAllPaths(p+"Left",maze,row,col-1);
        }

        maze[row][col]=true;
    }

    public static void CountAllPathsPrintMatrix(String p,boolean[][]maze, int row , int col,int[][]path ,int step){
        // base condition
        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
//            System.out.println(Arrays.deepToString(path));
            for(int[]arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]) return;

        path[row][col]=step;
        maze[row][col]=false;

        // traversing up
        if(row>0){
            CountAllPathsPrintMatrix(p+"Up",maze,row-1,col,path,step+1);
        }

        // traversing down
        if(row< maze.length-1){
            CountAllPathsPrintMatrix(p+"Down",maze,row+1,col,path,step+1);
        }

        // traversing right
        if(col<maze[0].length-1){
            CountAllPathsPrintMatrix(p+"Right",maze,row,col+1,path,step+1);
        }

        // traversing left
        if(col>0){
            CountAllPathsPrintMatrix(p+"Left",maze,row,col-1,path,step+1);
        }

        maze[row][col]=true;
        path[row][col]=0;

    }
}
