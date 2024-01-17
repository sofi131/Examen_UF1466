package com.ceica.Modelos;

public class Vehiculo {
    String marca;
    String modelo;
    int year_fabricacion;

//constructor
    public Vehiculo(String marca, String modelo, int year_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.year_fabricacion = year_fabricacion;
    }
//clase mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año fabricación: " + year_fabricacion);

    }
}






