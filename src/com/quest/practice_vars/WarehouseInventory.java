package com.quest.practice_vars;

public class WarehouseInventory {
    public static void main(String[] args) {
        // Step 1: Initialize product names, warehouse quantities, and branch stock
        String[] productNames = {"Laptop", "Phone", "Tablet", "Headphones", "Smartwatch"};
        int[] warehouseStock = {120, 150, 100, 200, 80};
        int[][] branchStock = {
                {50, 30, 60},  // Laptop stock across 3 branches
                {40, -1, 60},  // Phone stock (missing in Branch 2)
                {30, 20, 15},  // Tablet stock
                {100, 90, 80}, // Headphones stock
                {50, 55, -1}   // Smartwatch stock (missing in Branch 3)
        };

        // Step 2: Call methods to perform the required tasks
        // Task 1: Calculate and print total stock for each product
        calculateTotalStock(productNames, warehouseStock, branchStock);

        // Task 2: Find and print product with the maximum total stock
        findMaxStockProduct(productNames, warehouseStock, branchStock);

        // Task 3: Rank products by total stock and print ranking
        rankProductsByStock(productNames, warehouseStock, branchStock);

        // Task 4: Detect and print missing stock data
        detectMissingData(productNames, branchStock);
    }

    // Method 1: Calculate and print the total stock for each product
    public static void calculateTotalStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        for (int i = 0; i < productNames.length; i++) {
            int totalStock = warehouseStock[i];
            for (int j = 0; j < branchStock[i].length; j++) {
                if (branchStock[i][j] != -1) {
                    totalStock += branchStock[i][j];
                }
            }
            System.out.println(productNames[i] + ": " + totalStock);
        }
    }

    // Method 2: Find and print the product with the maximum total stock
    public static void findMaxStockProduct(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        int maxIndex = 0;
        int maxStock = 0;
        for (int i = 0; i < productNames.length; i++) {
            int totalStock = warehouseStock[i];
            for (int j = 0; j < branchStock[i].length; j++) {
                if (branchStock[i][j] != -1) {
                    totalStock += branchStock[i][j];
                }
            }
            if (totalStock > maxStock) {
                maxStock = totalStock;
                maxIndex = i;
            }
        }
        System.out.println("Product with maximum stock: " + productNames[maxIndex] + " (" + maxStock + ")");
    }

    // Method 3: Rank products by total stock and print the ranking
    public static void rankProductsByStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        int[] totalStock = new int[productNames.length];
        for (int i = 0; i < productNames.length; i++) {
            totalStock[i] = warehouseStock[i];
            for (int j = 0; j < branchStock[i].length; j++) {
                if (branchStock[i][j] != -1) {
                    totalStock[i] += branchStock[i][j];
                }
            }
        }
    for (int i = 0; i < totalStock.length - 1; i++) {
        for (int j = 0; j < totalStock.length - i - 1; j++) {
            if (totalStock[j] < totalStock[j + 1]) {
                int temp = totalStock[j];
                totalStock[j] = totalStock[j + 1];
                totalStock[j + 1] = temp;

                String tempProduct = productNames[j];
                productNames[j] = productNames[j + 1];
                productNames[j + 1] = tempProduct;
            }
        }
    }

    // Print the ranked products
        for (int i = 0; i < productNames.length; i++) {
        System.out.println((i + 1) + "st: " + productNames[i] + " (" + totalStock[i] + ")");
    }
}
    // Method 4: Detect missing stock data and print the products with missing data
    public static void detectMissingData(String[] productNames, int[][] branchStock) {
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < branchStock[i].length; j++) {
                if (branchStock[i][j] == -1) {
                    System.out.println(productNames[i] + ": Missing stock in Branch " + (j + 1));
                }
            }
        }
    }

}
