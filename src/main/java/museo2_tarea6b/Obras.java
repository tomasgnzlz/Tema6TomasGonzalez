/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

import java.util.List;

/**
 *
 * @author tomas
 */
public abstract class Obras { // si pongo un enum no tiene sentido que la clase sea abstracta, ya que cuando es abstracta es para poder crear clases hijas a partir de ésta. 

    private String id;
    private String autor;

    public Obras(String id, String autor) {
        this.id = id;
        this.autor = autor;
    }

    public Obras() {
    }
    

    // Getters y Setters. D
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Obras{" + "id=" + id + ", autor=" + autor + '}';
    }

    

}
