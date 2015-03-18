/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.sql.SQLException;
import persistencia.PessoaDAO;
import java.util.ArrayList;
import negocio.Pessoa;
import negocio.Poder;
import negocio.SuperHeroi;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        SuperHeroi superman = new SuperHeroi();
        superman.setNome("Superman");
        superman.setIdentidadeSecreta("Clark Kent");
        superman.setFraqueza("Kriptonita");
        superman.setOrigem("Kripton");
        Poder superforca =  new Poder("SuperForça", "Ser super forte");
        Poder voar = new Poder("Voar","Permite planar no ar e espaço e galáxias");
        ArrayList<Poder> vetPoder =  new ArrayList();
        vetPoder.add(superforca);
        vetPoder.add(voar);
        superman.setVetPoder(vetPoder);
        superman.imprimir();
        
        SuperHeroi lanternaVerde = new SuperHeroi();
        lanternaVerde.setFraqueza("Acabar a bateria da lanterna");
        lanternaVerde.setNome("Ryan Reinold");
        lanternaVerde.getVetPoder().add(voar);
        
       lanternaVerde.imprimir();
        
       
       Pessoa gordon = new Pessoa("017XXXXX", "GordonXX", "Gothan");
        //System.out.println("Nome:"+gordon.getNome());
       gordon.imprimir();
       
       PessoaDAO pessoaDAO =  new PessoaDAO();
       boolean resultado = pessoaDAO.adicionar(gordon); 
       if (resultado){
           System.out.println("ok");
       } else {
           System.out.println("ERRO");
       }
               
               
               
               
               
       
       
       
    }

}
