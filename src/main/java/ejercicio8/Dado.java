/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Dado extends Azar {

    public Dado(int posibilidades) { // Aquí le pasas por el constructor el número de posibilidades que quieres que tenga tu dado. 
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);

    }
}
