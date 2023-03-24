/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasp61;

/**
 *
 * @author tomas
 */
public abstract class Poligono extends Figura {

    private int base;
    private int altura;
    private int numLados;

    public Poligono(int base, int altura, int numLados, String id, String color) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numLados = numLados;
    }

    public Poligono(int base, int altura, int numLados) {
        this.base = base;
        this.altura = altura;
        this.numLados = numLados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public String toString() {
        return super.toString() + "  Poligono{" + "base=" + base + ", altura=" + altura + ", numLados=" + numLados + '}';
    }
    

}
