package Recursion;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GetStairsPath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = scanner.nextInt();
        scanner.close();

        List<String> allPaths = getStairPaths(totalSteps);
        System.out.println(allPaths);
    }

    /**
     * Returns all possible paths to climb 'n' stairs,
     * where each step can be 1, 2, or 3 stairs at a time.
     *
     * @param n the total number of stairs
     * @return a list of strings, where each string represents a path (e.g., "121" means steps of 1, 2, and 1)
     */
    private static ArrayList<String> getStairPaths(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n < 0){
            return new ArrayList<>();
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> result = new ArrayList<>();
        for(String itr : path1){
            result.add(1 + itr);
        }
        for(String itr : path2){
            result.add(2 + itr);
        }
        for(String itr : path3){
            result.add(3 + itr);
        }

        return result;
    }
}
