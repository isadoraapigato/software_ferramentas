package dao;

import java.util.ArrayList;

public class EmprestimoDAO {
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
}
