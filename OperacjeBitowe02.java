import java.util.Scanner;

public class OperacjeBitowe02 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe: ");
		int num = s.nextInt();
		String wynik_bin = "";
		String wynik_quad = "";
		String wynik_oct = "";
		String wynik_hex = "";
		int bit;
		
		for (int i = 31	; i >= 0; i--) {
			bit = (num >> i) & 1;
			wynik_bin += bit;
		}
		
		for (int i = 31; i >= 0; i -= 2) {
			bit = (num >> i) & 3;
			wynik_quad += bit;
		}
		
		for (int i = 31; i >= 0; i -= 3) {
			bit = (num >> i) & 7;
			wynik_oct += bit;
		}
		
		for (int i = 31; i >= 0; i -= 4) {
			bit = (num >> i) & 15;
			wynik_hex += bit;
		}
		
		System.out.println("Wynik Bin: " + wynik_bin);		
		System.out.println("Wynik Quad: " + wynik_quad);	
		System.out.println("Wynik Oct: " + wynik_oct);
		System.out.println("Wynik Hex: " + wynik_hex);
	}
}