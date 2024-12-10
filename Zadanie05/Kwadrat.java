package Zadanie05;

public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public void show() {
        System.out.println("Pole powierzchni: " + (bok * bok));
        System.out.println("Objętość sześcianu: " + (bok * bok * bok));
    }
}
