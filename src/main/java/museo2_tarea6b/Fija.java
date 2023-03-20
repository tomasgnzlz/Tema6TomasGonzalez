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
public final class Fija extends Salas {

    private String estado;

    // Constructor. 

    public Fija(String estado, int idSala, Temperatura sensorTemp, Humedad sensorHum, List<Obras> listaObras) {
        super(idSala, sensorTemp, sensorHum, listaObras);
        this.estado = estado;
    }
    

    // Getters y Setters. 
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // ToString. 
    @Override
    public String toString() {
        return super.toString() + " || Fija{" + "estado=" + estado + '}';
    }

}
