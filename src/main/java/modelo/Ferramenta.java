package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
        private int id;
        private String nome;
        private String marca;
        private double preco;
        FerramentaDAO objeto = new FerramentaDAO();
        
        public Ferramenta(){
            this(0, "", "", 0.0);
        }
        
        public Ferramenta(int id, String ferramenta, String marca, double preco){
            this.id = id;
            this.nome = ferramenta;
            this.marca = marca;
            this.preco = preco;
            
        }

        public String getNome() {
            return objeto.getNomeDAO(this.getId(this.nome,this.marca));
        }
        public String getMarca(){
            return objeto.getMarcaDAO(this.getId(this.nome,this.marca));
        }
        public double getPreco(){
            return objeto.getPrecoDAO(this.getId(this.nome,this.marca));
        }
        public int getId(String nome, String marca){
            return objeto.getIdDAO(nome, marca);
        }

       
        public void setNome(String novoNome) {
            objeto.setNomeDAO(this.getId(this.nome,this.marca),novoNome);
            this.nome=novoNome;
        }
        public void setMarca(String novaMarca){
            objeto.setMarcaDAO(this.getId(this.nome,this.marca),novaMarca);
            this.marca = novaMarca;
        }
        public void setPreco(double novoPreco){
            objeto.setPrecoDAO(this.getId(this.nome,this.marca), novoPreco);
            this.preco = novoPreco;
        }
        
        public ArrayList getListaFerramenta(){
            return objeto.getMinhaListaDAO();
        }
        
        public boolean addFerramenta(String ferramenta, String marca, double preco) {
            objeto.insertFerramentaBD(ferramenta,marca,preco);
            return true;
        }
        
        public boolean deleteFerramentaBD(String ferramenta, String marca) {
            objeto.deleteFerramentaBD(ferramenta,marca);
            return true;
        }
        
    }
