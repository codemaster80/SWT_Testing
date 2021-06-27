package Aufgabe3;

public class wasserkosten {
    double basePrice = 18.14;
    double consumptionPrice = 2.11;


    public double calculate(int month, int qm3) {
        if(month <= 0 || month > 12 || qm3 < 0 || qm3 > 2147483647) {
            throw new IllegalArgumentException();
        }
        double cost = (month * basePrice) + (qm3 * consumptionPrice);
        cost = Math.round(cost * 100.0) / 100.0;

        return cost;
    }
}
