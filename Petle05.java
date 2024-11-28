import java.util.Scanner;

public class Petle05 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		a = s.nextFloat();
		
		int z5 = 0;
		int z2 = 0;
		int z1 = 0;
		int z05 = 0;
		int z02 = 0;
		int z01 = 0;
		int z005 = 0;
		int z002 = 0;
		int z001 = 0;
		
		//5 2 1 0.5 0.2 0.1 0.05 0.02 0.01
		while (5 <= a) {
			a -= 5;
			z5++;
		}
		while (2 <= a) {
			a -= 2;
			z2++;
		}
		while (1 <= a) {
			a -= 1;
			z1++;
		}
		while (0.5 <= a) {
			a -= 0.5;
			z05++;
		}
		while (0.2 <= a) {
			a -= 0.2;
			z02++;
		}
		while (0.1 <= a) {
			a -= 0.1;
			z01++;
		}
		while (0.05 <= a) {
			a -= 0.05;
			z005++;
		}
		while (0.02 <= a) {
			a -= 0.02;
			z002++;
		}
		while (0.01 <= a) {
			a -= 0.01;
			z001++;
		}
		
		if (z5 > 0) System.out.println(z5 + " * " + "5 zl");
		if (z2 > 0) System.out.println(z2 + " * " + "2 zl");
		if (z1 > 0) System.out.println(z1 + " * " + "1 zl");
		if (z05 > 0) System.out.println(z05 + " * " + "50 gr");
		if (z02 > 0) System.out.println(z02 + " * " + "20 gr");
		if (z01 > 0) System.out.println(z01 + " * " + "10 gr");
		if (z005 > 0) System.out.println(z005 + " * " + "5 gr");
		if (z002 > 0) System.out.println(z002 + " * " + "2 gr");
		if (z001 > 0) System.out.println(z001 + " * " + "1 gr");
	}
	
}
		
		
		