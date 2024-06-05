
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FerramentaDAO {
    ConexaoDAO conexao = new ConexaoDAO();
    
    public void setNomeDAO(int ferramentaid, String novoNome){
        String sql = """
                 UPDATE ferramentas
                 SET nome = (?)
                 WHERE idferramentas = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
}
