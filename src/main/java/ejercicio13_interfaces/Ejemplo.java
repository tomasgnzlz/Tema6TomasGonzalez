/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Ejemplo {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();
        List<Identificable> objetosIdentificables = new ArrayList<>();
        // Conversiones implicitas.
        lista.add(new Estudiante("Tomás", "Grillo", "ghkkjgk8", "TuCasa", "1"));
        lista.add(new Titular(LocalDate.now(), "Jaimito", "Perez", "lkrnks4", "MiCasa", "Maestro Repostero"));
        lista.add(new Interino(LocalDate.MIN, LocalDate.MIN, "Manolito", "Polinomio", "vjrbvwe4", "SuCasa", "Matemáticas"));

        objetosIdentificables.add(new Estudiante("aa", "bb", "cc", "dd", "3"));

        for (Persona p : lista) {
            p.identificate();// no necestio instanceof xq todos son personas
        }

        System.out.println("--");
        for (Persona p : lista) {
            if (p instanceof Interino) {
                var tmp = ((Interino) p).getFechaInicio();
                System.out.println(tmp);
            }
            if (p instanceof Titular) {
                var tit = ((Titular) p).getFechaJubilacion();
            }

            if (p instanceof Estudiante) {
                ((Estudiante) p).estudiarPco();
            }

            if (p instanceof Identificable) {
                System.out.println("Soy identificable");
            }
        }
    }
}
