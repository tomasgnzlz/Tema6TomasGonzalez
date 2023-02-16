/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author tomas
 */
public abstract class Azar {

    private int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    // Método abstracto para la clase Dado. 
    public abstract int lanzar();

}
