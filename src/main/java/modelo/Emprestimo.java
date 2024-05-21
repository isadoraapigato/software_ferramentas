package modelo;

public class Emprestimo {
    private String DataDevolucao;
    private String DataEmprestimo;
            
    public Emprestimo () {
        this("","");
               
    }

    public Emprestimo(String DataDevolucao, String DataEmprestimo) {
        this.DataDevolucao = DataDevolucao;
        this.DataDevolucao = DataEmprestimo;
    }
    
    public String getDataDevolucao() {
        return DataDevolucao;
    }
    
    public String getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataDevolucao(String DataDevolucao) {
         this.DataDevolucao = DataDevolucao;
    }

    public void setDataEmprestimo(String DataEmprestimo) {
         this.DataEmprestimo = DataEmprestimo;
    }

}


        
    

