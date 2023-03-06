/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author tomas
 */
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        double area;
        double altura = this.altura;
        double base = this.base;
        area = (base * altura);
        return area;
    }

}
