import java.util.Arrays;

public class Tablice03 {
	public static void main (String[] args) {
		int[] arr1 = { 24, 28, 7, 53, 12, 7};
		int[] arr2 = { 19, 7, 8, 18, 25};
		
		int[] wynik1 = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			wynik1[i] = arr1[i];
		}
		
		for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
			wynik1[i] = arr2[i - arr1.length];
		}

		for (int i = 0; i < arr1.length + arr2.length; i++) {
			System.out.print(wynik1[i] + ", ");
		} 
		
		System.out.println('\n' + "---");
		
		int[] wynik2 = new int[Math.min(arr1.length, arr2.length)];
		
		int dlugoscWynik2 = 0;
		
		Arrays.sort(arr1);
		
		int last = arr1[0] - 1;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j] && arr1[i] != last) {
					last = arr1[i];
					wynik2[dlugoscWynik2] = arr1[i];
					dlugoscWynik2++;
				}
			}
		}
		
		for (int i = 0; i < dlugoscWynik2; i++) {
			System.out.print(wynik2[i] +  ", ");
		}
		
		System.out.println('\n' + "---");
		
		int minWartosc = wynik1[0];
		int maxWartosc = wynik1[0];
		
		for (int i = 0; i < wynik1.length; i++) {
			minWartosc = Math.min(minWartosc, wynik1[i]);
			maxWartosc = Math.max(maxWartosc, wynik1[i]);
		}
		
		int[] wynik3 = new int[maxWartosc - minWartosc + 1];
		int dlugoscWynik3 = 0;
		for (int i = minWartosc; i <= maxWartosc; i++) { 
			boolean dodac = true;
			for (int j = 0; j < wynik1.length; j++) if (i == wynik1[j]) dodac = false;
			if (dodac) {
				wynik3[dlugoscWynik3] = i;
				dlugoscWynik3++;
			}
		}
		
		for (int i = 0; i < dlugoscWynik3; i++) {
			System.out.print(wynik3[i] + ", ");
		}
	}
}
		
		