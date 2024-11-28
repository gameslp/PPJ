public class Instrukcje02 {
	public static void main (String[] args) {
		boolean czyPada = true;
		boolean czySwieciSlonce = true;
		if (czyPada) {
			if (czySwieciSlonce) {
				System.out.println("tęcza");
			} else {
				System.out.println("plucha");
			}
		} else {
			if (czySwieciSlonce) {
				System.out.println("slonczenie");
			} else {
				System.out.println("pochmurno");
			}
		}
	}
}