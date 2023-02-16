/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author tomas
 */
public abstract class Empleado extends Persona {

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
    public abstract void cambiarSalarioEmpleado(int salarioNuevo);
    // Ahora los hijos han de darle clase el código al método. 

    // CAMBIAR EL MÉTODO PARA PODER AUNMENTAR EL SALARIO EN UN %. X EJEMPLO EN UN 40% EN JARDINERE Y UN 60% EN PROGRAMADOR. 
}
