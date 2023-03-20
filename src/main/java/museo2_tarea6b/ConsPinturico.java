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

    private List<Pinturicas> obrasPinturicas; // Lista de obras escultoricas para restaurar.

    public ConsPinturico(List<Pinturicas> obrasPinturicas, String id, String nif, String nombre) {
        super(id, nif, nombre);
        this.obrasPinturicas = obrasPinturicas;
    }

    public List<Pinturicas> getObrasPinturicas() {
        return obrasPinturicas;
    }

    public void setObrasPinturicas(List<Pinturicas> obrasPinturicas) {
        this.obrasPinturicas = obrasPinturicas;
    }

    @Override
    public String toString() {
        return super.toString() + " || ConsPinturico{" + "obrasPinturicas=" + obrasPinturicas + '}';
    }

    @Override
    public void restaurarObra() {
        System.out.println("Estoy restaurando una obra");
    }

}
