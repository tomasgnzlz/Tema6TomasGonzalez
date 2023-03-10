/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author tomas
 */
public class Microondas extends Electrodomestico implements Silencioso {
 
     private double potenciaMaxima; // w

    public Microondas(double potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMaxima=" + potenciaMaxima + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El Microondas consume 40dB");
    }
     
    
}
