/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventanaabstracta;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class Test {

    public static void main(String[] args) {
        Ventana v1 = new VAbatible(90, true);
        Ventana v2 = new VCorredera(50, true);
        
        Set<Ventana> conjuntoVentana = new HashSet<>();
        conjuntoVentana.add(v1);
        conjuntoVentana.add(v2);
        
        
        
        
    }
    
}
