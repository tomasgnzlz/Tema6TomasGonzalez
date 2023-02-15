/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author Usuario
 */
public class Jardinere extends Empleado {

    private int antiguedad;

    public Jardinere(int antiguedad, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public Jardinere() {
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + " || " + "Jardinere{" + "antiguedad=" + antiguedad + '}';
    }

}
