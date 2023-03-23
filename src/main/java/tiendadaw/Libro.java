/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadaw;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro(String isbn, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + '}';
    }

    // El equal y e hashcode los pongo final para que no se puedan sobreescribir. 
    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    // Implemento el comparable por el isbn de cada libro. 
    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareToIgnoreCase(o.isbn);
    }
    
    // 14
    public abstract void comentarioPostLectura();
    /*Se podria seleccionar un numero aleatorio si es 1 el libro está bien
    si es dos el libro está mal*/
    

}
