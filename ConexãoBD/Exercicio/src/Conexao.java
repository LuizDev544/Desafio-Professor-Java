
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {

        try {
            conectarBanco();
        } catch (SQLException e) {
            System.out.println("erro ao conectar no banco de dados" + e);
        }
        
    }

    public static void conectarBanco() throws SQLException{
        String url ="jdbc:mysql://localhost:3306/teste";
        String senha = "";
        String usuario = "root";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("conectamo no banco de dados");

        String sql = "INSERT INTO  usuario (nome , email , senha) VALUES (?,?,?)";

        PreparedStatement consQuery = conexao.prepareStatement(sql);
        consQuery.setString(1, "Pedro");
        consQuery.setString(2, "pedro@gmail.com");
        consQuery.setString(3, "adm");

    }
}
