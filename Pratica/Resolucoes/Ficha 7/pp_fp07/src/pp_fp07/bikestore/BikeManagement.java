package pp_fp07.bikestore;

/**
 *
 * @author Jorge Moreira
 */
public class BikeManagement {

    private final int MAXBIKES = 20;
    private Bicycle[] bikelist = new Bicycle[MAXBIKES];
    private int count = 0;

    /**
     *
     * @param bike
     */
    public void addbike(Bicycle bike) {
        if (count < MAXBIKES) {
            bikelist[count] = bike;
            count += 1;
        } else {
            System.out.println("MAX Bikes");
        }
    } //ou pode percorrer o array e adicionar pra la
    
    /**
     *
     */
    public void printlist(){
        
    }

}
