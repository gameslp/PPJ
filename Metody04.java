public class Metody04 {
    static int[] metoda (int[] tablica1, int[] tablica2, int x) {
        int dlugosc = Math.min(tablica1.length, tablica2.length);
        int maxDlugosc = Math.max(tablica1.length, tablica2.length);

        if (dlugosc == maxDlugosc) {
            return new int[0];
        }

        if (x < 0) {
            int[] wynik = new int[dlugosc];
            for (int i = 0; i < dlugosc; i++) wynik[i] = tablica1[i] + tablica2[i];
            return wynik;
        }

        if (x > 0) {
            int[] wynik = new int[maxDlugosc - dlugosc];
            for (int i = dlugosc; i < maxDlugosc; i++) {
                if (tablica1.length > tablica2.length) {
                    wynik[i - dlugosc] = tablica1[i];
                } else {
                    wynik[i - dlugosc] = tablica2[i];
                }
            }
            return wynik;
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] tablica1 = { 1, 6, 3, 7, 3, 9, 10, 13, 6, 2};
        int[] tablica2 = { 5, 4, 1, 8, 12, 20, 2};

        int [] wynik = metoda(tablica1, tablica2, -1);

        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
    }
}
