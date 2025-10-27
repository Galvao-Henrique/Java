public class EX1 {
    public static int lista_numero(int n) {
        if (n == 0) {
            System.out.println(0);
            return 0;
        }
        System.out.println(n);
        return lista_numero(n-1);
    }
    public static void main(String[] args) {
        lista_numero(5);
    }
}
