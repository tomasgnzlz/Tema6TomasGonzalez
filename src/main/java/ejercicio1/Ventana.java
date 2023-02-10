/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tomas
 */
public class Ventana {
    private int numVentanas;

    public Ventana(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public Ventana() {
    }
    
    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    @Override
    public String toString() {
        return "Ventana{" + "numVentanas=" + numVentanas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.numVentanas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ventana other = (Ventana) obj;
        return this.numVentanas == other.numVentanas;
    }
    
    // Métodos que se necesitan en está clase.
    
    public void abrirVentana(){
        System.out.println("La ventana está abierta");
    }
    
    public void cerrarVentana(){
        System.out.println("La ventana está cerrada");
    }
}
