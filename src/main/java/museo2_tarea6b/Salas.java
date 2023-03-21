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
public abstract class Salas {

    private int idSala;
    // private List<Sensor> listaSensores; // Se puede hacer pero como solo es 1 x sala mejor poner 1 de cada. 
    private Sensor sensorTemp;
    private Sensor sensorHum;
    private Obras listaObras;

    // Contructor parametrizado. 
    public Salas(int idSala, Temperatura sensorTemp, Humedad sensorHum, Obras listaObras) {// Aqui le tengo que decir que tipo de sensorle paso, paraq no se puedan colar dos sensores de temperatura y no uno de cada. 
        this.idSala = idSala;
        this.sensorTemp = sensorTemp;
        this.sensorHum = sensorHum;
        this.listaObras = listaObras;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Salas{" + "idSala=" + idSala + ", sensorTemp=" + sensorTemp + ", sensorHum=" + sensorHum + ", listaObras=" + listaObras + '}';
    }

    // Geters & Setters. 
    public Sensor getSensorTemp() {
        return sensorTemp;
    }

    public void setSensorTemp(Sensor sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    public Sensor getSensorHum() {
        return sensorHum;
    }

    public void setSensorHum(Sensor sensorHum) {
        this.sensorHum = sensorHum;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public Obras getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obras listaObras) {
        this.listaObras = listaObras;
    }

}
