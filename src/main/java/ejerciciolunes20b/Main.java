/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolunes20b;

import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        String fraseUsuario = JOptionPane.showInputDialog("Introduce una frase");
        System.out.println("Frase --> " + fraseUsuario
                + ". El tamaño de la frase es de: " + fraseUsuario.length());

        int indice = conocerElIndiceCaracter(fraseUsuario, 'a');
        System.out.println("El índice de la primera 'a' es: " + indice);
        // posiciones del carácter 'm' en el String
        int[] posiciones = obtenerPosicionesDeCaracter(fraseUsuario, 'm');
        System.out.print("Las posiciones de la 'm' son: ");
        for (int posicion : posiciones) {
            System.out.print(posicion + " ");
        }
        System.out.println();

        //Bucle para recorrer la palabra y nombrar las caracteristicas de la misma. 
        for (int i = 0; i < fraseUsuario.length(); i++) {
            char c = fraseUsuario.charAt(i);
            System.out.print("El carácter " + c + " tiene valor Unicode " + (int) c);
            if (Character.isUpperCase(c)) {
                System.out.println(" y es una letra mayúscula");
            } else if (Character.isLowerCase(c)) {
                System.out.println(" y es una letra minúscula");
            } else if (Character.isDigit(c)) {
                System.out.println(" y es un dígito");
            } else {
                System.out.println(" y es un carácter especial");
            }
        }

        String fraseUsuario2 = fraseUsuario.replaceAll(" ", "");
        System.out.println("Frase --> " + fraseUsuario2
                + ". El tamaño de la frase es de: " + fraseUsuario2.length());
    }

    public static int conocerElIndiceCaracter(String cadena, char caracter) {
        return cadena.indexOf(caracter);
    }

    public static int[] obtenerPosicionesDeCaracter(String cadena, char caracter) {
        int[] posiciones = new int[cadena.length()];
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                posiciones[contador] = i;
                contador++; // Para saber en que posición me encuentro.
            }
        }

        int[] posicionesFinales = new int[contador];
        for (int i = 0; i < contador; i++) {
            posicionesFinales[i] = posiciones[i];
        }
        return posicionesFinales;
    }
}
