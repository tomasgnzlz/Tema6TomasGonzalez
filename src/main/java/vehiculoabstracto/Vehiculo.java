/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoabstracto;

/**
 *
 * @author tomas
 */
// Hacer el ejercicio de los vehiculos, pero usando clases abstractas.
public abstract class Vehiculo { // Clase VehiculoAbstracto

    private boolean estado;
    private int cilindrada;

    public Vehiculo() {
    }

    public Vehiculo(boolean estado, int cilindrada) {
        this.estado = estado;
        this.cilindrada = cilindrada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "estado=" + estado + '}';
    }

    //Métodos abstractos de los vehiculos. 
    public abstract void encenderVehiculo(); // Con el set estado de la clase vehiculo, al sobreescribir el método se le asigna el estado que le corresponda.<

    public abstract void ApagarVehiculo(); // Lo mismo pasa con este método. 

    // SI LE PASO LA CILINDRADA, SE SABRÁ EL VEHICULO EXACTO QUE SE DESEA APAGAR.
}
