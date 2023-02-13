/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaabstracta;

/**
 *
 * @author tomas
 */
public class VAbatible extends Ventana {

    private int gradosApertura;

    public VAbatible(int gradosApertura, boolean estado) {
        super(estado);
        this.gradosApertura = gradosApertura;
    }

    public VAbatible() {
    }

    public int getGradosApertura() {
        return gradosApertura;
    }

    public void setGradosApertura(int gradosApertura) {
        this.gradosApertura = gradosApertura;
    }

    @Override
    public String toString() {
        return "VAbatible{" + "gradosApertura=" + gradosApertura + '}';
    }
    // Si le méto un valor, deja de ser sobreescritura.
    public void abrir(){
        
    }

    // Métodos abstractos.
    @Override
    public void abrir(int numero) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        // Le doy el código a la ventana abatible.
        // Hay que indicar que está abierta, y además los grados de apertura que se calculan dividiendo el numero entre 2.
        this.setEstado(true);
        this.gradosApertura = (numero/2);
        
                }

    @Override
    public void cerrar(int numero) {
        
        
    }
}
