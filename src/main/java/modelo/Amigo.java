package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {
    private String nome;
    private String telefone;
    AmigoDAO amigoDAO = new AmigoDAO();
    
    public Amigo(){
        this("", "");
    }
    
    public Amigo(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return amigoDAO.getNomeDAO(this.getIdAmigo(this.nome));
    }

    public String getTelefone() {
        return amigoDAO.getTelefoneDAO(this.getIdAmigo(this.nome));
    }
    
    public int getIdAmigo(String nome){
        return amigoDAO.getIdAmigoDAO(nome);
        
    }
    public void setNome(int idamigo, String nome) {
        this.nome = nome;
        amigoDAO.setNomeDAO(idamigo, nome);
        
    }

    public void setTelefone(int idamigo, String telefone) {
        this.telefone = telefone;
        amigoDAO.setTelefoneDAO(idamigo, telefone);
    }   
    
    public void addAmigo(String nome, String telefone){
        amigoDAO.addAmigoDAO(nome, telefone);
    }
    
    public void delAmigo(String nome, String telefone){
        amigoDAO.delAmigoDAO(nome, telefone);
    }
    
    public ArrayList getListaAmigos(){
        return amigoDAO.getMinhaListaAmigoDAO();
    }
}


