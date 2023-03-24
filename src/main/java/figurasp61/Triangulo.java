/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasp61;

/**
 *
 * @author tomas
 */
public final class Triangulo extends Poligono implements Comparable<Triangulo> {

    private Point punto1;
    private Point punto2;
    private Point punto3;

    public Triangulo(Point punto1, Point punto2, Point punto3, int base, int altura, int numLados, String id, String color) {
        super(base, altura, numLados, id, color);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        return super.toString() + " Triangulo{" + "punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + '}';
    }

    @Override
    public double area() {
        double dos = 2;
        double area = ((this.getBase() * this.getAltura()) / dos);
        return area;
    }

    // Implemento el comparable por su base. 
    @Override
    public int compareTo(Triangulo o) {
        return Integer.compare(this.getBase(), o.getBase());
    }

}
