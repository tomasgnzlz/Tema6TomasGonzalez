/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfigurasp61;

/**
 *
 * @author tomas
 */
public class Circulo extends Figura implements Movible, Comparable<Circulo> {

    private int longitudRadio;
    private Point punto;

    public Circulo(int longitudRadio, Point punto, String id, String color) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.punto = punto;
    }

    // Getters y Setters.
    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo{" + "longitudRadio=" + longitudRadio + ", punto=" + punto + '}';
    }

    @Override
    public double area() {
        double pi = 3.14;
        double area = (pi * (longitudRadio * longitudRadio)); // A=pi*r²
        return area;
    }

    @Override
    public void moverIzq(int x) {
        int circuloX = punto.getX(); // Aquí guardo la posicion anterior del circulo
        punto.setX(circuloX + x); // Y aquí le sumo a la posición anterior la nueva a la que se quiere mover la figura.
        
    }

    @Override
    public void moverDer(int x) {
        Point p1 = new Point(x, 0);
        this.punto = (p1);
    }

    @Override
    public void moverArr(int y) {
        Point p1 = new Point(0, y);
        this.punto = (p1);
    }

    @Override
    public void moverAba(int y) {
        Point p1 = new Point(0, y);
        this.punto = (p1);
    }

    @Override
    public int compareTo(Circulo o) {
        return Integer.compare(this.longitudRadio, o.longitudRadio);
    }

}
