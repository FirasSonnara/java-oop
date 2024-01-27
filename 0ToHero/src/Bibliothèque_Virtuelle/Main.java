package Bibliothèque_Virtuelle;

import java.util.*;

public class Main {
    public static String donnerAuteur; 

    public static void main(String[] args) {
        Library bibliotheque = new Library();
        
        //remplir
        bibliotheque.ajouterMedia(new Book("bled","Ali","1920",69));
        bibliotheque.ajouterMedia(new Magazine("magazine","Lai","1999",610));
        bibliotheque.ajouterMedia(new AudioDocument("tasjil","3mor","2001",10));
        
        //affichages
        System.out.println("tous les medias sont : ");
        bibliotheque.afficherTousLesMedias();
        
        //recherche par auteur
        Scanner scan = new Scanner(System.in);
        System.out.println("donner auter");
        donnerAuteur = scan.nextLine();
        List<Media> mediasAuteur = bibliotheque.rechercherMediaParAuteur(donnerAuteur);
        System.out.println("\nMédias de l'auteur " + donnerAuteur + ":");
        for (Media media : mediasAuteur) {
            media.afficherDetails();
        }
    }
}
