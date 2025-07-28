package graphs;

import java.util.*;

public class numsWithSameConsecutiveDiff {
    class Solution {
        public int[] numsSameConsecDiff(int n, int k) {
            List<Integer> result = new ArrayList<>();
            for (int num = 1; num <= 9; num++) {
                dfs(num, result, n - 1, k);
            }

            int[] retResult = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                retResult[i] = result.get(i);
            }
            return retResult;
        }

        private static void dfs(int num, List<Integer> result, int n, int k) {
            if (n == 0) {
                result.add(num);
                return;
            }
            int lastDigit = num % 10;
            if (lastDigit + k <= 9)
                dfs(num * 10 + lastDigit + k, result, n - 1, k);
            if (k != 0 && lastDigit - k >= 0)
                dfs(num * 10 + lastDigit - k, result, n - 1, k);

        }

        public int[] numsSameConsecDiffBFS(int n, int k) {
            List<Integer> result = new ArrayList<>();

            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= 9; i++) {
                q.add(i);
            }

            int level = 1;

            while (!q.isEmpty() && level < n) {
                level++;
                int s = q.size();
                for (int i = 0; i < s; i++) {
                    int curr = q.remove();
                    int lastDigit = curr % 10;
                    if (lastDigit + k <= 9)
                        q.add(curr * 10 + lastDigit + k);
                    if (k != 0 && lastDigit - k >= 0)
                        q.add(curr * 10 + lastDigit - k);
                }
            }

            while (!q.isEmpty()) {
                result.add(q.remove());
            }

            int[] retResult = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                retResult[i] = result.get(i);
            }
            return retResult;
        }
    }
}
