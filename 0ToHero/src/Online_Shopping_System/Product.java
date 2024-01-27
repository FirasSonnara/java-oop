package Online_Shopping_System;

public class Product {
    private String nameP;
    private String description;
    public double price;
    private int quantityInStock;
    
    public Product(String nameP, String description, double price, int quantityInStock){
        this.nameP = nameP;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    public String getNameP(){
        return nameP;
    }
    public int getQuantity(){
        return quantityInStock;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantityInStock = quantityInStock;
    }
    public void addToStock(int quantity){
        String ProdName = getNameP();
        quantityInStock += quantity;
        System.out.println(ProdName+" has "+quantityInStock+" in stock.");
    }
    public void removeFromStock(int quantity){
        // line zeyda : 
        //String ProdName = getNameP();
        if(quantityInStock == 0)
            System.out.println("you have 0 "+getNameP()+" in stock");
        else{
            quantityInStock -= quantity;
            System.out.println(getNameP()+" has "+quantityInStock+" in stock.");
        }
    }
}
