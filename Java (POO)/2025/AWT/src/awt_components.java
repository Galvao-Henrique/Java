import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt_components {
    public static void main(String[] args) {

        // Tratamento de Eventos da janela
        WindowAdapter wa = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Executado quando a janela é fechada (botão X)
                System.out.println("Fechando a Janela");
                System.exit(0); // encerra o programa
            }

            @Override
            public void windowOpened(WindowEvent e) {
                // Executado quando a janela é aberta
                System.out.println("Abrindo a Janela");
            }
        };

        // Definindo a Janela (Frame é a janela principal no AWT)
        Frame frame = new Frame("Exemplo AWT");
        frame.addWindowListener(wa);        // vincula os eventos da janela
        frame.setSize(500, 500);            // tamanho da janela (largura, altura)
        frame.setLayout(new FlowLayout());  // layout simples: os elementos são organizados em linha
        frame.setVisible(true);             // torna a janela visível

        // Botões
        Button b1 = new Button("Clique Aqui");  // cria um botão com texto
        Button b2 = new Button("Outro Botão");

        // Rótulos (Labels)
        Label l1 = new Label("Novo Texto");     // cria um rótulo já com texto
        Label lb = new Label("Label vazio");    // cria um rótulo com outro texto

        // Campos de texto (TextField = linha única para entrada de texto)
        TextField t1 = new TextField(20);               // campo vazio com largura de 20 colunas
        TextField t2 = new TextField("Digite Aqui", 20); // campo já preenchido com texto inicial

        // Áreas de texto (TextArea = múltiplas linhas)
        TextArea ta1 = new TextArea(12, 12);                // área vazia com 12 linhas e 12 colunas
        TextArea ta2 = new TextArea("Hello", 12, 12);       // área preenchida inicialmente com "Hello"

        // Checkbox (caixa de seleção independente)
        Checkbox C1 = new Checkbox("checkboxes");  // cria um checkbox com texto ao lado

        // RadioButtons (no AWT são simulados com CheckboxGroup)
        CheckboxGroup grp = new CheckboxGroup();   // grupo de botões (apenas um pode ser marcado)
        Checkbox op1 = new Checkbox("m", grp, true);   // opção "m" marcada por padrão
        Checkbox op2 = new Checkbox("f", grp, false);  // opção "f" não marcada

        // Lista de seleção (List)
        // O segundo parâmetro "true" permite seleção múltipla
        List L = new List(3, true);  // mostra até 3 itens visíveis de cada vez
        L.add("Primeiro");  // adiciona item
        L.add("Segundo");
        L.add("Terceiro");

        // Adicionando componentes à janela
        frame.add(b1);
        frame.add(b2);
        frame.add(l1);
        frame.add(lb);
        frame.add(t1);
        frame.add(t2);
        frame.add(ta1);
        frame.add(ta2);
        frame.add(C1);
        frame.add(op1);
        frame.add(op2);
        frame.add(L);

        // Obtém o texto inicial digitado em t2 e exibe no console
        String valor = t2.getText();
        System.out.println("Texto inicial em t2: " + valor);
    }
}
