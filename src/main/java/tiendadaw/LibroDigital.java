/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadaw;

/**
 *
 * @author tomas
 */
public final class LibroDigital extends Libro implements SeDescarga {

    private double numKBytes;

    public LibroDigital(double numKBytes, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return super.toString() + " || LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {
        System.out.println("Enlace de descarga http:/tomas.daw/" + this.hashCode());
    }

    @Override
    public void comentarioPostLectura() {
        System.out.println("Me gusta leer libros a papel");
    }

}
