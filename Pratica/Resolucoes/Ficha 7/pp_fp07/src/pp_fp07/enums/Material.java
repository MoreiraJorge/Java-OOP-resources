/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.enums;

/**
 *
 * @author Jorge Moreira
 */
public enum Material {
    
    /**
     *
     */
    CARBONO,

    /**
     *
     */
    ALUMINIO,

    /**
     *
     */
    SEM;
    
    /**
     *
     * @param tipo
     * @return
     */
    public static String MaterialToString(Material tipo){
       
        switch(tipo){
            case CARBONO:
                return "Bicicleta Feita de Carbono";
            case ALUMINIO:
                return "Bicicleta Feita de Aluminio";
            default:
                return "Material Invalido";
        }
    }
    
}
