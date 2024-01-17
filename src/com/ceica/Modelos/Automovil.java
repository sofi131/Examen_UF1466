package com.ceica.Modelos;
// 2ºpaso:hago los mismos pasos que vehículo motorizado y así con el resto
public class Automovil extends VehiculoMotorizado{
    int numPuertas;

    public Automovil(String marca, String modelo, int year_fabricacion, String tipoCombustible, int numPuertas) {
        super(marca, modelo, year_fabricacion, tipoCombustible);
        this.numPuertas= numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numPuertas);
    }
}

