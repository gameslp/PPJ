import java.util.Scanner;

public class Petle07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int xy = size * 2 + 1;
		for (int y = 1; y <= size; y++) {
			for (int x = 1; x <= (size + 1 - y); x++) System.out.print(". ");
			for (int x = 1; x <= xy  - (size + 1 - y) * 2; x++) System.out.print("* ");
			for (int x = 1; x <= (size + 1 - y); x++) System.out.print(". ");
			System.out.println();
		}
		for (int x = 1; x <= xy; x++) System.out.print("* ");
		System.out.println();
		for (int y = size; y >= 1; y--) {
			for (int x = 1; x <= (size + 1 - y); x++) System.out.print(". ");
			for (int x = 1; x <= xy  - (size + 1 - y) * 2; x++) System.out.print("* ");
			for (int x = 1; x <= (size + 1 - y); x++) System.out.print(". ");
			System.out.println();
		}
	}
}

		