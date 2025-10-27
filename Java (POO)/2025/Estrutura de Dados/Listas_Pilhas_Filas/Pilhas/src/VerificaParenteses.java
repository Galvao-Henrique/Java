import java.util.Stack;
import java.util.Scanner;

public class VerificaParenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão matemática: ");
        String expressao = scanner.nextLine();

        if (parentesesBalanceados(expressao)) {
            System.out.println("Os parênteses estão balanceados!");
        } else {
            System.out.println("Os parênteses NÃO estão balanceados!");
        }

        scanner.close();
    }

    public static boolean parentesesBalanceados(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
