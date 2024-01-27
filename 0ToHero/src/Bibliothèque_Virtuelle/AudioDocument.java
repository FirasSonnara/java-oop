package Bibliothèque_Virtuelle;
 

public class AudioDocument extends Media {
    public int duree; //en minutes
    public AudioDocument(String titre, String auteur, String datePublication, int duree){
        super(titre, auteur, datePublication);
        this.duree = duree ; 
    }
    @Override 
    public void afficherDetails(){
        System.out.println("Audio-document title "+titre+" of auther "+auteur+" published in "+datePublication+" lenth in minute "+duree);
    }
}
