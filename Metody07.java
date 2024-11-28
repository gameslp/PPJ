public class Metody07 {
    public static void swap(int[] tab, int source, int destination) {
        int temp = tab[source];
        tab[source] = tab[destination];
        tab[destination] = temp;
    }

    public static void main(String[] args) {
        int[] tablica = { 1, 5, 6, 2, 7, 9, 10};

        swap(tablica, 0, 1);
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}
