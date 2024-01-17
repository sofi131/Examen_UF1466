package com.ceica.Modelos;
//Una vez hecha esta clase en vehículo para hacer los supers (dándole al título)
// y así coja los atributos correspondientes, la movemos dentro de este archivo que nos mandan crear.
public class VehiculoMotorizado extends Vehiculo{
    String tipoCombustible;


    public VehiculoMotorizado(String marca, String modelo, int year_fabricacion, String tipoCombustible) {
        super(marca, modelo, year_fabricacion);
        //pertenece a vehículo
        this.tipoCombustible = this.tipoCombustible;
    }
//toString con detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
}

