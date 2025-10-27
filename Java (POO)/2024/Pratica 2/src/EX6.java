
import java.util.Scanner;

/// Exercício 6) Fazer um programa que o usuário entre com uma frase e o programa imprima na tela
/// a frase com todos os caracteres em maiúsculo.

public class EX6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String a = scan.nextLine();

        String texto = a.toUpperCase();

        System.out.println( texto );
    }
}
