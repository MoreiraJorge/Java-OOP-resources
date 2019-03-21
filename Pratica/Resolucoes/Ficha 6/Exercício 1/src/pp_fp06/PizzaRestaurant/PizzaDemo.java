/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;
import pp_fp06.PizzaRestaurant.enums.Ingredient;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;
import static pp_fp06.PizzaRestaurant.enums.TipoIngredient.*;

/**
 *
 * @author Jorge Moreira
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingredient[] Inglist1 = {new Ingredient("Tomate", 12, VEGETAL),
                                new Ingredient("Chouriças", 16, ANIMAL),
                                new Ingredient("Cenoura", 12, VEGETAL),
                                new Ingredient("Queijo", 13, ANIMAL)};
        
        Ingredient[] Inglist2 = {new Ingredient("Tomate", 12, VEGETAL),
                                new Ingredient("Chouriças", 16, ANIMAL)};
        
        
        Pizza p1 = new Pizza(1, "Pizza Miguel", "O MiGUEL fez a Pizza", Inglist1, 4, PizzaSize.BIG);
        Pizza p2 = new Pizza(2, "Pizza Jorge", "O Jorge fez a Pizza", Inglist2, 2, PizzaSize.MEDIUM);
        
        
        p2.PrintPizza();
        p1.PrintPizza();
        
        
    }
   
    
    
}
