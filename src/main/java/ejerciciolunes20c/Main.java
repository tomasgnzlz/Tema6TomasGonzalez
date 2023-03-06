/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolunes20c;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {

        Armas a1 = new Pistola(9, "ns", "Pistola", "Negra");
        Armas a2 = new Pistola(9, "ns3", "Pistola", "Negra");

        Armas r1 = new Rifles(5.56, 110, "NS", "Rifle", "Gris");
        Armas r2 = new Rifles(7.45, 300, "NS", "Rifle", "Gris");

        List<Armas> listaArmas = new ArrayList<>();
        listaArmas.add(a1);
        listaArmas.add(a2);
        listaArmas.add(r1);
        listaArmas.add(r2);

        System.out.println("Lista Ordenada usando la clase 'Compatator'");
        Comparator<Armas> ordenarPorNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());

        Collections.sort(listaArmas, ordenarPorNombre);
        for (Armas a : listaArmas) {
            System.out.println(a
            );
        }
        // Busqueda Binaria. 
        int posicionObjeto;
        
        // Me falta lo del ValueOf y busqueda binaria.

    }

}
