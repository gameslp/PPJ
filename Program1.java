public class Program1 {
	public static void main (String[] args){
		System.out.println(1000000 == 1_000_000);
		System.out.println(10l == 10L);
		float liczba = 1234.567f;
		System.out.println(liczba);
		System.out.println(1234.567 == liczba);
		System.out.println(1234.567 == 12.34567E2);
		System.out.println(1234.567 == 1.234567E06);
		System.out.println(1234.567 == 1234567E-3);
		String a = "abc";
		int b = 123;
		long c = 123l;
		double d = 12.23d;
		float e = 12.25f;
		char f = 'a';
		boolean g = true;
		
		double a1 = .2;
		double a2 = 16.3;
		int a3 = 178;
		long a4 = 4L;
		double a5 = 567d;
		float a6 = 15.87F;
		boolean a7 = false;
		String a8 = "PPJ";
		char a9 = 'A';
		int a10 = 0b1_0101;
		int a11 = 0b10101;
		int a12 = 0120;
		int a13 = 0x2F;
		char a14 = '\u0041';
		double a15 = 0.031415e2;
		
		long b1 = 0x1234FFL;
		String b2 = "ppj";
		int b3 = 0x123456F;
		int b4 = 999612344;
		long b5 = 01234L;
		System.out.println("---------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}

/*
1.1
2.2
3.2
4.1
5.1
6.1
7.2
8.1
9.2
10.1
11.
*/