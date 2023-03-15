/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main14 {

    public static void main(String[] args) {

        List<Electrodomestico> lista = new ArrayList<>();

        lista.add(new Frigorifico(100, 50, "Uno"));
        lista.add(new Microondas(70, 40, "Otro"));
        // lista.add(new CampanaExtractora)
        // No puedo añadir  a la lista la CampanaExtractora, PORQUE NO ES DE ESE TIPO

    }

}
