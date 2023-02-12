/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author tomas
 */
public class Programador extends Empleado {

    CategoriasProgramador categoria;

    public Programador() {
    }

    public Programador(CategoriasProgramador categoria, int salario, String nombre, String nif, String edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " || " + "Programador{" + "categoria=" + categoria + '}';
    }
}
