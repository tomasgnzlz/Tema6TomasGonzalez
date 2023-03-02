/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolunes20c;

/**
 *
 * @author tomas
 */
public class Pistola extends Armas {
    private double calibre;

    public Pistola(double calibre) {
        this.calibre = calibre;
    }

    public Pistola(double calibre, String nombre, String tipoArma, String color) {
        super(nombre, tipoArma, color);
        this.calibre = calibre;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }
    
    //Método exclusivo de está clase.
    public void cambiarCalibreArma(double calibreNuevo){
        this.calibre = calibreNuevo;
    }
    
    
    
}
