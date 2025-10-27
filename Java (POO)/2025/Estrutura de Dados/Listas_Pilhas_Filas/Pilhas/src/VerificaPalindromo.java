import java.util.Scanner;
import java.util.Stack;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        if(ehPalindromo(palavra)) {
            System.out.println(palavra + " É palíndromo");
        }else {
            System.out.println(palavra + " Não é palíndromo");
        }

        scan.close();
    }

    public static boolean ehPalindromo(String palavra){
        Stack<Character> pilha = new Stack<>();

        //Remove espaços e converte para minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        //Empilha todos os caracteres
        for (int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        //Compara
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) != pilha.pop()){
                return false;
            }
        }

        return true;
    }
}
