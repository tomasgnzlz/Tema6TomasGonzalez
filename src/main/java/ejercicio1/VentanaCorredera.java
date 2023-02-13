/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tomas
 */
public class VentanaCorredera extends Ventana {

    // Creo está ventana con los mismos atributos que la anterior. 
    // Es decir, solo los del padre. 
    public VentanaCorredera(int numVentanas) {
        super(numVentanas);
    }

    public VentanaCorredera() {
    }

    @Override
    public String toString() {
        return super.toString() + " || " + " VentanaCorredera{" + '}';
    }

    // ESTOS MÉTODOS LOS HEREDA, NO LOS VUELVO A HACER. 
    // Creo los métodos para abrir y cerrar dicha ventana. 
    public void abrirVentana() {
        System.out.println("La ventana corredera se está abriendo.");
    }

    public void cerrarVentana() {
        System.out.println("La ventana corredera se está cerrando.");
    }

}
