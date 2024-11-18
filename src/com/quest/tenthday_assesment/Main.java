package com.quest.tenthday_assesment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for Equity Stock: ");
        System.out.println("Stock Name: ");
        String equityName = sc.nextLine();
        System.out.println("Stock Symbol: ");
        String equitySymbol = sc.nextLine();
        System.out.println("Sector: ");
        String equitySector = sc.nextLine();
        System.out.println("Number of Days: ");
        int equityDays = sc.nextInt();
        int[] equityPrice = new int[equityDays];
        System.out.println("Enter prices: ");
        for (int i = 0; i < equityDays; i++) {
            equityPrice[i] = sc.nextInt();
        }
        System.out.println("Enter the details for Commodity Stock: ");
        System.out.println("Commodity Type: ");
        String commodityType = sc.next();
        System.out.println("Stock Symbol: ");
        String commoditySymbol = sc.next();
        System.out.println("Number of Days: ");
        int commodityDays = sc.nextInt();
        int[] commodityPrice = new int[commodityDays];
        System.out.println("Enter prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrice[i] = sc.nextInt();
        }
        EquityStockAnalyzer equityStockAnalyzer = new EquityStockAnalyzer();
        equityStockAnalyzer.stockName = equityName;
        equityStockAnalyzer.stockSymbol = equitySymbol;
        equityStockAnalyzer.sector = equitySector;
        equityStockAnalyzer.prices = equityPrice;
        equityStockAnalyzer.displayAnalysis();
        CommodityStockAnalyzer commodityStockAnalyzer = new CommodityStockAnalyzer();
        commodityStockAnalyzer.commodityType = commodityType;
        commodityStockAnalyzer.stockSymbol = commoditySymbol;
        commodityStockAnalyzer.prices = equityPrice;
        commodityStockAnalyzer.displayAnalysis();
        System.out.println("Comparison Results:");
        if(equityStockAnalyzer.calculateAveragePrice() > commodityStockAnalyzer.calculateAveragePrice()) {
            System.out.println("Stock with highest Average Price: " + equityStockAnalyzer.calculateAveragePrice());
        }
        else {
            System.out.println("Stock with highest Average Price: " + commodityStockAnalyzer.calculateAveragePrice());
        }
        int[] equityTrend = equityStockAnalyzer.findLongestIncreasingTrend();
        int[] commodityTrend = commodityStockAnalyzer.findLongestIncreasingTrend();
        if(equityTrend.length > commodityTrend.length) {
            System.out.println("Stock with Longest Increasing Trend: " + equityName +"has longest trend with " + equityTrend.length + " days.");
        }
        else if(commodityTrend.length > equityTrend.length) {
            System.out.println("Longest Increasing Trend: " + commodityType +"has longest trend with " + commodityTrend.length + " days.");
        }
        else {
            System.out.println("Both " + equityName + " and " + commodityType + " has same trend with " + equityTrend.length + " days.");
        }
    }
}
