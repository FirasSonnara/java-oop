
package Bibliothèque_Virtuelle;

import java.util.*;

public class Library {
    public List<Media> collectionMedias = new ArrayList<>();
   
    /*constructeur explicite (par default, le systeme cree un constructeur implicite si on n'a pas des donnees a inistailiser)
    public Library() {
        // Initialisation de la collection lors de la création de la bibliothèque
        collectionMedias = new ArrayList<>();
    }
    */
    
    void ajouterMedia(Media media){
            collectionMedias.add(media);
    }
    void afficherTousLesMedias(){
        for(Media media : collectionMedias){
            media.afficherDetails();
        }
    }
    List<Media> rechercherMediaParAuteur(String auteur){
        List<Media> recherche = new ArrayList<>();
        for(Media media : collectionMedias){
            if (media.auteur.equals(auteur))//string on utilise equals
                    recherche.add(media);
        }
        return recherche;
    }
    
}
