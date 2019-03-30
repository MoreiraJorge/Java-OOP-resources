/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Base;
import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.Ingredients.Toping;
import static pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits.*;
import static pp_fp06.PizzaRestaurant.enums.IngredientOrigin.*;
import static pp_fp06.PizzaRestaurant.enums.PizzaBase.*;

/**
 *
 * @author Jorge Moreira
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Toping top1 = new Toping(NACIONAL, 1, "Bife", GRAMAS, 123);
        Base b1 = new Base(MASSA_ALTA, "Massa Feita a mao", 2, "Massa", 1234);

        System.out.println(top1.toString());
        System.out.println(b1.ToString());

        Ingredient[] list1 = {new Toping(NACIONAL, 1, "Bife", GRAMAS, 123),
            new Base(MASSA_ALTA, "Massa Feita a mao", 2, "Massa", 1234)};

        Ingredient.ListToString(list1);

    }

}
