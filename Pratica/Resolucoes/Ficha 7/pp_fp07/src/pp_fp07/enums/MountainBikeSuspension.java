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
public enum MountainBikeSuspension {
    SIMPLES, DUPLA, SEM;

    public static String MountainBikeSuspensionToString(MountainBikeSuspension tipo) {

        switch (tipo) {
            case SIMPLES:
                return "Suspensao simples";
            case DUPLA:
                return "suspensao dupla";
            //case SEM:
            default:
               return "sem suspensão"; 
        }
    }

}