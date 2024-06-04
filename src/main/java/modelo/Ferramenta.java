package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
        private int id;
        private String ferramenta;
        private String marca;
        private double preco;
        FerramentaDAO objeto = new FerramentaDAO();
        
        public Ferramenta(){
            this(0, "", "", 0.0);
        }
        
        public Ferramenta(int id, String ferramenta, String marca, double preco){
            this.id = id;
            this.ferramenta = ferramenta;
            this.marca = marca;
            this.preco = preco;
            
        }
        
        public int getId(String nome, String marca){
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setFerramenta(String Ferramenta) {
            this.ferramenta = ferramenta;
        }
        
        public String getMarca(){
            return marca;
        }
        
        public void setMarca(String Marca){
            this.marca = marca;
        }
        
        public double getPreco(){
            return preco;
        }
        
        public void setPreco(double preco){
            this.preco = preco;
        }
        
        @Override
        public String toString(){
             return super.toString() + "ferramenta+" + ferramenta + ", marca=" + marca + "preco=" + preco;
        }
        
        public ArrayList getFerramenta(){
            return objeto.getMinhaLista();
        }
        
        public boolean addFerramenta(String ferramenta, String marca, double preco) {
            objeto.insertFerramentaBD(ferramenta,marca,preco);
            return true;
        }
        
        public boolean deleteFerramentaBD(String ferramenta, String marca) {
            objeto.deleteFerramentaBD(ferramenta,marca);
            return true;
        }
        
        public boolean updateFerramentaBD(int id, String ferramenta, String marca, double preco){
            Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
            dao.updateFerramenta(objeto);
            return true;
        }
        
        public Ferramenta carregaFerramenta(int id){
            return dao.carregaFerramenta(id);
        }
        
        public int maiorID() {
            return dao.maiorID();
        }
    }
