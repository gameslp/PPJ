public class Tablice04 {
	public static void main (String[] args) {
		int[] A = { 1, 5, 7, 8, 10};
		int[] B = { 11, 9, 6, 4, 2};
		
		int dlugosc = A.length + B.length;
		
		int[] C = new int[dlugosc];
		
		int poz1 = 0;
		int poz2 = B.length - 1;
		
		for (int i = 0; i < dlugosc; i++) {
			if (poz1 < A.length && A[poz1] < B[poz2]) {
				C[i] = A[poz1];
				poz1++;
			} else {
				C[i] = B[poz2];
				poz2--;
			} 
		}
		
		for (int i = 0; i < dlugosc; i++) {
			System.out.print(C[i] + ", ");
		}
	}
}	
		