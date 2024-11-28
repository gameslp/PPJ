public class Metody02 {
    static void modifyValue (int wartosc) {
        System.out.println(wartosc);
        wartosc *= 5;
        System.out.println(wartosc);
    }

    public static void main(String[] args) {
        int wrt = 5;

        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt);

    }
}
