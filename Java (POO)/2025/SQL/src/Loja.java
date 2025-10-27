
import java.sql.*;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=LojaDB;encrypt=false;trustServerCertificate=true";
        String user = "sa";   // coloque seu usuário
        String password = ""; // coloque sua senha

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();

                String sql = "INSERT INTO Pessoa (nome, idade) VALUES (?, ?)";
                try (Connection conn = DriverManager.getConnection(url, user, password);
                     PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, nome);
                    stmt.setInt(2, idade);
                    stmt.executeUpdate();
                    System.out.println("Pessoa cadastrada!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else if (opcao == 2) {
                String sql = "SELECT * FROM Pessoa";
                try (Connection conn = DriverManager.getConnection(url, user, password);
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " | " + rs.getString("nome") + " | " + rs.getInt("idade"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
