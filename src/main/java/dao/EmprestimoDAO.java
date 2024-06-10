package dao;

//imports

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Ferramenta;
import modelo.Emprestimo;

public class EmprestimoDAO {
     
    ArrayList minhaLista = new ArrayList();
    // conexão com o banco de dados
    ConexaoDAO conexao = new ConexaoDAO();
    
    // todos os empréstimos
    public ArrayList<Emprestimo> ListaEmprestimosTotal = new ArrayList<>();
    
    // empréstimos ativos
    public ArrayList<Emprestimo> ListaEmprestimosAtivos = new ArrayList<>();
    
    // empréstimos pendentes
    public ArrayList<Emprestimo> ListaEmprestimosPendentes = new ArrayList <>();
    
    
    ArrayList relatorios_ativos = new ArrayList();
    
    public String getAmigoDAO(int amigoid){
        // impolementar comando sql
        String sql = """
                     SELECT nome FROM db_amigos
                     WHERE amigoid = (?)""";
        String amigo = "";
        
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, amigoid);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                amigo = rs.getString("nome");
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
        return amigo;
    }
    
    public String getFerramentaDAO(int ferramentaid){
        // impolementar comando sql
        String sql = """
                     SELECT nome FROM db_ferramentas
                     WHERE ferramentaid = (?)""";
        String ferramenta = "";
        try { 
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, ferramentaid);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                ferramenta = rs.getString("nome");
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
        return ferramenta;
    }
    
    public int getEmprestimoidDAO(int amigoid, int ferramentaid){
        // impolementar comando sql
        String sql = "SELECT COUNT (*) AS total FROM db_emprestimos WHERE amigoid = ? AND ferramentaid = ?";
        int emprestimoid = 0;
        
        try (Connection conn = conexao.getConexao();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, amigoid);
            stmt.setInt(2, ferramentaid);
            
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    
                    int totalEmprestimos = res.getInt("total");
                    if (totalEmprestimos > 0) {
                        
                        sql = """
                              SELECT emprestimoid
                              FROM db_emprestimos
                              WHERE amigoid = ? AND ferramentaid = ?
                              ORDER BY emprestimoid DESC
                              LIMIT 1""";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setInt(1, amigoid);
                            stmt2.setInt(2, ferramentaid);
                            
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                emprestimoid = res2.getInt("emprestimoid");
                            }
                        }
                    } else {
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro editando o emprestimo: " + e.getMessage());
        }
        return emprestimoid;
    }
    
    public String getDataEmprestimoDAO(int emprestimoid) {
        String sql = """
                     SELECT data_emprestimo FROM db_emprestimos
                     WHERE emprestimoid = (?)""";
        String dataEmprestimoReturn = "";
        
        try {
            Connection connection = conexao.getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emprestimoid);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                dataEmprestimoReturn = rs.getString("data_emprestimo");
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
        
        return dataEmprestimoReturn;
    }
    
    
    public String getDataDevolucaoDAO(int emprestimoid) {
        String sql = """
                     SELECT data_devolucao FROM db_emprestimos
                     WHERE emprestimoid = (?)""";
        String dataDevolucao = null;
        
        try {
          
            Connection connection = conexao.getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emprestimoid);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                dataDevolucao = rs.getString("data_devolucao");
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
        
        return dataDevolucao;
    }
    
    
    public ArrayList getEmprestimoDAO(){
        minhaLista.clear();
        
        try { Statement stmt = conexao.getConexao().createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos");
        while (res.next()) {
            int amigoid = res.getInt("amigoid");
            int ferramentaid = res.getInt("ferramentaid");
            String dataEmprestimo = res.getString("data_emprestimo");
            String dataDevolucao = res.getString("data_devolucao");
            Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, amigoid, ferramentaid);
        }
        
        stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Operação sem sucesso");
        }
        
        return minhaLista;
    }
    
    
    // Verificar
    
    public int verificarAmigoDAO(int amigoid){
        // implementar comando sql
        String sql = """
                     SELECT data_Devolucao FROM db_emprestimos
                     WHERE amigoid = (?)
                     ORDER BY emprestimoid DESC
                     LIMIT 1
                     """;
        String Data_Devolucao = "a";
        
        try {
            Connection connection = conexao.getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, amigoid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Data_Devolucao = rs.getString("data_Devolucao");
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
        
        if(Data_Devolucao.compareTo("") == 0) {
            return -1;
        }else{
            return amigoid;
        }
    }
    
    
    // Adicionar
    public void addEmprestimoDAO(int amigoid, int ferramentaid, String Data_Emprestimo) {
        // implementar comando sql
            String sql = """
                         INSERT INTO db_emprestimos
                         (amigoid, ferramentaid, data_emprestimo, data_devolucao)
                         VALUES(?, ?, ?, ?)
                         """;
            
            try {
                PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
                stmt.setInt(1, amigoid);
                stmt.setInt(2, ferramentaid);
                stmt.setString(3, Data_Emprestimo);
                stmt.setString(4, "");
                stmt.execute();
                stmt.close();
            } catch (SQLException erro) {
                System.out.println("Erro aqui: " + erro);
                throw new RuntimeException(erro);
            }
        
    }
    
    
    
    public void addDevolucaoDAO(int emprestimoid, String Data_Devolucao){
        // implementar comando sql
        String sql = """
                     UPDATE db_emprestimos
                     SET data_devolucao = (?)
                     WHERE emprestimoid = (?)
                     """;
        
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, Data_Devolucao);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    
    
    public ArrayList getrelatorioAtivosDAO(){
        // implementar comando sql
        minhaLista.clear();
        
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos WHERE data_devolucao = ''");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String data_emprestimo = res.getString("data_emprestimo");
                Emprestimo objeto = new Emprestimo("", data_emprestimo, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Operação sem sucesso");
        }
        return minhaLista;
    }
    
    
    public ArrayList getrelatorioHistoricoDAO(){
        minhaLista.clear();
        Amigo amigoNome = new Amigo();
        Ferramenta FerramentaNome = new Ferramenta();
        
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos WHERE Data_Devolucao <> ''");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String data_emprestimo = res.getString("data_Emprestimo");
                String data_devolucao = res.getString("Data_Devolucao");
                Emprestimo objeto = new Emprestimo(data_devolucao, data_emprestimo, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Operação sem sucesso");
        }
        return minhaLista;
    }
    
    
    public String maisEmprestimosDAO(){
        String sql = """
                     SELECT a.nome, COUNT(e.amigoid) AS ocorrencias
                     FROM db_amigos a
                     JOIN db_emprestimos e ON a.amigoid = e.amigoid
                     GROUP BY a.nome
                     ORDER BY ocorrencias DESC
                     LIMIT 1""";
        String nomeMaisFrequente  = "";
        try (Connection conn = conexao.getConexao();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet res = stmt.executeQuery()) {
            if (res.next()) {
                nomeMaisFrequente = res.getString("nome");
            }
        } catch (SQLException e) {
            System.out.println("Não foi possível buscar o nome mais frequente: " + e.getMessage());
        }
        
        return nomeMaisFrequente;
    }
}