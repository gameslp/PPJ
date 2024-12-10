package Zadanie03;

public class Balloon {
    public double hel;

    public Balloon () {
        this.hel = 0.005 + ((0.009 - 0.005) * Math.random());
    }

    //0,007  waga
    //6      udzwig

    public double getLoad() {
        return ((this.hel * 6) / 0.007) / 1000;
    }
}
