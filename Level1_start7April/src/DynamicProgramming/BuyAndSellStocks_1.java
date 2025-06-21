package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellStocks_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int[] prices = new int[days];
        for (int i = 0; i < days; i++) {
            prices[i] = input.nextInt();
        }
        int lsf = Integer.MAX_VALUE;
        int profitIfSoldToday = 0;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < days; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            profitIfSoldToday = prices[i] - lsf;
            if (profitIfSoldToday > maxProfit) {
                maxProfit = profitIfSoldToday;
            }
        }
        System.out.println(maxProfit);
    }
}
