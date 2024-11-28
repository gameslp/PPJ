import java.util.ArrayList;

public class Metody09 {

    public static boolean isSecondBigger (String a, String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if ((int) b.charAt(i) > (int) a.charAt(i)) return true;
                else return false;
            }
        }
        return true;
    }

    public static String[] metoda (String wartosc) {
        String[] slowa = wartosc.split("[,.; ]");
        String najkrotsze = slowa[0];
        String najdluzsze = slowa[0];

        for (int i = 0; i < slowa.length; i++) {
            if (slowa[i].length() < najkrotsze.length()) najkrotsze = slowa[i];
            if (slowa[i].length() > najdluzsze.length()) najdluzsze = slowa[i];
        }

        String najmniejsze = slowa[0];
        String najwieksze = slowa[0];

        for (int i = 0; i < slowa.length; i++) {
            if (isSecondBigger(najwieksze, slowa[i])) najwieksze = slowa[i];
            if (isSecondBigger(slowa[i] , najmniejsze)) najmniejsze = slowa[i];
        }

        String[] wynik = {
                String.valueOf(slowa.length),
                najkrotsze,
                najdluzsze,
                najmniejsze,
                najwieksze
        };

        return wynik;
    }

    public static void main(String[] args) {
        String s = "She,lived;on.Monkey Jungle Road and that seemed to explain all of her strangeness.";

        String[] wynik = metoda(s);
        for (int i = 0; i < wynik.length; i++) {
            System.out.println(wynik[i]);
        }
    }
}
