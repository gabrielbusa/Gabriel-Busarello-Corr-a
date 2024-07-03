
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // URL do banco de dados MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco_de_dados";
    // Usuário do banco de dados
    private static final String USER = "root";
    // Senha do banco de dados
    private static final String PASSWORD = "";

    // Método para obter a conexão
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Obter a conexão
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Método principal para testar a conexão (opcional)
    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("Conexão estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao estabelecer conexão.");
        }
    }
}
