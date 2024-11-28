public class Metody05 {

    static boolean metoda (int[][] tablica1, int[][] tablica2) {
        if (tablica1.length != tablica2.length) return false;

        for (int i = 0; i < tablica1.length; i++) if (tablica1[i].length != tablica2[i].length) return false;

        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++) {
                if (tablica1[i][j] != tablica2[i][j]) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] tablica1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] tablica2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(metoda(tablica1, tablica2));

    }
}
