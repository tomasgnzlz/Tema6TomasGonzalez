/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public class Pinturicas extends Obras {
    
    private double precio;

    public Pinturicas(double precio, String id, String autor, Obras pinturicas, Obras Escultoricas) {
        super(id, autor, pinturicas, Escultoricas);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pinturicas{" + "precio=" + precio + '}';
    }
    
    
    
    
    
    
}
