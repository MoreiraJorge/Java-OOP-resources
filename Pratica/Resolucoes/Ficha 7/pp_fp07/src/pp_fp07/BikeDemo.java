package pp_fp07;


import pp_fp07.bikestore.MountainBike;
import pp_fp07.enums.BikeTools;
import pp_fp07.enums.BrakeType;
import pp_fp07.enums.Material;
import pp_fp07.enums.MountainBikeSuspension;

/**
 *
 * @author Jorge Moreira
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MountainBikeSuspension mm = MountainBikeSuspension.DUPLA;
        //System.out.println(MountainBikeSuspension.MountainBikeSuspensionToString(mm));
        
        MountainBike b = new MountainBike(0, mm, 0, 0, "P", 0, BrakeType.P, Material.CARBONO, 0, 0);
        
        b.addtool(BikeTools.GPS);
        b.addtool(BikeTools.BOMBA_PRESSAO);
        b.addtool(BikeTools.CONTA_KIL);
        
        b.printtools();
        
        b.removetool(BikeTools.GPS);
        
        System.out.println(" ");
        b.printtools();
        
    }
    
}
