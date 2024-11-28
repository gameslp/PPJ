public class Tablice08 {
	public static void main (String[] args) {
		int[] tab = { 1, 2 ,3 ,4, 5 , 3, 2, 1};
		boolean wynik = true;
		for (int i = 0; i < tab.length / 2; i ++) 
			if (tab[i] != tab[tab.length - 1 - i]) wynik = false;
		
		System.out.print(wynik);
	}
}