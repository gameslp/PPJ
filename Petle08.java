import java.lang.Math;

public class Petle08 {
	public static void main (String[] args) {
		int n = 10;
		int suma = 0;
		for (int i = 1; i <= n; i++) suma += i * (i + 1);
		int poprawnaSuma = (n * (n + 1) * (n + 2)) / 3;
		System.out.println("Suma: " + suma + " Poprawna Suma: " + poprawnaSuma);
		
		suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += (int) Math.pow(-1, i - 1) * (int) Math.pow(i, 2);
		}
		poprawnaSuma = ((int) Math.pow(-1, n - 1) * n * (n + 1)) / 2;
		System.out.println("Suma 2: " + suma + " Poprawna Suma 2: " + poprawnaSuma);
	}
}