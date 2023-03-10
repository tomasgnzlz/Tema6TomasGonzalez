/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author tomas
 */
public class Frigorifico extends Electrodomestico implements Silencioso {
    
     private double capacidad; // L

     // Constructor
    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }
    
    // Getters & Setters.
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidad=" + capacidad + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El frigorifico emite 50dB");
    }
    
    
     
     
}
