/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;
import pp_fp06.PizzaRestaurant.enums.PizzaBase;

/**
 *
 * @author Jorge Moreira
 */
public class Base extends Ingredient {
    PizzaBase type;
    String description;

    public Base(PizzaBase type, String description) {
        this.type = type;
        this.description = description;
    }

    public Base(PizzaBase type, String description, int id, 
           String name, IngredientMeasureUnits measureUnit, float calories) {
        super(id, name, measureUnit, calories);
        this.type = type;
        this.description = description;
    }

    public PizzaBase getType() {
        return type;
    }

    public void setType(PizzaBase type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
