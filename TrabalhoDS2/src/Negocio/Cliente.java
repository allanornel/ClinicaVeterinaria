/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public abstract class Cliente {
    String nome, sexo;
    ArrayList<Animal> vetorAnimais;
    
    public Cliente(String nome, String sexo, ArrayList<Animal> vetorAnimais) {
        this.nome = nome;
        this.sexo = sexo;
        this.vetorAnimais = vetorAnimais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Animal> getVetorAnimais() {
        return vetorAnimais;
    }

    public void setVetorAnimais(ArrayList<Animal> vetorAnimais) {
        this.vetorAnimais = vetorAnimais;
    }
    public void AgendarConsulta(){
        
    }
}
