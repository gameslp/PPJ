public class Tablice07 {
	public static void main (String[] args) {
		int Min = 10, Max = 15;
		int dlugosc = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println("Długość: " + dlugosc);
		int randPos;
		int[] tablica = new int[dlugosc];
		for (int i = 0; i < dlugosc; i++) tablica[i] = -1;
		for (int i = 0; i < dlugosc; i++) {
			randPos = (int)(Math.random() * dlugosc);
			while (tablica[randPos] != -1) randPos = (int)(Math.random() * dlugosc);
			tablica[randPos] = i;
		}
		
		for (int i = 0; i < dlugosc; i++) System.out.print(tablica[i] + " ");
		System.out.println();
		
		for (int i = 0; i < dlugosc; i++) {
			int pos = 0;
			for (int k = 0; k < dlugosc; k++) if(tablica[k] == i) pos = k;
			
			for (int j = 0; j < pos; j++) System.out.print(tablica[j] < 10 ? ". " : ".  ");
			System.out.print(tablica[pos] < 10 ? "* " : "*  ");
			for (int j = pos + 1; j < dlugosc; j++) System.out.print(tablica[j] < 10 ? ". " : ".  ");
			System.out.println();
		}	
	}
}