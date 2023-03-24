/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasp61;

/**
 *
 * @author tomas
 */
public class Rectangulo extends Poligono implements Dibujable, Movible {

    private Point punto1;
    private Point punto2;
    private Point punto3;
    private Point punto4;

    public Rectangulo(Point punto1, Point punto2, Point punto3, Point punto4, int base, int altura, int numLados, String id, String color) {
        super(base, altura, numLados, id, color);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }

    public Point getPunto4() {
        return punto4;
    }

    public void setPunto4(Point punto4) {
        this.punto4 = punto4;
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangulo{" + "punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + ", punto4=" + punto4 + '}';
    }

    @Override
    public double area() {
        double area = (this.getBase() * this.getAltura());
        return area;
    }

    @Override
    public void dibujar() {

    }

    @Override
    public void moverIzq(int x) {
        Point p1 = new Point();
        p1.setX(x);
        this.punto1 = p1;
        this.punto2 = p1;
        this.punto3 = p1;
        this.punto4 = p1;
    }

    @Override
    public void moverDer(int x) {
        Point p1 = new Point();
        p1.setX(x);
        this.punto1 = p1;
        this.punto2 = p1;
        this.punto3 = p1;
        this.punto4 = p1;
    }

    @Override
    public void moverArr(int y) {
        Point p1 = new Point();
        p1.setY(y);
        this.punto1 = p1;
        this.punto2 = p1;
        this.punto3 = p1;
        this.punto4 = p1;
    }

    @Override
    public void moverAba(int y) {
        Point p1 = new Point();
        p1.setY(y);
        this.punto1 = p1;
        this.punto2 = p1;
        this.punto3 = p1;
        this.punto4 = p1;

//        Point p1 = new Point(0, y);
//        this.punto1 = p1;
//        this.punto2 = p1;
//        this.punto3 = p1;
//        this.punto4 = p1;
    }
}
