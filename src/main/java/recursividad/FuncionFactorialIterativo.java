/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author tomas
 */
public class FuncionFactorialIterativo {

    //Hacer ejemplo factorial iooterativo, no recursivo. 
    //5*4*3*2*1= 120
    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(5));
    }
    
    public static int factorialIterativo(int n) {
        if (n == 0) {
            return 1;
        } else {//numero>=2
            return n * factorialIterativo(n - 1);
        }
    }
    
    public static int factorialRecursivo(int n) {
        int numero = Math.abs(n);
        if (numero == 0 || numero == 1) {
            return 1;
        } else {//numero>=2
            return numero * factorialRecursivo(numero - 1);
        }
    }
    
}
