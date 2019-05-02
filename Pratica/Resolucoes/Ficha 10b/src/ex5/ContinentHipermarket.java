package ex5;

public class ContinentHipermarket extends HiperMarket{


    public ContinentHipermarket(double coffeePrice, double gasPrice,
                                double aRate, double potatoPrice, String name, int vatNumber) {
        super(coffeePrice, gasPrice, aRate, potatoPrice, name, vatNumber);
    }

    @Override
    int getPoints(double purchaseValue) {
        return 0;
    }

}
