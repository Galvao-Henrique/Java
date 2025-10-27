//Exercício 3. Calcule a soma dos elementos de uma lista usando recursividade em que o tamanho
//da lista e a lista são inseridos pelo usuário em tempo de execução.
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do tamanho da lista: ");
        int tamanho = scan.nextInt();

        int[] lista = new int[tamanho];

        for (int i = 0; i < tamanho ; i++) {
            System.out.println("Digite os valores para lista: ");
            lista[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += lista[i];
        }

        System.out.println(soma);
        scan.close();
    }
}
