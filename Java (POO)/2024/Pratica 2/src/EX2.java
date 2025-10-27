/// Exercício 2) Fazer um programa que imprima na tela o somatório dos números de 0 a 10.

public class EX2 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 10 ; i++) {
            soma = soma + i;
        }
        System.out.println("Resultado da soma de 1 a 10: " + soma);
    }
}
