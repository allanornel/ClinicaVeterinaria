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
public class Animal {
    String nome, raça, sexo, tipoSanguineo, especie;
    ArrayList<Consulta> vetorConsulta;
    
    public void Excluir(){
        
    }

    public Animal(String nome, String raça, String sexo, String tipoSanguineo, String especie) {
        this.nome = nome;
        this.raça = raça;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public ArrayList<Consulta> getVetorConsulta() {
        return vetorConsulta;
    }

    public void setVetorConsulta(ArrayList<Consulta> vetorConsulta) {
        this.vetorConsulta = vetorConsulta;
    }
}
