package Online_Shopping_System;

import java.util.*;

public class ShoppingCart {
    List<Product> items = new ArrayList<>();
    List<Integer> howMuch = new ArrayList<>();
    
    public void addItem(Product product, int quantity){
        items.add(product);
        howMuch.add(quantity);
        System.out.println("just added "+product+" with quantity of "+quantity);
    }
    
    public void removeItem(Product product, int quantity){
        items.remove(product);
        howMuch.remove(quantity);
        System.out.println("just removed "+product+" with quantity of "+quantity);
    }
    
    public void viewCart(){
        System.out.println("all items in cart are :");
        for (int i = 0; i<Math.min(items.size(), howMuch.size()); i++){
            Product item = items.get(i);
            int quantityPerItem = howMuch.get(i);
            System.out.println("Item "+item+" in quantity of "+quantityPerItem);
            
        }
    }
    public double calculateTotalCost(){
        double sum = 0.0;
        for (int i = 0; i< howMuch.size(); i++){
            int quantityPerItem = howMuch.get(i);
            //items de type Product & price type double
            double price = items.get(i).getPrice();
            sum += price * quantityPerItem ;
        }
        return sum;
    }
}
