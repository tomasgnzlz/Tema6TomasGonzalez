/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

/**
 *
 * @author tomas
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int puertas, boolean marchaAutomatica) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.marchaAutomatica = marchaAutomatica;
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    //GetAtributos¿?¿? ¿LOS GETTERS DE LAa CLASE PADRE???
}
