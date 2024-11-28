public class Operacje02 {
	public static void main (String[] args) {
		System.out.println((57 & 23) << 3);
		System.out.println((0b1101_0110 & 075) << 2);
		System.out.println((0b1010_1010 ^ 0x3F) | (0x3F >> 3));
		System.out.println((~037 & 0x1A) >> 1);
		
		System.out.println((92 ^ 45)  | (45 >> 2));
		System.out.println((0b1110_0011 | 067) >> 2);
		System.out.println((056 ^ 0x2B) & (056 << 1));
		System.out.println((~0b1001_1101 | 0x7C) << 3);
	}
}
		