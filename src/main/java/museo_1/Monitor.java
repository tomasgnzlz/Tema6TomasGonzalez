/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

/**
 *
 * @author tomas
 */
public class Monitor extends Empleado {

    private double sueldoMonitor;

    // Constructor partametrizado. 
    public Monitor(double sueldoMonitor, String nif, String nombre) {
        super(nif, nombre);
        this.sueldoMonitor = sueldoMonitor;
    }

    // Getters y Setters. 
    public double getSueldoMonitor() {
        return sueldoMonitor;
    }

    public void setSueldoMonitor(double sueldoMonitor) {
        this.sueldoMonitor = sueldoMonitor;
    }

    // ToString.
    @Override
    public String toString() {
        return "Monitor{" + "sueldoMonitor=" + sueldoMonitor + '}';
    }
    
    //CalcularSueldo...

}
