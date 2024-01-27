package Online_bookstore;

public class Book {
    private String title;
    private String author;
    private String publicationDate;
    private double price;
    
    public Book(String title, String author, String publicationDate, double price){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
     
    public String getPublicationDate(){
        return publicationDate;
    }
    public double getPrice(){
        return price;
    }
}
