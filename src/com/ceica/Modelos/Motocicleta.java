package com.ceica.Modelos;

public class Motocicleta extends VehiculoMotorizado{
    String tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int year_fabricacion, String tipoCombustible, String tipoMotocicleta) {
        super(marca, modelo, year_fabricacion, tipoCombustible);
        this.tipoMotocicleta=tipoMotocicleta;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de motocicleta: " + tipoMotocicleta);
    }

}
