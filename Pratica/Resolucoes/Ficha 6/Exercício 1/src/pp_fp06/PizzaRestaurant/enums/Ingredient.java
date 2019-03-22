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

    /**
     *
     * @param name
     * @param codigo
     * @param origem
     */
    public Ingredient(String name, int codigo, TipoIngredient origem) {
        this.name = name;
        this.codigo = codigo;
        this.origem = origem;
    }
    
    /**
     *
     */
    public void print(){
        System.out.print(name);
        System.out.print(codigo);
        System.out.println(origem);
    }

    public String getName() {
        return name;
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoIngredient getOrigem() {
        return origem;
    }
    
    
    
    
    
    
}
