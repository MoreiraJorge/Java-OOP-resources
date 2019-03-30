package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;
import static pp_fp06.PizzaRestaurant.enums.PizzaType.*;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma pizza
 * </p>
 */
public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private float price;
    private PizzaSize size;
    private int numberOfIngredients;
    private Ingredient[] ingredients = new Ingredient[MAX_INGREDIENTS];
    private Ingredient[] ingredientsPos;

    public Pizza(int id, String name, String description, float price, PizzaSize size, int numberOfIngredients, Ingredient[] ingredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.numberOfIngredients = numberOfIngredients;
        this.ingredients = ingredients;
    }
    
    
    
   
}
