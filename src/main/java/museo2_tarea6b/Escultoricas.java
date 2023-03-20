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
public class Escultoricas extends Obras {
    
    private MaterialesEsculturas material;

    public Escultoricas(MaterialesEsculturas material, String id, String autor, Obras pinturicas, Obras Escultoricas) {
        super(id, autor, pinturicas, Escultoricas);
        this.material = material;
    }

    public MaterialesEsculturas getMaterial() {
        return material;
    }

    public void setMaterial(MaterialesEsculturas material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Escultoricas{" + "material=" + material + '}';
    }
    
    
    
}
