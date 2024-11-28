public class Metody03 {
    static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findMax(5, 15, 10));
    }
}
