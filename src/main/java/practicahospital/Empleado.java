/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

/**
 *
 * @author tomas
 */
public abstract class Empleado extends Persona {

    // Declaración de variables. 
    private String numeroSeguridadSocial;
    private Double salario;

    // Constructor. 
    public Empleado(String numeroSeguridadSocial, Double salario, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        return super.toString() + "|| Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    
    // Método abstracto. 
    public abstract Double calcularIRPF();

}
