import java.util.Scanner;

/// Exercício 1) Fazer um programa para calcular o fatorial de um número. Para se calcular o fatorial
/// de um número, é necessário multiplicar ele por todos os seus antecessores até chegar número 1.
/// Exemplo: para calcular o fatorial de 5 é necessário multiplicar 5 x 4 x 3 x 2 x 1.

public class EX1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = scan.nextInt();

        int res = 1;

        for (int i = 1; i <= n ; i++) {
            res = i * res;
        }
        System.out.println(res);
    }
}
