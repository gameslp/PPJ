public class Metody08 {
    static void bubbleSortIt (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tablica = { 6, 2, 6, 2, 3, 4, 8, 11, 10 };
        bubbleSortIt(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }

    }
}
