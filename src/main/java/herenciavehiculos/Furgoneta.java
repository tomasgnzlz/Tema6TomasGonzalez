/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

/**
 *
 * @author tomas
 */
public class Furgoneta extends Vehiculo{
    private int carga;
    private int volumen;

    public Furgoneta(int bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int carga, int volumen) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //GetAtributos¿?¿? ¿LOS GETTERS DE LAa CLASE PADRE???
    
    
}
