/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public abstract class Empleado implements Comparable<Empleado>{
    // Declaración de atributos. 
    private String nif;
    private String nombre;

    // Constructor. 
    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }
    
    // Getters & Setters. 
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + '}';
    }

    // Comparable de empleado pr el nif. 
    @Override
    public int compareTo(Empleado e) {
        return this.nif.compareToIgnoreCase(e.nif);
    }
    
    
    
    
    
    
    
    
}
