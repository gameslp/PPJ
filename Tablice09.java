public class Tablice09 {
	public static void main (String[] args) {
		int[] a = { 2, 5, 1, 7, 4, 1, 3, 1 };
		double[] b = { 7, 1, 5, 7, 3, 6, 9, 5 };
		
		for (int i = 0; i < a.length; i++) {
			int newPos = 0;
			double suma = a[i] + b[i];
			while (suma <= a[newPos] + b[newPos] && newPos + 1 < a.length) newPos++;
			int a_temp = a[newPos];
			double b_temp = b[newPos];
			a[newPos] = a[i];
			b[newPos] = b[i];
			a[i] = a_temp;
			b[i] = b_temp;
		}
		
		for (int i = 0; i < a.length; i ++) System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < a.length; i ++) System.out.print(b[i] + " ");
		System.out.println();
		for (int i = 0; i < a.length; i ++) System.out.print((a[i] + b[i]) + " ");
	}
}

//Nie działa sortowanie wysyłam zeby zapisac