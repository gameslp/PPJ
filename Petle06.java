public class Petle06 {
	public static void main (String[] args) {
		System.out.println("Zakładamy rok przestępny");
		int dzien = 24;
		int miesiac = 10;
		int[] dlugosci = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int wynik = 0;
		for (int i = 1; i < miesiac; i++) wynik += dlugosci[i];
		wynik += dzien;
		System.out.println("Liczba dni: " + wynik);
	}
}