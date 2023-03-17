/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

/**
 *
 * @author tomas
 */
public final class Humedad extends Sensor {

    private final double indiceHumedad;

    public Humedad(double indiceHumedad, int id) {
        super(id);
        this.indiceHumedad = indiceHumedad;
    }

    public double getIndiceHumedad() {
        return indiceHumedad;
    }

    @Override
    public String toString() {
        return super.toString() + " || Humedad{" + "indiceHumedad=" + indiceHumedad + '}';
    }

    // Método abstracto.
    @Override
    public void alarma() {
        System.out.println("¡¡¡¡¡¡HUMEDAD!!!!!!");
    }

    // Método max-humedad.
    public boolean maximaHumedad(double humedadAmbiente) {
        return humedadAmbiente > 20.0;
    }

    // Método min-humedad.
    public boolean minimaHumedad(double humedadAmbiente) {
        if (humedadAmbiente < 5.0) {
            return true;
        } else {
            return false;
        }
    }

}
