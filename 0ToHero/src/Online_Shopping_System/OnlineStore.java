package Online_Shopping_System;

import java.util.*;

public class OnlineStore {
    List<Customer> customerList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    
    public void addProduct(Product product){
        if(!productList.contains(product)){    
            productList.add(product);
            System.out.println("Prodcut "+product+" just added");
        }
        System.out.println("SORRY, prodcut "+product+" already exists");

    }
    public void addCustomer(Customer customer){
            if(!customerList.contains(customer)){    
                customerList.add(customer);
                System.out.println("Customer "+customer+" just added");
            }
            System.out.println("SORRY, customer "+customer+" already exists");
            
    }
    
    
    public void processOrder(Customer customer){
        if(!customerList.equals(customer)){
            System.out.println("Customer "+customer+" isn't our customer yet. ");
        }
        customer.login();
        
        //perform shopping cart operations
        ShoppingCart shoppingCart = customer.getCurrentShoppingCart();
       
        //Add items from the shopping cart
          Product productToAdd = productList.get(0);
          // Replace with the actual product
          shoppingCart.addItem(productToAdd, 2);
          
        //remove items from the shopping cart
          Product productToRemove = productList.get(1);
          // Replace with the actual product
          shoppingCart.removeItem(productToRemove, 1);
          
        // View the shopping cart
        shoppingCart.viewCart();
        
        // Calculate and display the total cost
        double total = shoppingCart.calculateTotalCost();
        System.out.println("Total Cost: " + total);
        
        // Logout customer
        customer.logout();

    }
}
