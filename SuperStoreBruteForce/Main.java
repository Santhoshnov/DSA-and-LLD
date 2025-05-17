import services.*;

public class Main {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        InventoryService inventoryService = new InventoryService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        // Register users
        profileService.registerUser("Alice", "seller", "password1");
        profileService.registerUser("Bob", "buyer", "password2");

        // Seller adds products
        inventoryService.addItem("Laptop", 5, 800.0);
        inventoryService.addItem("Phone", 3, 500.0);

        // Buyer places an order
        orderService.addToCart("Bob", "Laptop");
        orderService.buyItem("Bob", paymentService);
    }
}
