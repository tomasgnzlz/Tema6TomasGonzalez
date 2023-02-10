/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class VehiculoCombustion extends Vehiculo {
    
    private int capacidad; 
    private TipoCombustible tipo;

    public VehiculoCombustion(int bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int capacidad, TipoCombustible tipo) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public VehiculoCombustion(){
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoCombustion{" + "capacidad=" + capacidad + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.capacidad;
        hash = 67 * hash + Objects.hashCode(this.tipo);
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
        final VehiculoCombustion other = (VehiculoCombustion) obj;
        if (this.capacidad != other.capacidad) {
            return false;
        }
        return this.tipo == other.tipo;
    }
    
    public void repostar(){
        System.out.println("El Vehiculo " + this.getMatricula() + " está repostando");
    }
    
    
    
}
