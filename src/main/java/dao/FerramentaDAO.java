
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public int getIdDAO(String nome, String marca){
    String sql = "SELECT COUNT(*) AS total FROM ferramentas WHERE nome = ? AND marca = ?";
        int ferramentaid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nome);
            stmt.setString(2, marca);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT idferramentas FROM ferramentas WHERE nome = ? AND marca = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nome);
                            stmt2.setString(2, marca);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                ferramentaid = res2.getInt("idferramentas");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar ferramenta: " + e.getMessage());
        }
        return ferramentaid;
    }
    

    public void setMarcaDAO(int mudar, String novo){}
    public void setPrecoDAO(int mudar, double novo){}
    
    public ArrayList getMinhaListaDAO(){return ListaFerramentas;}
    public void insertFerramentaBD(String nome, String marca, double preco){
        String sql = "INSERT INTO ferramentas(nome,marca,custo) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setDouble(3, preco);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void deleteFerramentaBD(String nome, String marca){}
}
