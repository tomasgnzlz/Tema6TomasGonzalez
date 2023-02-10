/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tomas
 */
public class Puerta {

    // Declaro los atributos que serán necesarios para la clase en cuestion.
    private int numeroPuertas;

    public Puerta(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numeroPuertas;
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
        final Puerta other = (Puerta) obj;
        return this.numeroPuertas == other.numeroPuertas;
    }

    // Métodos necesarios. 
    public void abrirPuerta() {
        System.out.println("La puerta se está abriendo");
    }

    public void cerrarPuerta() {
        System.out.println("La puerta se está cerrando");
    }

}
