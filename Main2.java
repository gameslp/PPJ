public class Main2 {
	public static void main (String[] args) {
		byte b = 0176; // 126 w DEC
		System.out.println(++b); // ++b zwiększa b o 1 i zwraca nową wartość b czyli 127
		System.out.println(b++); // b++ zwiększa b o 1 i zwraca starą wartość b czyli 127
		System.out.println(b); // nowe b nie mieści się w 0b111_1111, program wypisuje -128 (-0b1000_0000)
	}
} 