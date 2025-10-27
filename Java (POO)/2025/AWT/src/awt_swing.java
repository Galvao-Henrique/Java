import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class awt_swing {
    public static void main(String[] args) {

        WindowAdapter wa = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Fechando Janela");
                System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e){
                System.out.println("Abrindo Janela");
            }
        };

        JFrame frame = new JFrame();
        frame.addWindowListener(wa);
        frame.setTitle("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.getContentPane().setBackground(new Color(204, 255 ,255));
        frame.setMaximizedBounds(new Rectangle(100, 100, 600, 400));

        // IMPORTANTE: desativa layout automático para usar setBounds()
        frame.setLayout(null);

        // Label e campo de texto
        JLabel label = new JLabel("Nome do Cliente: ");
        label.setBounds(10, 10, 120, 20);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(140, 10 ,150 ,20);
        textField.setForeground(Color.BLUE);
        textField.setToolTipText("Digite o nome do cliente: ");
        frame.add(textField);

        // RadioButtons
        JRadioButton rdbM = new JRadioButton("Masculino");
        rdbM.setBounds(10, 40, 100, 20);
        rdbM.setSelected(true);
        rdbM.setBackground(new Color(204, 255 ,255)); // cor igual ao fundo
        frame.add(rdbM);

        JRadioButton rdbF = new JRadioButton("Feminino");
        rdbF.setBounds(120, 40, 100, 20);
        rdbF.setBackground(new Color(204, 255 ,255));
        frame.add(rdbF);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbF);
        bg.add(rdbM);

        // CheckBoxes
        JCheckBox jcb1 = new JCheckBox("Primeira compra");
        jcb1.setBounds(10, 70, 150, 20);
        jcb1.setBackground(new Color(204, 255 ,255));
        frame.add(jcb1);

        JCheckBox jcb2 = new JCheckBox("Possui cupom de desconto");
        jcb2.setBounds(10, 95, 200, 20);
        jcb2.setBackground(new Color(204, 255 ,255));
        frame.add(jcb2);

        // ComboBox
        String[] formas ={ "Débito", "Dinheiro"};
        JComboBox jcBox = new JComboBox(formas);
        jcBox.setBounds(10, 130, 140, 20);
        jcBox.addItem("Crédito");
        jcBox.setSelectedIndex(1);
        jcBox.setEditable(true);
        frame.add(jcBox);

        // Lista com ScrollPane
        String[] produtos = {"Camisa", "Calça", "Sapato", "Bolsa", "Blusa"};
        JList jList = new JList(produtos);
        jList.setSelectedIndex(1);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scroll = new JScrollPane(jList);
        scroll.setBounds(180, 130, 140, 80);
        frame.add(scroll);

        // TextArea com ScrollPane
        JTextArea area = new JTextArea();
        area.setText("Texto");
        area.setEditable(true);

        JScrollPane scrollArea = new JScrollPane(area);
        scrollArea.setBounds(10, 170, 310, 100);
        frame.add(scrollArea);

        // Botão fechar
        JButton btnFechar = new JButton("Fechar");
        btnFechar.setBounds(10, 300, 100, 30);
        btnFechar.setMnemonic(KeyEvent.VK_F);

        btnFechar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);
                    }
                }
        );
        frame.add(btnFechar);

        // Torna a janela visível após adicionar todos os componentes
        frame.setVisible(true);
    }
}
