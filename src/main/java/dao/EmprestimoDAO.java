package dao;

//imports

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO {
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
        return "bls";
    }
    
    public String getFerramentaDAO(int ferramentaid){
        // impolementar comando sql
        return "bls";
    }
    
    public int getEmprestimoidDAO(int amigoid, int ferramentaid){
        // impolementar comando sql
        return 0;
    }
    
    public int verificarAmigoDAO(int amigoid){
        // impolementar comando sql
        return 0;
    }
    
    public void addEmprestimoDAO(int amigoid, int ferramentaid){
        // impolementar comando sql
    }
    
    public void addDevolucaoDAO(int emprestimoid, String Data_Devolucao){
        // impolementar comando sql
    }
    
    public ArrayList getrelatorioAtivosDAO(){
        // impolementar comando sql
        return relatorios_ativos;
    }
    
    public ArrayList getEmprestimosTotal () {
        try{
            
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuerry("Select * from tb_emprestimos");
            
            while (res.next()){ 
                int id = res.getInt("emprestimoid");
                int amigoid = res.getInt("amigoid");
                Date dataEmprestimo = res.getDate("DataEmprestimo");
                Date dataDevolucao = res.getDate("DataDevolucao");
                boolean entregue = res.getBoolean("entregue");
             
                Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, entregue, emprestimoid, amigoid);
                ListaEmprestimosTotal.add(objeto);
                
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.printIn("Erro:" + ex);
        }
        return ListaEmprestimosTotal;
    }
    
    public int maiorId() {
        int maiorId = 0;
        try {
            
            Statement stmt = conexao.getConexao().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT MAX(emprestimoid) id FROM tb_emprestimos");
            res.next();
            maiorId = res.getInt("id");
            stmt.close();
            } catch (SQLException ex) {
                System.out.printIn("Erro aqui: " + ex);
        }
        return maiorId;
    }
    
    public boolean inserirEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimos(emprestimoid, amigoid, dataemprestimo, datadevolucao, entregue) VALUES(?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            
            stmt.setInt(1, objeto.getEmprestimoid());
            stmt.setInt(2, objeto.getamigoid());
            stmt.setDate(3, objeto.getDataEmprestimo();
            stmt.setDate(4, objeto.getDataDevolucao());
            stmt.setBoolean(5, objeto.isEntregue());
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException erro) {
            System.out.printIn("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    
    public boolean apagarEmprestimoBD (int id) {
        try {
            
            Statement stmt = conexao.getConexao().createStatement();
            
            stmt.executeUpdate("DELETE FROM tb_emprestimos WHERE emprestimoid = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.printIn("Erro aqui: " + erro);
            
        }
        return true;
        
    }
    
    
    public boolean alterarEmprestimoBD(Emprestimo objeto) {
        
        String sql = "UPDATE tb_emprestimos set data_devolucao = ?, entregue = ? WHERE emprestimoid = ?";
        
        try {
            
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            
            stmt.setDate(1, objeto.getDataDevolucao());
            stmt.setBoolean(2, objeto.isEntregue());
            stmt.setInt(3, objeto.getEmprestimoid());
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException erro) {
            System.out.printIn("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    
    public Emprestimo carregarEmprestimoBD(int id) {
        
        
        Emprestimo objeto = new Emprestimo ();
        objeto.setEmprestimoid(id);
        
        try {
            
            Statement stmt = conexao.getConexao().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE emprestimoid = " + emprestimoid);
            res.next();
            
            
            objeto.setAmigoid(res.getInt("amigoid"));
            objeto.setDataEmprestimo(res.getDate("dataEmprestimo"));
            objeto.setDataDevolucao(res.getDate("dataDevolucao"));
            objeto.setEntregue(res.getBoolean("entregue"));
            
            stmt.close();
            
        } catch (SQLException erro) {
            
            System.out.printIn("Erro aqui:" + erro);
        }
        
        return objeto;
    }
    
    public ArrayList<Emprestimo> getEmprestimosAtivo() {
        
        ListaEmprestimosAtivos.clear();
        
        try {
            
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE entregue is false");
            
            while (res.next()) {
             
                int id = res.getInt("emprestimoid");
                Date data_emp = res.getDate("data_emprestimo");
                Date data_dev = res.getDate("data_devolucao");
                boolean entregue = res.getBoolean("entregue");
                int idEmp = res.getInt("id_amigo");
                
                Emprestimo objeto = new Emprestimo(data_emp, data_dev, entregue, id, idEmp);
                ListaEmprestimosAtivos.add(objeto);      
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.printIn("Erro aqui: " + ex);
        }
        
        return ListaEmprestimosAtivos;
    }
    
    public boolean verificarPendencia (int id) {
        
        try {
            Statement stmt = conexao.getConexao().createStatement();
            
            ResultSet res = stmt.executeQuery("select emprestimoid, entregue from tb_emprestimos;");
            
            while (res.next()) {
                
                int idEmp = res.getInt("emprestimoid");
                boolean entregue = res.getBoolean("entregue");
                
                
                if (idEmp == id && entregue == false) {
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.printIn("Erro aqui: " + ex);
        }
        return false;
    }
    
    
    public boolean alterarIdEmpFerramentaPendente(int id) {
        String sql = "UPDATE tb_ferramentas SET emprestimoid = null WHERE emprestimoid = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);  
            
            stmt.setInt(1, id);
            stmt.execute();
            
            stmt.close();
            
            return true;
            
        } catch (SQLException erro) {
            System.out.printIn("Erro aqui: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    
    public ArrayList<Emprestimo> getEmprestimosPendentes() {
        
        ListaEmprestimosPendentes.clear();
        
        try {
            
            Statement stmt = conexao.getConexao().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE entregue is false AND data_devolucao < NOW ()");
            
            while (res.next()) {
                
                int id = res.getInt("emprestimoid");
                Date data_emp = res.getDate("data_emprestimo");
                Date data_dev = res.getDate("data_devolucao");
                boolean entregue = res.getBoolean("entregue");
                int idEmp = res.getInt("amigoid");
                
                Emprestimo objeto = new Emprestimo(data_emp, data_dev, entregue, id, idEmp);
                ListaEmprestimosPendentes.add(objeto);
                
            }
            
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.printIn("Erro aqui:" + ex);
        }
        return ListaEmprestimosPendentes;
    }
    
    public String valorTotal() {
        double soma = 0;
        
        try {
            String query = "SELECT SUM(preco) FROM tb_ferramentas";
            PreparedStatement statement = ConexaoDAO.getConexao().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                soma = resultSet.getDouble(1);
            }
        } catch (SQLException ex) {
            System.out.printIn("Erro aqui:" + ex);
        }
        
        String format = String.format("%.2f", soma);
        return format;
    }
}
