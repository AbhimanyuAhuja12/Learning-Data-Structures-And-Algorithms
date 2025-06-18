package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class CountEncodings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String digit = input.next();
        System.out.println(CountEncodingsRec(digit));
        HashMap<String, Integer> dp = new HashMap<>();
        System.out.println(CountEncodingsMemo(digit, dp));
        System.out.println(CoundEncodingsTab(digit));

    }

    private static int CountEncodingsRec(String digit) {
        //base condition
        if (digit.length() == 0) {
            return 1;
        }
        if (digit.charAt(0) == '0') {
            return 0;
        }

        int count = 0;

        //one digit at a time
        count += CountEncodingsRec(digit.substring(1));

        //two digit at a time
        if (digit.length() >= 2) {
            String ch2 = digit.substring(0, 2);
            int ch2V = Integer.parseInt(ch2);
            if (ch2V >= 10 && ch2V <= 26) {
                count += CountEncodingsRec(digit.substring(2));
            }
        }

        return count;

    }

    private static int CountEncodingsMemo(String digit, HashMap<String, Integer> dp) {
        //base condition
        if (digit.length() == 0) {
            return 1;
        }
        if (digit.charAt(0) == '0') {
            return 0;
        }
        if (dp.containsKey(digit)) {
            return dp.get(digit);
        }

        int count = 0;

        //one digit at a time
        count += CountEncodingsMemo(digit.substring(1), dp);

        //two digit at a time
        if (digit.length() >= 2) {
            String ch2 = digit.substring(0, 2);
            int ch2V = Integer.parseInt(ch2);
            if (ch2V >= 10 && ch2V <= 26) {
                count += CountEncodingsMemo(digit.substring(2), dp);
            }
        }
        dp.put(digit, count); // store result in memo (dp)
        return count;

    }

    private static int CoundEncodingsTab(String digit) {
        int[] dp = new int[digit.length()];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            if (digit.charAt(i - 1) == '0' && digit.charAt(i) == '0') {
                dp[i] = 0;
            } else if (digit.charAt(i - 1) == '0' && digit.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            } else if (digit.charAt(i - 1) != '0' && digit.charAt(i) == '0') {
                if (digit.charAt(i - 1) == '1' || digit.charAt(i - 1) == '2') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = 0;
                }
            } else {
                if (Integer.parseInt(digit.substring(i - 1, i + 1)) <= 26) {
                    dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[digit.length()-1];
    }
}
