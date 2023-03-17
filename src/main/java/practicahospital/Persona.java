/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

import java.time.LocalDate;

/**
 *
 * @author tomas
 */
public abstract class Persona { // (-privado || +publico)
    // Declaración de atributos. 
    private String nombre;
    private String apellidos;
    private NIF nif; // De la clase creada previamente. 

    // Constructor. 
    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    // Getters y Setters. 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
    
    public static void renovarNIF(LocalDate fechaSolicitud){
        System.out.println("SE TIENE QUE RENOVAR EL NIF EN LA FECHA: "  + fechaSolicitud);
    }
    
    
    
    
}
