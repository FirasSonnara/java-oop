package Online_Shopping_System;

public class Main {

    public static void main(String[] args) {
        // Create an online store
        OnlineStore onlineStore = new OnlineStore();

        // Add some products to the store
        Product product1 = new Product("Laptop", "High-performance laptop", 999.99, 10);
        Product product2 = new Product("Phone", "Latest smartphone", 499.99, 20);
        onlineStore.addProduct(product1);
        onlineStore.addProduct(product2);

        // Create a customer
        Customer customer = new Customer("John Doe", "john@example.com");
        onlineStore.addCustomer(customer);

        // Process an order for the customer
        onlineStore.processOrder(customer);
    }
}