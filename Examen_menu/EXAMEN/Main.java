/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author Markypler115
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta carta = new Carta ("carta");
        Menu menu = new Menu ("menu");
        carta.afegeixMenu(menu);
        
        menu.afegeixPlat(new PrimerPlat("amanida"));
        menu.afegeixPlat(new SegonPlat("paella"));
        menu.afegeixPlat(new Postre("cafe", "cafe"));
        
        // amanida
        menu.getPlats().get(0).afegeixIngredient(new Ingredient ("enciam", true, true));
        menu.getPlats().get(0).afegeixIngredient(new Ingredient ("tomaquet", true, true));
        
        // paella
        menu.getPlats().get(1).afegeixIngredient(new Ingredient ("arros", true, true));
        menu.getPlats().get(1).afegeixIngredient(new Ingredient ("marisc", false, true));
        
        // gelat
        menu.getPlats().get(2).afegeixIngredient(new Ingredient ("llet", false, true));
        menu.getPlats().get(2).afegeixIngredient(new Ingredient ("sucre", true, true));
        
        System.out.println(carta);
    }
    
}
