import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		int rok;
		System.out.println("Podaj rok: ");
		Scanner s = new Scanner(System.in);
		rok = s.nextInt();
		
		if (rok % 400 == 0 || (rok % 4 == 0 && rok % 100 != 0)){
			System.out.println("Rok " + String.valueOf(rok) + " jest przestępny");
		} else {
			System.out.println("Rok " + String.valueOf(rok) + " nie jest przestępny");
		}
	}
}