public class Tablice05 {
	public static void main (String[] args) {
		int wynik = 1;
		
		int[] n = { 1, 1, 2, 3, 3};
		
		int[] wynikTablica = new int [n.length];
		
		wynikTablica[0] = n[0];
		
		int last = n[0];
		
		for (int i = 1; i < n.length; i++) {
			if (n[i] != last) {
				wynikTablica[wynik] = n[i];
				wynik++;
				last = n[i];
			}
		}
		
		System.out.println("Wynik: " + wynik);
		for (int i = 0; i < wynik; i++){
			System.out.print(wynikTablica[i] + ", ");
		}
	}
}
				