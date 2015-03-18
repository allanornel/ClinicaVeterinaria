/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa extends Ser {
    private String cpf;

    public Pessoa() {
    }   


    public Pessoa(String cpf, String nome, String origem) {
        this.nome = nome;
        this.cpf = cpf;
        this.origem =  origem;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome:"+this.nome);
        System.out.println("Cpf:"+this.cpf);
        System.out.println("Origem:"+this.origem);
    }
    
    
    
}
