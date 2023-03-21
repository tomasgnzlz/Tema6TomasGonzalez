/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public class Vigilante extends Empleado {

    private String turno; // noche-tarde-mañana¿?

    // Constructor parametrizado. 
    public Vigilante(String turno, String nif, String nombre) {
        super(nif, nombre);
        this.turno = turno;
    }

    // Getters y Setters. 
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // ToString.
    @Override
    public String toString() {
        return "Vigilante{" + "turno=" + turno + '}';
    }
}
