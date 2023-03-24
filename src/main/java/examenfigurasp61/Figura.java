/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfigurasp61;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public abstract class Figura {

    private String id;
    private String color;

    public Figura(String id, String color) {
        this.id = id;
        this.color = color;
    }

    public Figura() {
    }

    public Figura(String id) {
        this.id = id;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "id=" + id + ", color=" + color + '}';
    }

    @Override
    public final int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        return Objects.equals(this.id, other.id);
    }

    // Método abstracto.
    public abstract double area(); // Sobreescribo este método en cada clase hija. 

}
