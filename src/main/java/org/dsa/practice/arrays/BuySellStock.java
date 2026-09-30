package org.dsa.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class BuySellStock {
    public static void main(String[] args) {
        //TODO
        /*
        * Given an array where:
        prices[i] = stock price on day i
        You can buy once and sell once, and you must buy before you sell.
        Return the maximum profit you can achieve.
        Input
        [7, 1, 5, 3, 6, 4]
        Expected output
        5
        *
        * */

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit is "+maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {

//        int currentMinIndex=0;
//
//        //test to consider [5, 6, 1, 2, 10]
//        int currentMinElement = prices[0];
//        for (int i=0; i<prices.length; i++) {
//            if (prices[i] < currentMinElement) {
//                currentMinElement = prices[i];
//                currentMinIndex = i;
//            }
//        }
//
//        //find the max element after the currentMin Index;
//        int currentMaxElement = prices[currentMinIndex];
//        for (int i=currentMinIndex; i<prices.length; i++) {
//            if (prices[i] > currentMaxElement) {
//                currentMaxElement = prices[i];
//            }
//        }
//        return currentMaxElement - currentMinElement;

        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
