/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hamza_weslati.personne;

/**
 *
 * @author hamza
 */

public class Personne {

    private String nom;
    private String prenom;
    private String genre;
    private int age;
    
    public Personne(String nom)
    {
        this.nom=nom;
    }
    
    public Personne(String prenom, String genre, int age)
    {
        this.prenom=prenom;
        this.genre=genre;
        this.age=age;
    }
    
    public Personne(String nom, String prenom, String genre, int age)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.genre=genre;
        this.age=age;
    }
    
    public void anniversaire()
    {
        age++;
    }
    
    public void presenteToi() 
    {
        System.out.println("Je m'appelle " + prenom + " " + nom);

        if ("femme".equals(genre)) 
        {
            System.out.println("Je suis une femme");
        }
        
        else if ("homme".equals(genre)) 
        {
            System.out.println("Je suis un homme");
        }
        
        else 
        {
            System.out.println("Genre non renseigne");
        }

        System.out.println("J'ai " + age + " ans");
    }
}
