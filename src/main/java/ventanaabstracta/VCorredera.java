/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaabstracta;

/**
 *
 * @author tomas
 */
public class VCorredera extends Ventana {

    private int longitudApertura; // cm.

    public VCorredera(int longitudApertura, boolean estado) {
        super(estado);
        this.longitudApertura = longitudApertura;
    }

    public VCorredera() {
    }

    public VCorredera( int longApertura) {
        super(true);
        
    }

    public int getLongitudApertura() {
        return longitudApertura;
    }

    public void setLongitudApertura(int longitudApertura) {
        this.longitudApertura = longitudApertura;
    }

    @Override
    public String toString() {
        return "VCorredera{" + "longitudApertura=" + longitudApertura + '}';
    }

    @Override
    public void abrir(int numero) {
        this.setEstado(true);
        // Combprobar bla bla bla...
        this.longitudApertura = (numero);
    }

    @Override
    public void cerrar(int numero) {

    }
}
