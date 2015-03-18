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
public class PessoaJuridica extends Cliente{
    String cnpj;

    public PessoaJuridica(String cnpj, String nome, String sexo, ArrayList<Animal> vetorAnimais) {
        super(nome, sexo, vetorAnimais);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
