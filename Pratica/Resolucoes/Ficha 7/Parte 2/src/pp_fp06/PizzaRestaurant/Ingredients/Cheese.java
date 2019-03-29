/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.CheeseType;
import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;
import pp_fp06.PizzaRestaurant.enums.IngredientOrigin;

/**
 *
 * @author Jorge Moreira
 */
public class Cheese extends Toping{
    CheeseType type;

    public Cheese(CheeseType type, IngredientOrigin origin) {
        super(origin);
        this.type = type;
    }

    public Cheese(CheeseType type, IngredientOrigin origin, int id, 
           String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.type = type;
    }
    
    
    
}
