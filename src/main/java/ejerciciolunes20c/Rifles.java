/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolunes20c;

/**
 *
 * @author tomas
 */
public class Rifles extends Armas {

    private Double calibre;
    private double alcance;

    public Rifles(Double calibre, double alcance) {
        this.calibre = calibre;
        this.alcance = alcance;
    }

    public Rifles(Double calibre, double alcance, String nombre, String tipoArma, String color) {
        super(nombre, tipoArma, color);
        this.calibre = calibre;
        this.alcance = alcance;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public Double getCalibre() {
        return calibre;
    }

    public void setCalibre(Double calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
        return "Rifles{" + "calibre=" + calibre + ", alcance=" + alcance + '}';
    }

    //Método exclusivo de está clase.
    public void cambiarAlcanceRifle(double alcanceAux) {
        this.calibre = alcanceAux;
    }

    //Método abstracto heredado de la clase padre.
    @Override
    public void cambiarnombre(String nombreAux) {
        this.nombre = nombreAux;
    }
}
