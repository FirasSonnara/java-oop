package Online_bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    List<Book> bookList = new ArrayList<>();
    
    public void addBook(Book book){
        //The equals method is typically used for comparing objects.
        //You should check if the bookList contains the book.
        if (!bookList.contains(book)){
            System.out.println("what's the book's title, author, publication date and price");
            bookList.add(book);
            System.out.println("just added : "+book.getTitle()+" of "+book.getAuthor()+" published in "+book.getPublicationDate()+ " priced at "+ book.getPrice());
        }
        else
            System.out.println("the book already exists");        
    }
    
    public void displayBooks(){
        
        System.out.println("all books are :");
        for(Book book : bookList)
            System.out.println(book);
        
    }
    
    public List<Book> searchBooksByAuthor(String author){
        List<Book> result = new ArrayList<>();
        if (bookList.isEmpty()){
            System.out.println("bookstore is empty");
            return result ;
        }
        
        for(Book book : bookList){
            if(book.getAuthor().equals(author))
                result.add(book);
        }
        
        return result;
    }
    
    public double calculateTotalRevenue(){
        double sum = 0.0;
        for (Book book : bookList)
            sum+= book.getPrice();
        return (sum);
    }
}