/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author tomas
 */
public class Estudiante extends Persona {

    private String id;

    public Estudiante(String nombre, String apellido, String nif, String direccion, String id) {
        super(nombre, apellido, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{ nombre= " + this.getNombre() + " id=" + id + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un Estudiante");
    }
    
    public void estudiarPco(){
        System.out.println("Estudio, pero poco");
    }

}
