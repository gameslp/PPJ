import java.util.Scanner;

public class Petle03 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int iloscLiczb = 0;
		int suma = 0;
		while (true) {
			a = s.nextInt();
			suma += a;
			iloscLiczb++;
			if (a == 0) break;
		}
		System.out.println("Ilosc liczb: " + iloscLiczb);
		System.out.println("Suma: " + suma);
	}
}
			