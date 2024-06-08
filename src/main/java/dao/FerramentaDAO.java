
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class FerramentaDAO {
    ConexaoDAO conexao = new ConexaoDAO();
    ArrayList ListaFerramentas = new ArrayList();
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
    
    public String getNomeDAO(int mudar){return "";}
    public String getMarcaDAO(int mudar){return "";}
    public double getPrecoDAO(int mudar){return 0.0;}
    public int getIdDAO(String nome, String marca){return 0;}
    

    public void setMarcaDAO(int mudar, String novo){}
    public void setPrecoDAO(int mudar, double novo){}
    
    public ArrayList getMinhaListaDAO(){return ListaFerramentas;}
    public void insertFerramentaBD(String nome, String marca, double preco){}
    public void deleteFerramentaBD(String nome, String marca){}
}
