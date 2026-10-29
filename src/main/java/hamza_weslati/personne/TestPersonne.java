/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hamza_weslati.personne;

/**
 *
 * @author hamza
 */

public class TestPersonne {

    public static void main(String[] args) {

        Personne p1 = new Personne("Weslati");

        Personne p2 = new Personne("hamza", "homme", 21);

        Personne p3 = new Personne("kamilia", "kam", "femme", 20);


        p1.anniversaire();
        p2.anniversaire();
        p3.anniversaire();


        System.out.println("Personne 1 :");
        p1.presenteToi();

        System.out.println();

        System.out.println("Personne 2 :");
        p2.presenteToi();

        System.out.println();

        System.out.println("Personne 3 :");
        p3.presenteToi();
    }
}
