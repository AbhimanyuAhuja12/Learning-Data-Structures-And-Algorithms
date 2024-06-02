package AdvQues;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(CountUniquePath(9,5));
//uniquePaths("",3,3);
//        System.out.println(uniquePathsRet("",4,3));
//        System.out.println(uniquePathsDiagonal("",3,3));

        boolean[][] board ={
                {true,true,true},
                {true,false,false},
                {true,true,true}
        };
        uniquePathsObstracle("",board,0,0);
    }

    public static int CountUniquePath(int col,int row){
        //base condition
        if (col==1 || row==1){
            return 1;
        }

        int right=CountUniquePath(col-1,row);
        int left=CountUniquePath(col,row-1);
        return right+left;
    }

    public static void uniquePaths(String p ,int row ,int col){
        //base condition
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            uniquePaths(p+"D",row-1,col);
        }
        if(col>1){
            uniquePaths(p+"R",row,col-1);
        }
    }
    public static ArrayList<String> uniquePathsRet(String p , int row , int col){
        //base condition
        if(row==1 && col==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();


        if(row>1){
            list.addAll(uniquePathsRet(p+"D",row-1,col));
        }
        if(col>1){
            list.addAll(uniquePathsRet(p+"R",row,col-1));
        }

        return list;
    }

    public static ArrayList<String> uniquePathsDiagonal(String p , int row , int col){
        //base condition
        if(row==1 && col==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();

        if(row>1&& col>1){
            list.addAll(uniquePathsDiagonal(p+"D",row-1,col-1));
        }

        if(row>1){
            list.addAll(uniquePathsDiagonal(p+"V",row-1,col));
        }
        if(col>1){
            list.addAll(uniquePathsDiagonal(p+"H",row,col-1));
        }

        return list;
    }

    public static void uniquePathsObstracle(String p ,boolean[][] maze,int row ,int col){
        //base condition
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row< maze.length-1){
            uniquePathsObstracle(p+"D",maze,row+1,col);
        }
        if(col<maze[0].length-1){
            uniquePathsObstracle(p+"R",maze,row,col+1);
        }
    }
}

