package principal;
import dao.ConexaoDAO;
public class Principal {

    public static void main(String[] args) {

        ConexaoDAO conexao = new ConexaoDAO();
        conexao.getConexao();
       
    }
}
