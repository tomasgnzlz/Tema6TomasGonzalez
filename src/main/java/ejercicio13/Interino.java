/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.time.LocalDate;

/**
 *
 * @author tomas
 */
// Clase final implica que no puede tener descendencia.
public final class Interino extends Profesor implements Comparable<Interino> {
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String nombre, String apellido, String nif, String direccion, String especialidad) {
        super(nombre, apellido, nif, direccion, especialidad);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return  super.toString() +"\n"+"Interino{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    @Override // Si no le pongo de donde comparar me va a dar error. 
    public int compareTo(Interino o) {
         return this.fechaInicio.compareTo(o.fechaFin);
    }
    // El identifiacte no se puede sobreescribir.
    
    
}
