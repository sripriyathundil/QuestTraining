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
        // Logic to calculate the total stock for each product
        // Example output:
        // Laptop: 260
        // Phone: 250
        // Tablet: 165
        // Headphones: 470
        // Smartwatch: 180
    }

    // Method 2: Find and print the product with the maximum total stock
    public static void findMaxStockProduct(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        // Logic to find the product with the maximum stock
        // Example output:
        // Product with maximum stock: Headphones (470)
    }

    // Method 3: Rank products by total stock and print the ranking
    public static void rankProductsByStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        // Logic to rank products by their total stock in descending order
        // Example output:
        // 1st: Headphones (470)
        // 2nd: Laptop (260)
        // 3rd: Phone (250)
        // 4th: Smartwatch (180)
        // 5th: Tablet (165)
    }

    // Method 4: Detect missing stock data and print the products with missing data
    public static void detectMissingData(String[] productNames, int[][] branchStock) {
        // Logic to detect missing stock data (i.e., -1) and print the product names with missing data
        // Example output:
        // Phone: Missing stock in Branch 2
        // Smartwatch: Missing stock in Branch 3
    }
}
