package Online_Shopping_System;

import java.util.*;

public class Customer {
    private String name ;
    private String email ;
    List<ShoppingCart> shoppingCart = new ArrayList<>();
    public Customer(String name, String email){
        this.name = name ;
        this.email = email ;

    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, what's your username ? ");
        name = scanner.nextLine();
        System.out.println("Now ,what's your email ? ");
        email = scanner.nextLine();
        System.out.println("You're in. Feel free to enjoy your shopping cart "+shoppingCart);
        
    
    }
    public void logout(){
        System.out.println("Come shop again later.");
        shoppingCart.clear();
        
    
    }
     public ShoppingCart getCurrentShoppingCart() {
         if (shoppingCart.isEmpty()) {
            // If no shopping cart exists, create a new one and add it to the list.
            ShoppingCart newShoppingCart = new ShoppingCart();
            shoppingCart.add(newShoppingCart);
            return newShoppingCart;
        } else {
            // Return the last shopping cart in the list (current shopping cart).
            return shoppingCart.get(shoppingCart.size() - 1);
        }
     }
    
}
