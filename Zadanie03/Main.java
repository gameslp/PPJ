package Zadanie03;

public class Main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();

        while (!donkey.isFlying()) {
            Balloon balloon = new Balloon();
            donkey.addBalloon(balloon);
        }

        System.out.println("Ja latam!!!");
    }
}
