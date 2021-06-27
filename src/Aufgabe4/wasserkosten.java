package Aufgabe4;

public class wasserkosten {
    double cost = 0;
    wasserkostenCalc w;

    public wasserkosten(wasserkostenCalc w) {
        this.w = w;
    }

    public double calc(int month, int qm3) {
        cost = w.calculate(month, qm3); // Methode die rausgemockt werden soll

        return Math.round(cost * 100.0) / 100.0; // round
    }
}