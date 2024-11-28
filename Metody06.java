public class Metody06 {
    static int[] splitToDigits(int wrt){
        int tmp = wrt;
        int dlugosc = 0;
        while (tmp > 0) {
            dlugosc++;
            tmp /= 10;
        }

        int[] wynik = new int[dlugosc];

        for (int i = 0; i < dlugosc; i++) {
            wynik[dlugosc - i - 1] = wrt % 10;
            wrt /= 10;
        }

        return wynik;
    }

    public static void main(String[] args) {
        int [] wynik = splitToDigits(172377);
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
    }
}
