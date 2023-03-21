/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public abstract class Conservador extends Empleado{
    
    private String id;

    public Conservador(String id, String nif, String nombre) {
        super(nif, nombre);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " || Conservador{" + "id=" + id + '}';
    }

    
    
}
