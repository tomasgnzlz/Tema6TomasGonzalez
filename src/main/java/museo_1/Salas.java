/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

import java.util.List;

/**
 *
 * @author tomas
 */
public abstract class Salas {

    private int idSala;
    private List<Sensor> listaSensores;
    private List<Obras> listaObras;

    // Contructor parametrizado. 
    public Salas(int idSala, List<Sensor> listaSensores, List<Obras> listaObras) {
        this.idSala = idSala;
        this.listaSensores = listaSensores;
        this.listaObras = listaObras;
    }

    // Geters & Setters. 
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public List<Sensor> getListaSensores() {
        return listaSensores;
    }

    public void setListaSensores(List<Sensor> listaSensores) {
        this.listaSensores = listaSensores;
    }

    public List<Obras> getListaObras() {
        return listaObras;
    }

    public void setListaObras(List<Obras> listaObras) {
        this.listaObras = listaObras;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Salas{" + "idSala=" + idSala + ", listaSensores=" + listaSensores + ", listaObras=" + listaObras + '}';
    }

}
