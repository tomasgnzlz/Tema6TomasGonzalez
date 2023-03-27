/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tomas
 */
public class EjerciciosExregVico {
    /*  A. Detectar N,S,E,O.
            · meter un texto y detectar si la posición de la que se habla es N(norte), S(sur), E(este), O(oeste)
        B.  Debe cumplir "ini" - dosnºaleaatorios - "fin" las palabras del inicio y del final están contenidas dentro de
        C. Debe cumplir que la cadena de caracteres que se meta por cnosla sea letra,numero,letra,nmero...
        
    */
    public static void main(String[] args) {
        System.out.println("Ejemplo A");
        // A. 
        final String regex = "^[a-zA-Z]{12}[:][ ][N-S-E-O]";
        final String string = "Localizacion: N";
        
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
        System.out.println("Ejemplo B");
        // B.
        final String regexB = "^[a-zA-Z]{3}[0-9 ]{2}[a-zA-Z]{3}$";
        final String stringB = "ini22fin";
        
        final Pattern patternB = Pattern.compile(regexB);
        final Matcher matcherB = pattern.matcher(stringB);
        
        while (matcherB.find()) {
            System.out.println("Full match: " + matcherB.group(0));
            
            for (int i = 1; i <= matcherB.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcherB.group(i));
            }
        }
        
        // C. 
        System.out.println("Ejemplo C");
    }
    
}
