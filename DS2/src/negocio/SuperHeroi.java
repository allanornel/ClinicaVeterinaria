/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class SuperHeroi extends Ser {
    private String identidadeSecreta;
    private String fraqueza;
    private ArrayList<Poder> vetPoder;

    public SuperHeroi() {
        this.vetPoder =  new ArrayList();              
    }   

    public SuperHeroi(String nome, String identidadeSecreta, String fraqueza, ArrayList<Poder> vetPoder) {
        this.nome = nome;
        this.identidadeSecreta = identidadeSecreta;
        this.fraqueza = fraqueza;
        this.vetPoder = vetPoder;
    }

    public String getIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public void setIdentidadeSecreta(String identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public ArrayList<Poder> getVetPoder() {
        return vetPoder;
    }

    public void setVetPoder(ArrayList<Poder> vetPoder) {
        this.vetPoder = vetPoder;
    }

    public void imprimir() {
        System.out.println("Nome:"+this.nome);
        System.out.println("Origem:"+this.origem);
        System.out.println("Identidade Secreta:"+this.identidadeSecreta);
        System.out.println("Fraqueza:"+this.fraqueza);
        System.out.println("Poderes.....");
        for (int i = 0; i < vetPoder.size(); i++) {
            Poder poder = vetPoder.get(i);
            System.out.println(poder.getNome()+":"+poder.getDescricao());
            
        }       
    }
    
    
    
    
    
    
}
