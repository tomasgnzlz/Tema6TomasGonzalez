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
public class ConsPinturico extends Conservador implements Restaurador {

    // Declaración de atributos. 
    private List<Pinturicas> obrasPinturicas; // Lista de obras escultoricas para restaurar.

    // Constructor parametrizado. 
    public ConsPinturico(List<Pinturicas> obrasPinturicas, String id, String nif, String nombre) {
        super(id, nif, nombre);
        this.obrasPinturicas = obrasPinturicas;
    }

    // Getters y Setters.
    public List<Pinturicas> getObrasPinturicas() {
        return obrasPinturicas;
    }

    public void setObrasPinturicas(List<Pinturicas> obrasPinturicas) {
        this.obrasPinturicas = obrasPinturicas;
    }

    // ToString. 
    @Override
    public String toString() {
        return super.toString() + " || ConsPinturico{" + "obrasPinturicas=" + obrasPinturicas + '}';
    }
    // Método de la interfaz implementada. 
    @Override
    public void restaurarObra() {
        System.out.println("Soy el Conservsdor de pinturas " + this.getNombre() + " y estoy restaurando una pintura");
    }

}
