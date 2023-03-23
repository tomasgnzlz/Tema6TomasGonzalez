/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadaw;

/**
 *
 * @author tomas
 */
public abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa(String marca, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " || Ropa{" + "marca=" + marca + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El " + this.getDescripcion() + " se enviará a esta dirección: " + direccion);
    }

}
