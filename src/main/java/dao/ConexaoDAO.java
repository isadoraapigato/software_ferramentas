package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection getConexao() {
        Connection connection = null; // instância da conexão
        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            // Configurar a conexão
            String server = "localhost";
            String database = "emprestimo";
            String url = "jdbc:mysql://" + server + ":3306/"
            +database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "admin123";
            // Conectando..
            connection = DriverManager.getConnection(url, user, password);
            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver não foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            e.printStackTrace();
            return null;
        }
    }
}
