/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

import java.util.List;

/**
 *
 * @author tomas
 */
public class Escultoricas extends Obras {

    // Declaración de atributos. 
    private double precio;

    // Constructor parametrizado. 
    public Escultoricas(double precio, String id, String autor) {
        super(id, autor);
        this.precio = precio;
    }

    // Getters y Setters. 
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // ToString. 
    @Override
    public String toString() {
        return super.toString() + " || Escultoricas{" + "precio=" + precio + '}';
    }
    
    

    

}
