package pp_fp06.PizzaRestaurant;

import java.util.Arrays;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;
import pp_fp06.PizzaRestaurant.enums.Ingredient;

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
    private Ingredient[] ingredients;
    private int numberOfIngredients;
    private PizzaSize size;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     *
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     */
    Pizza() {
    }

    public Pizza(int id, String name, String description) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Pizza(int id, String name, int numberOfIngredients, String description, Ingredient[] array) {

        if (numberOfIngredients != 0 && numberOfIngredients <= 5) {
            this.ingredients = array;
            this.id = id;
            this.name = name;
            this.description = description;
            this.numberOfIngredients = numberOfIngredients;
        } else {
            System.out.println("Erro nos Ingredientes");
        }

    }

    public Pizza(int id, String name, String description, Ingredient[] array, int numberOfIngredients, PizzaSize size) {
        if (numberOfIngredients != 0 && numberOfIngredients <= 5) {
            this.size = size;
            this.ingredients = array;
            this.id = id;
            this.name = name;
            this.description = description;
            this.numberOfIngredients = numberOfIngredients;
        } else {
            System.out.println("Erro nos Ingredientes");
        }
    }
    
    /*
    Printar Pizzas
    */
    public void PrintPizza() {
        
        System.out.println("");
        System.out.println(this.name);
        System.out.println(this.size);
        System.out.println(this.id);
        System.out.println(this.description);
        System.out.println(this.numberOfIngredients);
        
        for (Ingredient ingredient : this.ingredients) {
            //System.out.println(ingredient);
            ingredient.print();
        }
        
    }

}
