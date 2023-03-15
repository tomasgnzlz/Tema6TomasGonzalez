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
public class Robot  implements Comparable<Robot>{

    private int numeroSerie;
    private int vida;
    

    public Robot(/*int numeroSerie, int vida*/) {
        //this.numeroSerie = numeroSerie;
        this.numeroSerie = darNumSerie();
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

    @Override
    public String toString() {
        return "Robot{" + "numeroSerie=" + numeroSerie + ", vida=" + vida+"%" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.vida;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        return this.vida == other.vida;
    }

    
    // Método para dar vida a los robots.
    public  static int darVida(){
        Random random = new Random();
         int vidsaa= random.nextInt(1, 101);
        return vidsaa;
    }
    
    
    // Método para dar un numero de serie a los robots.
    public  static int darNumSerie(){
        Random random = new Random();
         int numSerie= random.nextInt();
        return numSerie;
    }

    // Comparable por su vida. 
    @Override
    public int compareTo(Robot o) {
        return Integer.compare(this.vida, o.vida);
    }
}
