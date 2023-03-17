/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

/**
 *
 * @author tomas
 */
public class Paciente extends Persona implements Nadadores {

    // Decalro os atributos. 
    private String numerohistoria;

    //Constructor parametrizado. 
    public Paciente(String numerohistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numerohistoria = numerohistoria;
    }

    // Getters & Setters. 
    public String getNumerohistoria() {
        return numerohistoria;
    }

    public void setNumerohistoria(String numerohistoria) {
        this.numerohistoria = numerohistoria;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numerohistoria=" + numerohistoria + '}';
    }

    //Método tomarMEdicina. 
    public static void tomarMedicina(String medicina) {
        System.out.println("El paciente está tomando la medicina: " + medicina);
        int num = (int) (Math.random() * 10 + 1);
        if (num >= 5) {
            System.out.println("El paciente se está curando.");
        } else {
            System.out.println("El paciente no se está curando.");
        }

    }

    @Override
    public void nadar() {
        System.out.println("El paciente está nadando");
    }

}
