package Interfaces;

/**
 *
 * @author Jorge Moreira
 */
public interface GasService {
    
    public double getGasPrice();
    
    public void setGasPrice(double p);
    
    public double getGasTotal(double litres);
}
