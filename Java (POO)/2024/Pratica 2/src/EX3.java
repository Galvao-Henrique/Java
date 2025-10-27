/// Exercício 3) Fazer um programa que imprima na tela a média dos números ímpares que estão no intervalo entre 0 e 100.

public class EX3 {
    public static void main(String[] args) {
        int soma = 0;
        int cont = 0;

        for (int i = 1; i <= 100 ; i += 2 ) {
            soma += i;
            cont ++;
        }

        double media = (double) soma / cont;
        System.out.println(media);
    }
}
