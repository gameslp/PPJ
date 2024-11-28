public class Tablice02 {
	public static void main (String[] args) {
		boolean[] tablica = { true, false, true, true, true, false, true, false }; 
		int liczbaTrue = 0;
		int liczbaFalse = 0;
		
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i]) liczbaTrue++;
			if (!tablica[i]) liczbaFalse++;
		}
		
		boolean[] tablicaTrue = new boolean[liczbaTrue];
		boolean[] tablicaFalse = new boolean[liczbaFalse];
		
		for (int i = 0; i < tablicaTrue.length; i++) {
			tablicaTrue[i] = true;
			System.out.println(tablicaTrue[i] ? "TRUE" : "FALSE");
		}
		
		System.out.println("---");
		
		for (int i = 0; i < tablicaFalse.length; i++) {
			tablicaFalse[i] = false;
			System.out.println(tablicaFalse[i] ? "TRUE" : "FALSE");
		}
		
	}
}
		