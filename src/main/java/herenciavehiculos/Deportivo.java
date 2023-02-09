/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

/**
 *
 * @author tomas
 */
// Deportivo heredaa de Vehiculo( Deportivo extiende a la clase Vehiculo)
public class Deportivo extends Vehiculo {

    // Este atributo es propio de Deportivo
    // no es visible desde la clase padre(superclase)
    private int cilindrada;

    // Constructores no se heredan. 
    // La primera línea de código de un constructor en la subclase(clase hija)
    // debe llamar al constructor de la superclase (padre)
    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Deportivo{" + "cilindrada=" + cilindrada + '}';
    }

}
