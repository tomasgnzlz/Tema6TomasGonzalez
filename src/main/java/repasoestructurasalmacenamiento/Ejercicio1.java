/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasalmacenamiento;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int n = pedirDimension();
        int[][] matriz = new int[n][n];
        rellenarMatriz(n, matriz);
        mostrarMatriz(matriz);

    }

    // Método para pedir las dimensiones.
    public static int pedirDimension() {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las dimensiones de la matriz.");
        n = teclado.nextInt();
        return n;
    }

    // Método para rellenar una matriz con valores de un array.
    public static void rellenarMatriz(int n, int[][] matrizAux) {
        int nValores = (n * n);
        Random random = new Random();
        random.nextInt(nValores);
        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                matrizAux[i][j] = random.nextInt(nValores) + 1;
                // COMO HACER PARA QUE NO SE REPITAN LOS VALORES. 
            }
        }
    }

    public static void mostrarMatriz(int[][] matrizAux) {

        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux.length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
        }
    }
}
