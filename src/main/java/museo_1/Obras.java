/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

import java.util.List;

/**
 *
 * @author tomas
 */
public abstract class Obras { // si pongo un enum no tiene sentido que la clase sea abstracta, ya que cuando es abstracta es para poder crear clases hijas a partir de ésta. 
    
    private String id;
    private String autor;
    private TipoObras tipoObras; // Crear dos obrasHijas: Pinturicas escultoricas. 

    // Constructor predeterminado. 
    public Obras(String id, String autor, TipoObras tipoObras) {
        this.id = id;
        this.autor = autor;
        this.tipoObras = tipoObras;
    }

    // Getters y Setters. 
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

    public TipoObras getTipoObras() {
        return tipoObras;
    }

    public void setTipoObras(TipoObras tipoObras) {
        this.tipoObras = tipoObras;
    }

    // ToString. 
    @Override
    public String toString() {
        return "Obras{" + "id=" + id + ", autor=" + autor + ", tipoObras=" + tipoObras + '}';
    }
    
    
    
    
    

    
    
    
}
