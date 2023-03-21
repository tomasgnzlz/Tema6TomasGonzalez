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
public class ConsEscultorico extends Conservador implements Restaurador {

    // Declaración de atributos.
    private List<Escultoricas> obrasEscultoricas; // Lista de obras escultoricas para restaurar.

    // Constructor parametrizado. 
    public ConsEscultorico(List<Escultoricas> obrasEscultoricas, String id, String nif, String nombre) {
        super(id, nif, nombre);
        this.obrasEscultoricas = obrasEscultoricas;
    }

    // Getters y Setters. 
    public List<Escultoricas> getObrasEscultoricas() {
        return obrasEscultoricas;
    }

    public void setObrasEscultoricas(List<Escultoricas> obrasEscultoricas) {
        this.obrasEscultoricas = obrasEscultoricas;
    }

    // ToString.
    @Override
    public String toString() {
        return super.toString() + "  || ConsEscultorico{" + "obrasEscultoricas=" + obrasEscultoricas + '}';
    }

    // Método de la interfaz implementada. 
    @Override
    public void restaurarObra() {
        System.out.println("Soy el Conservsdor de esculturas "+ this.getNombre() + " y estoy restaurando una Escultura");
    }
}
