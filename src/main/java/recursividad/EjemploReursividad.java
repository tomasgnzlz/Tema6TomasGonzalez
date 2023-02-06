/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author tomas
 */
public class EjemploReursividad {

    //IMPRIMIR Nº.
    public static void main(String[] args) {
        imprimirNumRecursivo(5);

    }

//    public static void imprimirNumRecursivo(int num) {
//            imprimirNumRecursivo(num - 1);
//            System.out.println(num);
//            //Peta el programa xq no hay ni un caso. 
//    }gug

    public static void imprimirNumRecursivo(int num) {
        System.out.println(num);//SOLO SE MUESTRA EL CIHCO ACTIVO, EL PASIVO SE EJECUTA PERO NO SE LO MUESTRA POR CONSOLA.
        if (num > 0) { //Caso base para que no pete el programa. Si pongo>= mostrará aquel valor que no cumple el caso y seguira con los valores del proceso pasivo.  
            imprimirNumRecursivo(num - 1);

        }
        //System.out.println(num);//Si imprimimos dsps del bucle solo muestra el recorrido pasivo. 
    }

}
