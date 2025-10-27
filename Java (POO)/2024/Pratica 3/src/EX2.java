import java.util.Scanner;

/// Exercício 2) Fazer um programa para que o usuário entre com um número inteiro. Após isso, o
/// programa deve calcular o termo correspondente da sequência de Fibonacci.

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = scan.nextInt();

        System.out.println("1");
        System.out.println("1");

        int primeiro = 1;
        int segundo = 1;
        int soma = 0;

        for (int i = 1; i < n; i++) {
            soma = primeiro + segundo;

            primeiro = segundo;
            segundo = soma;

            System.out.println(soma);
        }
    }
}
