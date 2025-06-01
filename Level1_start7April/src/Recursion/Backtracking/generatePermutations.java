package Recursion.Backtracking;

import java.util.*;

public class generatePermutations {

    public static List<List<Integer>> getPermutations(int[] coins, int amount) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, amount, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] coins, int amount, int currSum, List<Integer> path, List<List<Integer>> result) {
        if (currSum == amount) {
            result.add(new ArrayList<>(path)); // Found valid permutation
            return;
        }

        if (currSum > amount) {
            return; // Invalid path
        }

        for (int i = 0; i < coins.length; i++) {
            path.add(coins[i]); // choose
            backtrack(coins, amount, currSum + coins[i], path, result); // explore
            path.remove(path.size() - 1); // un-choose (backtrack)
        }
    }

    public static void main(String[] args) {
        int[] coins = {1, 2};
        int amount = 3;
        List<List<Integer>> permutations = getPermutations(coins, amount);

        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
}

