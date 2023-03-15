/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Robot {

    private int numeroSerie;
    private int vida;
    

    public Robot(int numeroSerie, int vida) {
        this.numeroSerie = numeroSerie;
        //this.vida = vida;
        this.vida = darVida();
    }

    public double getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Método para dar vida a los robots.
    public  static int darVida(){
        Random random = new Random();
         int vidsaa= random.nextInt(1, 101);
        return vidsaa;
    }
    
    
    // Método para dar un numero de serie a los robots.

}
