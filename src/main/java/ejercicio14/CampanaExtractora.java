/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author tomas
 */
// Como la clase Electrodomestico implementa la interfaz y está es su hija, debería de implementarlas tb.
// Pero como no me pide implementarla, la pongo abstracta para que no me de el error.
public  abstract class CampanaExtractora extends Electrodomestico {

    private double decibelios; // dB

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (this.decibelios >= 51) {
            this.decibelios = 50;
        } else {
            this.decibelios = decibelios;
        }

    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }


}
