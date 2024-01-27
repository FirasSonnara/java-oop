
package Bibliothèque_Virtuelle;

public class Magazine extends Media {
    public int numeroPublication;
    public Magazine(String titre, String auteur, String datePublication, int numeroPublication){
        super(titre, auteur, datePublication);
        this.numeroPublication = numeroPublication ; 
    }
    @Override
    void afficherDetails(){
        System.out.println("Magazine title : "+titre+" of auther "+auteur+" published in "+datePublication+" number "+numeroPublication);
    }
    
}
