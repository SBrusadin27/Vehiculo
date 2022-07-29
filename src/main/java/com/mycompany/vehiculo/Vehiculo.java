/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehiculo;

/**
 *
 * @author Brusita
 */
// atributos de forma privada
public class Vehiculo {
    private int nroUnidad;
    private String marca;
    private String modelo;
    private int anio;
    private String patente;
    private Color color;
    private TipoCombustible tipoCombustible;
    private int puertas;
    private float cantkm;
    private String estado;
    
//Constructores
    public Vehiculo() {
        this.nroUnidad = 0;
        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.patente = "";
        this.color = new Color();
        this.tipoCombustible = new TipoCombustible();
        this.puertas = 0;
        this.cantkm = 0;
        this.estado = "";
    }

    public Vehiculo(int nroUnidad, String marca, String modelo, int anio, 
            String patente, String color, String tipoCombustible, int puertas, 
            float cantkm, String estado, int cod, int codi) {
        this.nroUnidad = nroUnidad;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.patente = patente;
        this.color = new Color(cod, color);
        this.tipoCombustible = new TipoCombustible(codi, tipoCombustible);
        this.puertas = puertas;
        this.cantkm = cantkm;
        this.estado = estado;
    }
//getters y setters
    public int getNroUnidad() {
        return nroUnidad;
    }

    public void setNroUnidad(int nroUnidad) {
        this.nroUnidad = nroUnidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = comprobarmarca(marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color.getNombre();
    }

    public void setColor(String color) {
        this.color.setNombre(color); 
    }

    public String getTipoCombustible() {
        return tipoCombustible.getCombustible();
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible.setCombustible(tipoCombustible);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getCantkm() {
        return cantkm;
    }

    public void setCantkm(float cantkm) {
        this.cantkm = cantkm;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String comprobarmarca(String marca){
        boolean bandera = false;
        final String [] arreglo = {"Toyota", "Renault", "Chevrolet", "Ford", 
            "Audi", "Camaro", "Tesla", "Honda", "Hundai", "Volkswagen", 
            "Peugeot", "Fiat"};
        for (int i = 0; i < 12; i++) {
            if (marca == arreglo[i]) {
                bandera = true;
            }
            
        }
        if (bandera){
            return marca;
        }else{
            return "Marca No Existente";
        }
   
    }

    /*Metodos Propios*/
    
    public float calcularKm(float cantkmNew){
        return this.cantkm + cantkmNew;
    }
    
    public boolean pagaImpuestos(int anioActual){
        int antiguedad = 0;
        antiguedad = anioActual - this.anio;
        return antiguedad <= 10;
    }
    public String toString(){
        return "Numero De Unidad: " + this.nroUnidad + "\nMarca: " + this.marca
                + "\nModelo: " + this.modelo + "\nAño: " + this.anio + 
                "\nPatente: " + this.patente + "\nColor: " + this.color + 
                "\nTipo De Combustible: " + this.tipoCombustible + 
                "\nCantidad De Puertas: " + this.puertas + 
                "\nCantidad De Kilometros: " + this.cantkm + 
                "\nEstado: " + this.estado;
    }
}
