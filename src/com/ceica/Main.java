package com.ceica;

import com.ceica.Modelos.Automovil;
import com.ceica.Modelos.Motocicleta;
import com.ceica.Modelos.Vehiculo;
import com.ceica.Modelos.VehiculoMotorizado;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota","Azul",2024);
        //la clase para mostrar
        vehiculo.mostrarDetalles();
        //motorizado
        VehiculoMotorizado VehiculoMotorizado= new VehiculoMotorizado("Citroen", "Rojo", 2024,"gasolina");
        VehiculoMotorizado.mostrarDetalles();
        //automovil
        Automovil automovil = new Automovil("Ford", "Fiesta", 2024,"gasolina", 2);
        automovil.mostrarDetalles();
        //moto
        Motocicleta motocicleta = new Motocicleta("Seat", "Ibiza", 2024,"gasolina","rosa");
        motocicleta.mostrarDetalles();

    }
}
