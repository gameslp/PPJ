package Zadanie02;

public class Fruit {
    public String name;
    public double weight;

    public Fruit(String name) {
        this.weight = 0.5 + ((0.8 - 0.5) * Math.random());
        this.name = name;
    }

    public void Show() {
        System.out.println("Nazwa: " + name);
        System.out.println("Waga: " + weight);
    }
}
