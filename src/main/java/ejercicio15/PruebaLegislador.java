/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class PruebaLegislador {

    public static void main(String[] args) {
        List<Legislador> listaLegisladores = new ArrayList<>();
        // Creo y añado aquellos diputados y legisladores.
        listaLegisladores.add(new Diputado(2, "p1", "psoe", "D1", "uno"));
        listaLegisladores.add(new Diputado(4, "p2", "psoe", "D2", "dos"));
        listaLegisladores.add(new Diputado(6, "p3", "psoe", "D3", "tres"));
        listaLegisladores.add(new Diputado(8, "p4", "psoe", "D4", "cuatro"));
        listaLegisladores.add(new Senador(1234, "p5", "psoe", "S1", "suno"));
        listaLegisladores.add(new Senador(4, "p6", "psoe", "S2", "sdos"));
        listaLegisladores.add(new Senador(345, "p7", "psoe", "S3", "stres"));
        listaLegisladores.add(new Senador(354245, "p8", "psoe", "S4", "scuatro"));

        
        for (Legislador l1 : listaLegisladores) {
            System.out.println(l1.toString());
            System.out.println("Su puesto es...");
            l1.getCamaraEnQueTrabaja();
        }

    }

}
