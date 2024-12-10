package Zadanie06;

public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show () {
        System.out.println("Pole powierzchni podstawy" + (2 * Math.PI * promien));
        System.out.println("Objętość: " + (2 * Math.PI * promien * wysokosc));
    }
}
