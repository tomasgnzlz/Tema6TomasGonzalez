/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasalmacenamiento;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int n = 3;
        int[][] matriz = new int[n][n];
        rellenarMatrizSinRepetirValores(n, matriz);
        mostrarMatriz(matriz);

        // NO SE COMO HACER PARA QUE NO SE REPITAN LOS VALORES. 
    }

    public static void mostrarMatriz(int[][] matrizAux) {

        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
        }
    }

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
    public static void rellenarMatrizSinRepetirValores(int n, int[][] matrizAux) {
        Random random = new Random();
        int nValores = (n * n);
        //Creo un Array y lo relleno con valores desde (1-n*n).
        int[] ArrayValores = new int[nValores];
        for (int i = 0; i < ArrayValores.length; i++) {
            ArrayValores[i] = i + 1;
        }
        // COMO QUITO EL ORDEN A LOS ELEMENTOS DE ARRAY.
        
        

        // Una vez tengo rellenado el array, procedo a rellenar la matriz con dichos valores. 
        int Aux = 0;
        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                if (Aux < ArrayValores.length) {
                    matrizAux[i][j] = ArrayValores[Aux];
                    Aux++;
                } else {
                    return;
                }
            }
        }
    }
}
