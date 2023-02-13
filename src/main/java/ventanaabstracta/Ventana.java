package ventanaabstracta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tomas
 */
public abstract class Ventana {

    private boolean estado;

    public Ventana() {
    }

    public Ventana(boolean estado) {
        this.estado = estado;
    }

    //Métodos para abrir y cerrar ventana.
    public abstract void abrir(int numero); // Este valor permitirá saber el ángulo de apertura que se desea en la ventana abatible.

    public abstract void cerrar(int numero); // Lo mismo pasará al cerrarla. 

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }

}
