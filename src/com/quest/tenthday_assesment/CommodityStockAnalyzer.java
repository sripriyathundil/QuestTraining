package com.quest.tenthday_assesment;

public class CommodityStockAnalyzer extends StockAnalyzer {
    String commodityType;
    @Override
    int findMaxPrice() {
        int maxPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }
        return maxPrice;
    }

    @Override
    int findMinPrice() {
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return minPrice;
    }

    @Override
    double calculateAveragePrice() {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return (double) sum / prices.length;
    }

    @Override
    int[] findLongestIncreasingTrend() {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                end++;
            }
            else {
                if (end > maxLength) {
                    maxLength = end;
                }
                start = i;
                end = i;
            }
        }
        if(end > maxLength) {
            maxLength = end;
        }
        return new int[]{start, end, maxLength};
    }

    @Override
    void displayAnalysis() {
        System.out.println("Analysis for Commodity Stock:");
        System.out.println("Commodity Type: " + commodityType);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + trend[0] + " End Day " + trend[1] + " Length " + trend[2] + " days");
    }
}
