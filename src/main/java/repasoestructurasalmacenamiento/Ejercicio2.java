/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasalmacenamiento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio2 {public static void main(String[] args) {

        int n = pedirDimension();
        int[][] matriz = new int[n][n];
        rellenarMatrizRandom(matriz);
        System.out.println("            MATRIZ CREADA");
        mostrarMatriz(matriz);
        // LO QUE SIGUE...

    }

    // Método para pedir las dimensiones.
    public static int pedirDimension() {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las dimensiones de la matriz.");
        n = teclado.nextInt();
        return n;
    }

    //Método para rellenar la matriz de 0 y 1. 
    public static void rellenarMatrizRandom(int[][] matrizAux) {
        Random random = new Random();
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux.length; j++) {
                 matrizAux[i][j] = (int) (Math.random() * 2);
            }
        }
    }
    

    //Método para mostrar la matriz creada.
    public static void mostrarMatriz(int[][] matrizAux) {

        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
        }
    }
    
}
