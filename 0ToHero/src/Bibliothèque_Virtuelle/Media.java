/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliothèque_Virtuelle;


 abstract public class Media {
     public String titre;
     public String auteur;
     public String datePublication;
     
     public Media(String titre, String auteur, String datePublication){
         this.titre = titre ;
         this.auteur = auteur ;
         this.datePublication = datePublication ;
     }
     abstract void afficherDetails();
    
}
 