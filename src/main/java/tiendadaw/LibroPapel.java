/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadaw;

/**
 *
 * @author tomas
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

   

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " || LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El " + this.getDescripcion() + " se enviará a esta dirección: " + direccion);
    }

    @Override
    public void comentarioPostLectura() {
        System.out.println("No me gusta leer libros a papel");
    }

}
