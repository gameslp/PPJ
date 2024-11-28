public class Metody10 {
    public static int[] rozklad (int x) {
        int[] temp = new int[x];
        int dlugosc = 0;
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                temp[dlugosc] = i;
                dlugosc++;
                x = x / i;
                System.out.println(x);
            }
        }

        int[] wynik = new int[dlugosc + 1];
        for (int i = 0; i < dlugosc; i++) {
            wynik[i] = temp[i];
        }

        wynik[dlugosc] = 1;
        return wynik;
    }

    public static void main(String[] args) {
        int[] wynik = rozklad(25920);
        int[] of_wynik = new int[wynik.length];
        int dlugosc = 0;
        int last = wynik[0];
        int count = 0;
        for (int i = 0; i < wynik.length; i++) {

            if (wynik[i] != last) {
                of_wynik[dlugosc] = last;
                of_wynik[dlugosc + 1] = count;
                dlugosc += 2;
                last = wynik[i];
                count = 0;
            }
            count++;
        }

        for (int i = 0; i < dlugosc; i++) {
            System.out.print(of_wynik[i] + " ");
        }
    }
}
