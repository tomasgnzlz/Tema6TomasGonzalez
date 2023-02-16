/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        List<Azar> objetoAzar = new ArrayList<>();
        objetoAzar.add(new Moneda()); // Conversión implicita. 
        objetoAzar.add(new Dado(6)); // Le paso el número de caras del dado que quiera. 

        for (Azar a : objetoAzar) {
            System.out.println("Lanzamiento " + a.lanzar());
            // Variable a eres un dado ?
            if (a instanceof Dado) { // instanceof: es un operador que me compara una variable de tipo objeto con otra clase. (Devuelve true o false)
                // Como ya sabe que es un a es de tipo dado, ya me da acceso a los métodos de la clase Dado. 
                ((Dado) a).metodoDado();  // Conversión explicita. 
            }
        }
    }

}
