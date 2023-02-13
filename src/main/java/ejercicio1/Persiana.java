/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Persiana extends Ventana {
    // ME FALTA EL ATRIBUTO ESTADO. 
    private String color;

    // LE TENGO QUE METER LOS ATRIBUTOS DE ESTÁ CLASE A MANO, 
    // PORQUE EL CONSTRUCTOR SOLO ME PONE LOS ATRIBUTOS DE LA CLASE PERSIANA, 
    // NO ME MUESTRA LOS DE SU CLASE PADRE.
    public Persiana(int numVentanas, String color) {
        super(numVentanas);
        this.color = color;
    }

    public Persiana() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        //Le meto el super para que tbn me enseñe el toString de su padre
        return super.toString() + "| | |" + "Persiana{" + "color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.color);
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
        final Persiana other = (Persiana) obj;
        return Objects.equals(this.color, other.color);
    }

}
