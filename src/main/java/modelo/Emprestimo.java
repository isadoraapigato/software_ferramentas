package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;

public class Emprestimo {
    private String data_Emprestimo;
    private String data_Devolucao;
    private int Amigoid;
    private int Ferramentaid;
    EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

    public Emprestimo() {
        this("","",0,0);
    }

    public Emprestimo(String data_Emprestimo, String data_Devolucao, int Amigoid, int Ferramentaid) {
        this.data_Devolucao = data_Devolucao;
        this.data_Emprestimo = data_Emprestimo;
        this.Amigoid = Amigoid;
        this.Ferramentaid = Ferramentaid;
    }
    
    public String getAmigo() {
        return emprestimoDAO.getAmigoDAO(this.Amigoid);
    }
    
    public String getFerramenta() {
        return emprestimoDAO.getFerramentaDAO(this.Ferramentaid);
    }
    
    public String getDataEmprestimo() {
        return emprestimoDAO.getDataEmprestimoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid));
    }
    
    public String getDataDevolucao() {
        return emprestimoDAO.getDataDevolucaoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid));
    }
    
    public int getEmprestimoid(int amigoid, int ferramentaid) {
        return emprestimoDAO.getEmprestimoidDAO(amigoid, ferramentaid);
    }
    
    public ArrayList getrelatorioAtivos() {
        return emprestimoDAO.getrelatorioAtivosDAO();
    }
    
    public ArrayList getrelatorioRealizados() {
        return emprestimoDAO.getrelatorioHistoricoDAO();
    }

    public void setDataDevolucao(String data_Devolucao) {
         this.data_Devolucao = data_Devolucao;
    }

    public void setDataEmprestimo(String data_Emprestimo) {
         this.data_Emprestimo = data_Emprestimo;
    }
    
    public int verificarAmigo(int amigoid){
        return emprestimoDAO.verificarAmigoDAO(amigoid);
    }

    public void addEmprestimo(int amigoid, int ferramentaid, String data_Emprestimo){
        emprestimoDAO.addEmprestimoDAO(amigoid, ferramentaid, data_Emprestimo);
    }
    
    public void addDevolucao(int emprestimoid, String Data_Devolucao){
        emprestimoDAO.addDevolucaoDAO(emprestimoid, Data_Devolucao);
    }
    
    public String AmigoMaisEmprestimos(){
        return emprestimoDAO.AmigoMaisEmprestimosDAO();
    }
}
