/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

/**
 *
 * @author ZARAT
 */
public class mainperson {
public static void main(String[] args) {

        Persona gente = new Persona("Hanner", 10, 20);
        Persona gente2 = new Persona("Hanner", 10, 20);
 if (gente.equals(gente2)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }

    }
}
