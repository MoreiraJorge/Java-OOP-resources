/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;
import pp_fp06.PizzaRestaurant.enums.Ingredient;
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
        Ingredient[] Inglist = {new Ingredient("Tomate", 12, VEGETAL),
                             new Ingredient("Chouriças", 15, ANIMAL)  };
        
        Pizza pizza = new Pizza(1, "Pizza Miguel", 4, "O miguel fez esta Pizza", Inglist);
    }
    
}
