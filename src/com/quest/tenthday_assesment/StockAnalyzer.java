package com.quest.tenthday_assesment;

public abstract class StockAnalyzer {
    String stockName;
    String stockSymbol;
    int[] prices;
    abstract int findMaxPrice();
    abstract int findMinPrice();
    abstract double calculateAveragePrice();
    abstract int[] findLongestIncreasingTrend();
    abstract void displayAnalysis();
}
