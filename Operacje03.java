public class Operacje03 {
	public static void main (String[] args) {
		int x = 10;
		String x_bin = Integer.toBinaryString(x);
		if (x_bin.endsWith("0")) {
			System.out.println("Parzysta");
		} else System.out.println("Nie parzysta");
		boolean czyParzysteBity = true;
		for (int i = 0; i < x_bin.length(); i+=2){
			if (x_bin.charAt(i) == '0') czyParzysteBity = false;
		}
		System.out.println(x_bin);
		System.out.println(czyParzysteBity ? "TAK": "NIE");
	}
}
