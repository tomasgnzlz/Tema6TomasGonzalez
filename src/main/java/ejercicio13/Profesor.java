/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author tomas
 */
public abstract class Profesor extends Persona{

    private String especialidad;

    public Profesor(String nombre, String apellido, String nif, String direccion, String especialidad) {
        super(nombre, apellido, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{ nombre= " + this.getNombre() + " especialidad=" + especialidad + '}';
    }
    
    @Override // Método sobreEscrito de Persona.(eso xq hago la clase abstract y no implemento el método abstracto de la interfaz)
    public  final void identificate(){ // Si a este método le pongo final ya si que no lo podreé sobreescribir en las diferentes clases que se encuentren debajo de está.
        System.out.println("Soy un Profesor");
    }

}
