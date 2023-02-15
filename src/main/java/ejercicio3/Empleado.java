/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author tomas
 */
public class Empleado extends Persona {

    private int salario;

    public Empleado() {
    }

    public Empleado(int salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " || " + "Empleado{" + "salario=" + salario + '}';
    }

    // Método que permita aumentar el salario en una cantidad que será pasada por parámetro. 
    public int cambiarSalarioEmpleado(int salarioNuevo) {
        return this.salario = salarioNuevo;
    }
}
