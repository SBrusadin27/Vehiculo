/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Brusita
 */
public class Ejecutable {
    public static void main(String[] args){
        /*Creacion objeto v1*/
        Vehiculo v1 = new Vehiculo();
        /*uso de setters para darle valores a los atributos*/
        v1.setNroUnidad(5);
        v1.setCantkm(3000);
        v1.setMarca("Toyota");
        v1.setAnio(2021);
        v1.setColor("Rojo");
        v1.setEstado("En Reparacion");
        v1.setPatente("AB 256 RC");
        v1.setModelo("Hilux");
        v1.setPuertas(4);
        v1.setTipoCombustible("YPF Infinia");
        Vehiculo v2 = new Vehiculo(567, "Chevrolet", "Onix", 2016, "BC 943 JK", 
                "Azul Marino", "Super De Axion", 2, 22500, "En Uso", 5, 9);
        /*Mostrar los valores*/
        System.out.println("Vehiculo 1: " + v1.toString());
        if(v1.pagaImpuestos(2022)){
            System.out.println("El Vehiculo 1 paga impuestos");
        }
        System.out.println(v1.calcularKm(2000) + " = Nueva Cantidad de KiloMetros"); 
        }
    }

