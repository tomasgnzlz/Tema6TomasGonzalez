/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

/**
 *
 * @author tomas
 */
public class Medico extends Empleado implements Nadadores{

    //Declaración de atributos. 
    private String especialidad;

    // Constructor parametrizado. 
    public Medico(String especialidad, String numeroSeguridadSocial, Double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    // Getters & Setters. 
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public Double calcularIRPF() {
        double total = 0;
        final double cirugia = 25.0;
        final double otraEspecialidad = 23.5;
        if (this.especialidad.equalsIgnoreCase("cirugia")) {
            total = (this.getSalario() + (this.getSalario() * cirugia));
        } else {
            total = (this.getSalario() + (this.getSalario() * otraEspecialidad));
        }
        return total;
    }

    // Método tratarPAcientes. 
    public void tratar(Paciente pacienteAux, String medicina) {
        System.out.println("El medico ¿?  trata a " + pacienteAux + " con la medicina " + medicina);
    }

    @Override
    public void nadar() {
        System.out.println("El medico está nadando");
    }

}
