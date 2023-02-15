/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasalmacenamiento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int n = 3; // Le paso las dimensiones de la matriz. 
        int[][] matriz = new int[n][n]; // La matriz siempre será cuadrada.
        rellenarMatrizAleatoriamente(n, matriz);
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] matrizAux) {
        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
        }
    }

    // Método para rellenar
    public static void rellenarMatrizAleatoriamente(int n, int[][] matrizAux) {
        Random random = new Random();
        int numValores = (n * n);

        // Creo una lista y la relleno con valores de 1 a n*n.
        List<Integer> listaNum = new ArrayList<Integer>();
        for (int i = 1; i <= numValores; i++) {
            listaNum.add(i);
        }
        System.out.println("Creo lista valores de 1 a n*n \n" + listaNum + "\n");
        // Utilizo el método shuffle de la clase collecions para desordenar los valores que se encuentran en la lista.
        Collections.shuffle(listaNum);
        System.out.println("Lista desordenada: \n" + listaNum + "\n");

        //Ahora relleno la matriz con los valores de la lista. 
        System.out.println("        MATRIZ CON NUMEROS ALEATORIOS");
        int contador = 0;
        /*
        La variable contador la meto para poder saber en que posicion de la lista me encuentro,
        si no pongo el contador no podría posiiconarme en la lista, y por ende, no podría rellenar la matriz. 
         */
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux.length; j++) {
                matrizAux[i][j] = listaNum.get(contador);
                contador++;
                /*
                Si no voy incrementando el valor del contador, estaría rellenando la matriz, 
                con el primer valor de la lista. En cambio, si lo voy incrementando, 
                en cada iteración se coloca en la siguiente posicion en la lista, 
                y mete el valor de esa posición en la matriz. 
                 */
            }
        }
    }

    /*
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     */
    // METOFOS QUE NO VALEN
////    public static void RellenarMatriz(int n, int[][] matrizAux) {
////        Random random = new Random();
////        int nValores = (n * n);
////        for (int i = 0; i < matrizAux.length; i++) {
////            System.out.println(" ");
////            for (int j = 0; j < matrizAux.length; j++) {
////                matrizAux[i][j] = random.nextInt(1, nValores) + 1;
////                if (true) {
////
////                }
////            }
////        }
////    }
//    public static void rellenarMatrizSinRepetirValores(int n, int[][] matrizAux) {
//        Random random = new Random();
//        int nValores = (n * n);
//        //Creo un Array y lo relleno con valores desde (1-n*n).
//        int[] ArrayValores = new int[nValores];
//        for (int i = 0; i < ArrayValores.length; i++) {
//            ArrayValores[i] = i + 1;
//        }
//        // COMO QUITO EL ORDEN A LOS ELEMENTOS DE ARRAY.
//        
//        
//
//        // Una vez tengo rellenado el array, procedo a rellenar la matriz con dichos valores. 
//        int Aux = 0;
//        for (int i = 0; i < matrizAux.length; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < matrizAux.length; j++) {
//                if (Aux < ArrayValores.length) {
//                    matrizAux[i][j] = ArrayValores[Aux];
//                    Aux++;
//                } else {
//                    return;
//                }
//            }
//        }
//    }
}
