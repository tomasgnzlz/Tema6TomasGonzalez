/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterador;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class EjemploIterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        for (Integer numerico : conjunto) {
            System.out.println("Elemento " + numerico);
//no puedo borrar un elemento d euna coleccion que se está recorriendo ahora mismo. 
//            if (numerico ==20) {
//                conjunto.remove(20);
//            }
        }

        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()) {
            Integer numerico = it.next();
            if (numerico == 20) {
                it.remove(); // borra el 20 del conjunto.
                //conjunto.remove(numerico);  -> Excepción.
            }
        }
        
        conjunto.forEach(System.out::println);
    }

}
