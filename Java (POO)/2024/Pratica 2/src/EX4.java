import java.util.Scanner;

/// Exercício 4) Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o
/// usuário irá entrar com um número inteiro. Após isso o programa deverá imprimir na tela o somatório dos valores.

public class EX4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        int x = scan.nextInt();

        System.out.println("Digite o 2° valor: ");
        int y = scan.nextInt();

        System.out.println("Digite o 1° valor: ");
        int z = scan.nextInt();

        int soma;

        soma = x + y + z;

        System.out.println(soma);
    }
}
