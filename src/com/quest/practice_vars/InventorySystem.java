package com.quest.practice_vars;

public class InventorySystem {
    private String[] products;
    private int[][] inventory;
    public InventorySystem(String[] products, int[][] inventory) {
        this.products = products;
        this.inventory = inventory;
    }
    public void generateSalesReport (int[] quantitiesSold){
        double totalRevenue = 0;
        for(int i = 0; i < products.length; i++){
            double revenue = quantitiesSold[i] * inventory[i][1];
            totalRevenue += revenue;
            System.out.println(products[i] + " sold " + quantitiesSold[i] + " revenue = " + revenue);
        }
        System.out.println("Total revenue = " + totalRevenue);
    }
    public void checkInventoryShortage(int[] quantitiesSold){
        for(int i = 0; i < products.length; i++){
            if(quantitiesSold[i]>inventory[i][0]){
                System.out.println("Warning: Insufficient stock for "+products[i]+" sold"+quantitiesSold[i]+" units, but only"+inventory[i][0]+" units is available");
            }
        }
    }
    public void restockInventory(int productIndex, int restockAmount){
        inventory[productIndex][0] += restockAmount;
        System.out.println("Restocking "+ products[productIndex] +" with " + restockAmount + " units");
        System.out.println("Updated stock for "+products[productIndex]+" : "+ inventory[productIndex][0] +" units");
    }
    public void generateSalesSummaryByPriceRange(int[] quantitiesSold, double minPrice, double maxPrice) {
        System.out.println("Products in the price range $" + minPrice + " to $" + maxPrice + ":");
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][1] >= minPrice && inventory[i][1] <= maxPrice) {
                double revenue = quantitiesSold[i] * inventory[i][1];
                System.out.println(products[i] + ": Revenue = $" + revenue);
            }
        }
    }
    public void trackOutOfStockProducts() {
        System.out.println("Products out of stock:");
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] == 0) {
                System.out.println(products[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[][] inventory = {
                {100, 200},  // Product A: 100 units in stock, $200 each
                {50, 150},   // Product B: 50 units in stock, $150 each
                {200, 50},   // Product C: 200 units in stock, $50 each
                {75, 300},   // Product D: 75 units in stock, $300 each
                {0, 100}   // Product E: 150 units in stock, $100 each
        };
        int[] quantitiesSold = {20, 10, 60, 10, 30};
        // Task: Restock inventory for Product B
        int restockAmount = 20; // Restocking 20 units of Product B
        // Task: Generate sales summary based on a price range
        double minPrice = 100;
        double maxPrice = 300;
        InventorySystem system = new InventorySystem(products, inventory);
        system.generateSalesReport(quantitiesSold);
        system.checkInventoryShortage(quantitiesSold);
        system.restockInventory(1, 20);
        system.generateSalesSummaryByPriceRange(quantitiesSold, 100, 300);
        system.trackOutOfStockProducts();
    }
}
