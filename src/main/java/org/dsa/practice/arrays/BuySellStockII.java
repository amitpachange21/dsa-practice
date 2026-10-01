package org.dsa.practice.arrays;

public class BuySellStockII {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        /*
        /You can buy and sell multiple times, but:

        You can hold only one stock at a time.
        After selling, you can buy again.
        You cannot buy and sell on the same day.
        Expected output
        7
        Buy at 1 → Sell at 5 = 4
        Buy at 3 → Sell at 6 = 3
        Total = 7
         */
        System.out.println("Max total profit is "+maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
        //we can traverse and check if todays price is higher than yesterday
        //if yes then we can add in totalProfit
        int totalProfit = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                totalProfit = totalProfit + (prices[i] - prices[i-1]);
            }
        }
        return totalProfit;
    }
}
