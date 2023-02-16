/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author tomas
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private String nif;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona {" + "Nombre=" + nombre + ", NIF=" + nif + ", Edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona o) {
        // Hago que el comparator se ordene según el nif.
        return this.nif.compareTo(o.nif);
    }
}
