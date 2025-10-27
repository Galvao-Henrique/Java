import java.util.Scanner;

/// Exercício 5) Fazer um programa para calcular o Índice de Massa Corporal. O programa deverá
/// exibir a janela de diálogo duas vezes, na primeira vez o usuário deverá fornecer o peso e na
/// segunda a altura. Em seguida, o programa deverá imprimir na tela o valor do IMC. A fórmula de
/// cálculo do IMC é peso/(altura*altura).

public class EX5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg: ");
        double p = scan.nextDouble();

        System.out.println("Digite sua altura: ");
        double a = scan.nextDouble();

        double imc;

        imc = p / (a * 2);

        System.out.println(imc);
    }
}
