/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliothèque_Virtuelle;

/**
 *
 * @author User
 */
public class Book extends Media {
    public int nombrePages;
    public Book(String titre, String auteur, String datePublication, int nombrePages){
        super(titre, auteur, datePublication);
        this.nombrePages = nombrePages ;
    }
    @Override
    void afficherDetails(){
        System.out.println("book title "+titre+" of auther "+auteur+" published in "+datePublication+" size "+nombrePages);
    }
}
