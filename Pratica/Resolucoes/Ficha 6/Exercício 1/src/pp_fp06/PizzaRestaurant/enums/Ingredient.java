/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 *
 * @author Jorge Moreira
 */
public class Ingredient {
    
    private String name;
    private int codigo;
    private TipoIngredient origem;
    
    Ingredient(){
    }

    public Ingredient(String name, int codigo, TipoIngredient origem) {
        this.name = name;
        this.codigo = codigo;
        this.origem = origem;
    }
    
    public void print(){
        System.out.print(this.name);
        System.out.print(this.codigo);
        System.out.println(this.origem);
    }
    
    
    
}
