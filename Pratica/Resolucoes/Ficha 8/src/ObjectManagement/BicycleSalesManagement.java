package ObjectManagement;

import bikes.Bicycle;

public class BicycleSalesManagement extends ContainerOfObjects{

    private int SaleID;
    private SaleDate data;
    private double total;


    public BicycleSalesManagement(Bicycle[] objects, int saleID, SaleDate data) {
        SaleID = saleID;
        this.data = data;
    }
}
