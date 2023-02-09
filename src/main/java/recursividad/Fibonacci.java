/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author tomas
 */
public class Fibonacci {

    /*      f(n)=[f(n-1) + f(n-2)...].
    f(0)=0
    f(1)=1
    f(2)=1
    f(3)=2
    f(4)=3
    f(5)=5 -> Está formado por la suma de los dos digitos anteriores[(3+2)=5]
     */
    public static void main(String[] args) {
        int n = fibonacciIterativo(7);
        System.out.println("Fibonacci Iterativo de 7 " + n);

        System.out.println("\n");

        int n2 = fibonacciIterativo(9);
        System.out.println("Fibonacci Iterativo de 7 " + n2);

    }

    //Método Fibonacci Recursivo.
    public static int fibonacciRecursivo(int n) { //n= positivo o cero. 

        if (n < 2) {
            return n;
        } else {
            return (fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2));
        }
    }

    //Método Fibonacci Iterativo.
    public static int fibonacciIterativo(int n) {
        int numero = Math.abs(n);//Evitar negativos. (Hace que los valores sean positivos o cero.)
        int resultado = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < numero; i++) {

            resultado = n1 + n2;
            n2 = n1;
            n1 = resultado;
        }
        return resultado;
    }

}
