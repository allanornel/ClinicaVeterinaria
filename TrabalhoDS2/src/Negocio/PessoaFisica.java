
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
public class PessoaFisica extends Cliente {
    String cpf;

    public PessoaFisica(String cpf, String nome, String sexo, ArrayList<Animal> vetorAnimais) {
        super(nome, sexo, vetorAnimais);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
