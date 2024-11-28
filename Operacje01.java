public class Operacje01 {
	public static void main (String[] args) {
		int x = 0;
		String s = "";
		int bin = 1;
		while (bin * 2 <= x) bin *= 2;
		while (bin > 0){
			if (bin <= x) {
				x -= bin;
				s = "1" + s;
			} else {
				s = "0" + s;
			}
			bin /= 2;
		}
		System.out.println(s);
	}
}
			