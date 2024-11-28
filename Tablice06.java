public class Tablice06 {
	public static void main(String[] args) {
		int[] tablica = { 2, 2, 3, 2 };
		
		int maxWartosc = tablica[0];
		for (int i = 0; i < tablica.length; i++) {
			maxWartosc = Math.max(maxWartosc, tablica[i]);
		}
		
		int max2Wartosc = 0;
		
		for (int i = 0; i < tablica.length; i++) if (tablica[i] > max2Wartosc && tablica[i] != maxWartosc) max2Wartosc = tablica[i];
	
		System.out.println("Wynik: " + max2Wartosc);
	}
}