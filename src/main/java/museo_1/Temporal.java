/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author tomas
 */
public final class Temporal extends Salas {

    private LocalDate fechaIni;
    private LocalDate fechaFin;

    // Conmstructor parametrizado. 

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, int idSala, Temperatura sensorTemp, Humedad sensorHum, List<Obras> listaObras) {
        super(idSala, sensorTemp, sensorHum, listaObras);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
 

    // Getters y Setters.
    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // ToString. 
    @Override
    public String toString() {
        return super.toString() + " || Temporal{" + "fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + '}';
    }

}
