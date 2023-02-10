/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

/**
 *
 * @author tomas
 */
public class VehiculoElectrico extends Vehiculo {

    private int numBaterias;
    private int duracionCarga;  //minutos

    public VehiculoElectrico(int bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int numBaterias, int duracionCarga) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        //le mḉeto a mano lo que no se pone automáticmanete. 
        this.numBaterias = numBaterias;
        this.duracionCarga = duracionCarga;
    }

    public VehiculoElectrico() {
        //NO ME DEJABA XQ NO TENÍA EL CONSTRUCTOR VACÍO EN LA CLASE PADRE DE TODAS LA HIJAS. 
    }

    @Override
    public String toString() {
        return "VehiculoElectrico{" + "numBaterias=" + numBaterias + ", duracionCarga=" + duracionCarga + '}';
    }

    public void cargarBateria() {
        System.out.println("El vehiculo  " + this.getMatricula() + " está cargando.");
    }

    public void cambiarBateria() {
        System.out.println("El vehiculo  " + this.getMatricula() + " ha sustituido sus baterias.");
    }

    public int getNumBaterias() {
        return numBaterias;
    }

    
    public void arrancar() {
        System.out.println("Soy un " + this.getMarca() + " y estoy arrancando");
    }

}
