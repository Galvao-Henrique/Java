// Exercício 1. Crie um programa recursivo que calcule o fatorial de um número n inserido pelo
// usuário em tempo de execução.

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n ; i++) {
            fatorial = i * fatorial;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
