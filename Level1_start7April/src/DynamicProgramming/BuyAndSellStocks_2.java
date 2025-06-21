package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellStocks_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int[] prices = new int[days];
        for (int i = 0; i < days; i++) {
            prices[i] = input.nextInt();
        }

        int BuyDate = 0;
        int SellDate = 0;
        int profit = 0;
        for (int i = 1; i < days; i++) {
            if (prices[i] >= prices[i - 1]) {
                SellDate++;
            } else {
                profit += prices[SellDate] - prices[BuyDate];
                BuyDate=SellDate=i;
            }
        }
        profit += prices[SellDate] - prices[BuyDate];
        System.out.println(profit);
    }
}
