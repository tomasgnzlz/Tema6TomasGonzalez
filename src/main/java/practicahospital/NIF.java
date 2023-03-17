/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class NIF {

    // Declaración de atributos. 
    private String numero; // Lo pongo String x una clase a
    private char letra;
    private LocalDate fechaCaducidad; // y está es la fecha en la que me toca renovar el dni. 

    // Constructor.
    public NIF() {
        this.numero = RandomStringUtils.randomNumeric(8).toUpperCase();
        this.letra = calcularLetra();
        this.fechaCaducidad = LocalDate.now();
    }

    // Getters & Setters. 
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

    private static char calcularLetra() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'A');
    }

    final public LocalDate renovar(LocalDate fechaSolicitudRenovacion) { // Esta es la fecha en la que yo quiero que me renueven el dni. 
        return fechaSolicitudRenovacion.plusYears(10);
    }

}
