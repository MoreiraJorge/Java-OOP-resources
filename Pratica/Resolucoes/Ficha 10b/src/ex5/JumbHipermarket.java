package ex5;

public class JumbHipermarket extends HiperMarket {


    public JumbHipermarket(double coffeePrice, double gasPrice,
                           double aRate, double potatoPrice, String name, int vatNumber) {
        super(coffeePrice, gasPrice, aRate, potatoPrice, name, vatNumber);
    }

    @Override
    int getPoints(double purchaseValue) {
        return 0;
    }

}
