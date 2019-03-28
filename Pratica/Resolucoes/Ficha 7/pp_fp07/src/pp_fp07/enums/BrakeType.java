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
public enum BrakeType {
    
    P, H;
    
    public static String BrakeType(BrakeType tipo){
       
        switch(tipo){
            case P:
                return "Travões de Pinças";
            case H:
                return "Travões de Hidraulicas";
            default:
                return "Travões Invalidos";
        }
    }
    
    
    
}
