package Online_bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bookstore bookery = new Bookstore();
        
        //adding books
        bookery.addBook(new Book("title1","author1","datePub1",10.5));
        
        //displaying books
        bookery.displayBooks();
        
        //searching for author's books by system
        List<Book> bookByAuthor = bookery.searchBooksByAuthor("author2"); 
        /* List<Book> bookByAuthor = new ArrayList<>(); bookByAuthor = bookery.searchBooksByAuthor("author2"); */
        
        //calculate total revenue
        double revenue = bookery.calculateTotalRevenue();
        System.out.println("Total Revenue: $" +revenue);

        //Enter author by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author to search for:");
        String user_Author = scanner.nextLine();;
        
        //Searching for author's books by User
        System.out.println("Books by author " + user_Author + ":");
        for (Book book : bookByAuthor) {
            System.out.println(book.getTitle() + " - " + book.getPublicationDate() + " - " + book.getPrice());
        }
        
        // Close the scanner
        scanner.close();
    }
    
}
