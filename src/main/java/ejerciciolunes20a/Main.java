/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolunes20a;

import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        String numero;
        do {
            numero = JOptionPane.showInputDialog("Introduce un nº");
        } while (!comprobarSiEsNumero(numero));
        //Convertimos los numeros a un array de char. 
        char[] arrayDeChar = numero.toCharArray();
        if (esCapicua(arrayDeChar, 0, arrayDeChar.length - 1)) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Capicúa");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no es Capicúa");
        }
    }
    private static boolean comprobarSiEsNumero(String numero) {
        try {
            Integer.parseInt(numero);
            //Si no es un nº sale la excepción. 
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Introduce un número entero");
            return false;
        }
    }
    private static boolean esCapicua(char[] numeros, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        } else if (numeros[inicio] != numeros[fin]) {
            return false;
        } else {
            return esCapicua(numeros, inicio + 1, fin - 1);
        }
    }
}
