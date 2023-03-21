/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

/**
 *
 * @author tomas
 */
public abstract class Sensor {
    
    private int id;

    // Constructor
    public Sensor(int id) {
        this.id = id;
    }

    // Getters y Setters. 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ToString.
    @Override
    public String toString() {
        return "Sensor{" + "id=" + id + '}';
    }
    
    // Método abstracto. 
    public abstract void alarma();
    
    
    
    
    
    
}
