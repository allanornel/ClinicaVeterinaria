/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Consulta {
    Date data;
    String hora, tipo;
    Animal animal;
    Boolean pago;
    
    public void EfetuarPagamento(){
        this.pago = true;
    }

    public Consulta(Date data, String hora, String tipo, Animal animal, Boolean pago) {
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.animal = animal;
        this.pago = pago;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
    
    
}
