public class EX2 {
    public static int soma (int n) {
        if ( n == 0 ) {
            return 0;
        }
        return n + soma(n-1);
    }

    public static void main(String[] args) {
        System.out.println(soma(10));
    }
}
