package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
        private int id;
        private String ferramenta;
        private String marca;
        private double preco;
        FerramentaDAO dao;
        
        public Ferramenta(){
            this(0, "", "", 0.0);
        }
        
        public Ferramenta(int id, String ferramenta, String marca, double preco){
            this.id = id;
            this.ferramenta = ferramenta;
            this.marca = marca;
            this.preco = preco;
            dao = new FerramentaDAO();
            
        }
        
        public int getId(){
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFerramenta() {
            return ferramenta;
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
        
        public ArrayList<Ferramenta> getMinhaLista(){
            return dao.getMinhaLista();
        }
        
        public boolean insertFerramentaBD(String ferramenta, String marca, double preco) {
            int id = this.maiorID()+1;
            Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
            dao.insertFerramentaBD(objeto);
            return true;
        }
        
        public boolean deleteFerramentaBD(int id) {
            dao.deleteFerramentaBD(id);
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
