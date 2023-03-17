/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Administrativo extends Empleado {
    // Decalración de variables. 
    private Grupo grupo;

    //Constructor parametrizado. 
    public Administrativo(Grupo grupo, String numeroSeguridadSocial, Double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    // Getters & Setters. 
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    // ToString.
    @Override
    public String toString() {
        return super.toString() + " || Administrativo{" + "grupo=" + grupo + '}';
    }

    // Equals & HashCode. 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.grupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrativo other = (Administrativo) obj;
        return this.grupo == other.grupo;
    }

    //Método abstracto IRPF. 
    @Override
    public Double calcularIRPF() {
        double total = 0;
        if (this.grupo == Grupo.C) {
            total = (this.getSalario() * Grupo.C.getIrpf());
        } else if (this.grupo == Grupo.D) {
            total = (this.getSalario() * Grupo.D.getIrpf());
        } else {
            total = (this.getSalario() * Grupo.E.getIrpf());
        }
        return total;
    }

    // Método registrarDocumento. 
    public void registrarDocumento(String nombreDoc) {
        System.out.println("El adminstrativo " + this.getNombre() + this.getApellidos()
                + "  registró el documento " + nombreDoc + " conHashCode " + nombreDoc.hashCode());
    }
}