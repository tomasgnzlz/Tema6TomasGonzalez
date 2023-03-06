/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolunes20c;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public abstract class Armas implements Comparable<Armas> {

    protected String nombre;
    protected String tipoArma;
    protected String color;

    public Armas() {
    }

    public Armas(String nombre, String tipoArma, String color) {
        this.nombre = nombre;
        this.tipoArma = tipoArma;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", tipoArma=" + tipoArma + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.tipoArma);
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
        final Armas other = (Armas) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipoArma, other.tipoArma)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public int compareTo(Armas o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    //Método abstracto.
    public abstract void cambiarnombre( String nombreAux);
}
