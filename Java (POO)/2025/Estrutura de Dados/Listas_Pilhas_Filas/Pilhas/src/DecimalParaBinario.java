import java.util.Scanner;
import java.util.Stack;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero decimal para converter em binario: ");
        int decimal = scan.nextInt();

        Stack<Integer> pilha = new Stack<>();

        int numero = decimal;

        if (numero == 0){
            pilha.push(0);
        } else {
            while (numero > 0){
                pilha.push(numero % 2);
                numero = numero / 2;
                }
            }

        System.out.println("Numero binário: ");
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

        System.out.println();
        scan.close();
    }
}