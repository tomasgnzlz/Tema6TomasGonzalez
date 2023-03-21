/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public class Temperatura extends Sensor {

    private double temperaturaAmbiente;

    // Constructor. 
    public Temperatura(double temperaturaAmbiente, int id) {
        super(id);
        this.temperaturaAmbiente = temperaturaAmbiente;
    }

    // Getters y Setters.
    public double getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    public void setTemperaturaAmbiente(double temperaturaAmbiente) {
        this.temperaturaAmbiente = temperaturaAmbiente;
    }

    // ToStrring. 
    @Override
    public String toString() {
        return super.toString() + " || Temperatura{" + "temperaturaAmbiente=" + temperaturaAmbiente + "ºC " + '}';
    }

    // Método abstracto. 
    @Override
    public void alarma() {
        System.out.println("¡¡¡¡¡¡HUMEDAD!!!!!!");
    }

    // Método max-humedad.
    public boolean maximaTemperatura(double temperaturaAmbiente) {
        return temperaturaAmbiente > 20.0;
    }

    // Método min-humedad.
    public boolean minimaHumedad(double temperaturaAmbiente) {
        if (temperaturaAmbiente < 5.0) {
            return true;
        } else {
            return false;
        }
    }

}
