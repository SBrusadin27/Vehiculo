/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Brusita
 */
public class Color {
    /*DECLARACION ATRIBUTOS*/
    private int cod;
    private String nombre;
    
    /*CREACION CONSTRUCTORES*/
    public Color() {
        this.cod = 0;
        this.nombre = "";
    }

    public Color(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    /*CREACION GETTERS AND SETTERS*/
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*CREACION METODOS PROPIOS*/
    
    /*TOSTRING PARA MOSTRAR LOS ATRIBUTOS*/
    public String toString(){
        return "El Codigo del Color es: " + this.cod + "\nEl Nombre es: " + this.nombre;
                }
    
    
    
}
