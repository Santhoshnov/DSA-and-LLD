package services;

import models.*;

public class InventoryService {
    private Product[] products = new Product[10];
    private int productCount = 0;

    public void addItem(String name, int quantity, double price) {
        if (productCount < products.length) {
            products[productCount++] = new Product(name, quantity, price);
            System.out.println("Product added: " + name);
        } else {
            System.out.println("Inventory full.");
        }
    }

    public Product[] listInventory() {
        return products;
    }
}
