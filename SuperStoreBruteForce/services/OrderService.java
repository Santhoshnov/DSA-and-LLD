package services;

import models.*;


public class OrderService {
    private String[] cart = new String[5];
    private int cartCount = 0;

    public void addToCart(String buyer, String product) {
        if (cartCount < cart.length) {
            cart[cartCount++] = product;
            System.out.println("Added to cart: " + product);
        } else {
            System.out.println("Cart is full.");
        }
    }

    public void buyItem(String buyer, PaymentService paymentService) {
        if (cartCount > 0) {
            System.out.println("Order placed by " + buyer);
            paymentService.makePayment(buyer);
        } else {
            System.out.println("Cart is empty.");
        }
    }
}
