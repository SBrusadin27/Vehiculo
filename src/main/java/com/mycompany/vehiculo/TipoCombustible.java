/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Admin
 */
public class TipoCombustible {
    /*DECLARACION ATRIBUTOS*/
    private int codi;
    private String combustible;

    /*CREACION CONSTRUCTORES*/
    public TipoCombustible() {
        this.codi = 0;
        this.combustible = "";
    }

    public TipoCombustible(int codi, String combustible) {
        this.codi = codi;
        this.combustible = combustible;
    }

    /*CREACION CONSTRUCTORES*/
    public int getCod() {
        return codi;
    }

    public void setCod(int codi) {
        this.codi = codi;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    /*CREACION METODOS PROPIOS*/
    public String toString(){
        return "Codigo: " + this.codi + " | El Combustible es: " + this.combustible;
    }
}
