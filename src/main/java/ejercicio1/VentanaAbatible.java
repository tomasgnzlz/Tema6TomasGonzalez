/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tomas
 */
public class VentanaAbatible extends Ventana {

    // Creo el constructor con los valores de la clase padre. 
    public VentanaAbatible(int numVentanas) {
        super(numVentanas);
    }

    // Creo un constructor vacío.
    public VentanaAbatible() {
    }

    // Como no tengo atributos en está clase, no hace falta que cree el toString, uso directamente el del padre.
    // Aunque si quisiera meter un toString, para que no quede vacio uso super.toString. 
    // Esto me mostraria por consola el to String del padre, pero creado en la clase hija. 
    @Override
    public String toString() {
        return super.toString(); // Uso el del padre. 
    }

    //Creo los métodos para abrir y cerrar dicha ventana. 
    public void abrirVentana() {
        System.out.println("La ventana abatible se está abriendo.");
    }

    public void cerrarVentana() {
        System.out.println("La ventana abatible se está cerrando.");
    }

}
