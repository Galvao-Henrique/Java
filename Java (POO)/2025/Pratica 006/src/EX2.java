//Exercício 2. Crie um programa recursivo que calcule o n-ésimo termo da sequência de Fibonacci
//em que n é inserido pelo usuário em tempo de execução.

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor de n: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int soma = 0;

        System.out.println(1);
        System.out.println(1);

        for (int i = 1; i <= n ; i++) {
            soma = primeiro + segundo;
            primeiro = segundo;
            segundo = soma;
            System.out.println(soma);
        }
        scan.close();
    }
}
