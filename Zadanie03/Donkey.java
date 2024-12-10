package Zadanie03;

public class Donkey {
    private double mass;
    private Balloon[] baloons;

    public Donkey () {
        this.mass = 10;
        this.baloons = new Balloon[0];
    }

    public void addBalloon(Balloon balloon) {
        Balloon[] balloons_tmp = new Balloon[this.baloons.length + 1];
        for (int i = 0; i < this.baloons.length; i++) {
            balloons_tmp[i] = this.baloons[i];
        }
        balloons_tmp[this.baloons.length] = balloon;
        this.baloons = balloons_tmp;
    }

    public boolean isFlying() {
        double maxLoad = 0.0;
        for (int i = 0; i < this.baloons.length; i++) {
            maxLoad += this.baloons[i].getLoad();
        }
        System.out.println(maxLoad + "/" + this.mass);
        return maxLoad >= this.mass;
    }
}
