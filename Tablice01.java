public class Tablice01 {
	public static void main (String[] args) {
		double[] tablica = new double[10];
		for (int i = 0; i < 10; i++) {
			tablica[9 - i] = (i + 100) * i;
		}
		
		for (int i = 0; i < 10; i+=2) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if ((int) tablica[i] % 2 == 0) {
				System.out.print(tablica[i] + " ");
			}
		}
	}
}