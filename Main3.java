import java.util.Scanner;

public class Main3 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		float t_f;
		System.out.println("Podaj temperaturę w skali Fahrenheita: ");
		t_f = s.nextFloat();
		float t_c = ( t_f - 32 ) / 1.8f;
		System.out.println("Temperatura w stopniach Celsjusza: " + String.valueOf(t_c));
		
	}
}