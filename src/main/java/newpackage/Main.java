/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        Map<Silla,Double> mapSillas = new TreeMap<>();
        // Las sillas tienen que ir ordenas segun el criterio que pongamos 
        //dentro del CompareTo de la clase Silla.
        Silla s1 = new Silla(10, "Silla1");
        Silla s2 = new Silla(20, "Silla2");
        Silla s3 = new Silla(40, "Silla3");
        Silla s4 = new Silla(60, "Silla4");
        Silla s5 = new Silla(59.5, "Silla5");
        Silla s6 = new Silla(100, "Silla6");
        
        //mapSillas.put(s6, Double.NaN);
        
        
        
        
    }
}
