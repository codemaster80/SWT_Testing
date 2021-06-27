package Aufgabe4;

public class wasserkostenCalc {
    double basePrice = 18.14;
    double consumptionPrice = 2.11;


    public double calculate(int month, int qm3) {
        if(month <= 0 || month > 12 || qm3 < 0 || qm3 > 2147483647) {
            throw new IllegalArgumentException();
        }
        double cost = (month * basePrice) + (qm3 * consumptionPrice);

        return cost;
    }
}
