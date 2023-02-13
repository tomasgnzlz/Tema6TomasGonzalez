/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.List;

/**
 *
 * @author tomas
 */
public class Casa {
    private int dimensiones;
    private Puerta puerta;
    private List<Ventana> ventana;
    private List<Calefactor> calefactor;

    public Casa() {
    }

    public Casa(int dimensiones, Puerta puerta, List<Ventana> ventana, List<Calefactor> calefactor) {
        this.dimensiones = dimensiones;
        this.puerta = puerta;
        this.ventana = ventana;
        this.calefactor = calefactor;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public List<Ventana> getVentana() {
        return ventana;
    }

    public void setVentana(List<Ventana> ventana) {
        this.ventana = ventana;
    }

    public List<Calefactor> getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(List<Calefactor> calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public String toString() {
        return "Casa{" + "dimensiones=" + dimensiones + ", puerta=" + puerta + ", ventana=" + ventana + ", calefactor=" + calefactor + '}';
    }
    
    

   
    
    
    
    
}
