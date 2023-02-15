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
public class Ejercicio2 {

    public static void main(String[] args) {

        int n = 6;
        int[][] matriz = new int[n][n];
        rellenarMatrizRandom(matriz);
        System.out.println("DIMENSIÓN:        " + n);
        System.out.println("            MATRIZ CREADA");
        mostrarMatriz(matriz);
        // LO QUE SIGUE...
        System.out.println("\n La posición del cero");
        comprobarEsquinasCeros(matriz);

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

    // Método que comprueba las esquinas de aquellas coordenadas donde se encuentra un 0. 
    // si todas tienen 1 ese cero ese es el que buscamos.
    public static int[] comprobarEsquinasCeros(int[][] matriz) {
        // Creo un Array que contenga las coordenadas del cero que cumple nuestras condiciones.
        int[] coordenadas = new int[2];
        int[] coordenadasNoEncontradas = new int[2];
        coordenadasNoEncontradas[0] = -1;
        coordenadasNoEncontradas[1] = -1;
        // La i y la j la inicializo en 1, ya que esas filas y columnas nunca van a cumplir la condicion que pide el ejercicio. 
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) { // Le pongo matriz[i] para que recorra eso, y no se salga.
                // Aquí le paso como condición, las posiciones en las que se debe de encontrar un 1.
                if (matriz[i][j] == 0 // Esto coge los ceros de la matriz. 
                        && matriz[i - 1][j - 1] == 1 // Cuando ese cero, tiene un 1 en la esquina superior izquierda
                        && matriz[i - 1][j + 1] == 1 // Cuando ese cero, tiene un 1 en la esquina superior derecha
                        && matriz[i + 1][j - 1] == 1 // Cuando ese cero, tiene un 1 en la esquina inferior izquierda
                        && matriz[i + 1][j + 1] == 1 // Cuando ese cero, tiene un 1 en la esquina inferior derecha
                        ) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }
        return coordenadasNoEncontradas;
    }

}
