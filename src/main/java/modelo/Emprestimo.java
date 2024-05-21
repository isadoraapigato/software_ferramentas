package modelo;

public class Emprestimo {
    private String data_Emprestimo;
    private String data_Devolucao;
    
    public Emprestimo () {
        this("","");
               
    }

    public Emprestimo(String data_Devolucao, String data_Emprestimo) {
        this.data_Devolucao = data_Devolucao;
        this.data_Devolucao = data_Emprestimo;
    }
    
    public String getDataDevolucao() {
        return data_Devolucao;
    }
    
    public String getDataEmprestimo() {
        return data_Emprestimo;
    }

    public void setDataDevolucao(String data_Devolucao) {
         this.data_Devolucao = data_Devolucao;
    }

    public void setDataEmprestimo(String data_Emprestimo) {
         this.data_Emprestimo = data_Emprestimo;
    }

}


        
    

