/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class MuseoMain {

    /*
    Crea una clase con un método main. 
    Crea un museo, añade una sala fija con un cuadro(unapintura) y otra sala fija con una escultura. 
    Crea un conjunto de obras únicas con todas las obras que haya en el museo (en este ejemplo habrá 2). (LISTADEOBRAS)
    Contrata a dos conservadores, uno escultórico y otro pictórico. 
    Realiza la restauración de las obras del museo por parte del conservador pictórico.
     */
    public static void main(String[] args) {
        // Creo el museo con sus respectivas listas. 
        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Salas> listaSalas = new ArrayList<>();
        List<Obras> listaObras = new ArrayList<>();
        List<Escultoricas> listaObrasEscult = new ArrayList<>();
        List<Pinturicas> listaObrasPintu = new ArrayList<>();
        Museo m1 = new Museo("Museo Programación", "IES Mar Albroan", listaEmpleados, listaSalas);

        // Creo diferentes obras y añado dichas obras a la lista. 
        System.out.println("\n Lista de Obras \n");
        
        Obras oP1 = new Pinturicas(30000.0, "1", "Desconocido");
        listaObrasPintu.add((Pinturicas) oP1);
        listaObrasPintu.forEach(System.out::println);
        
        Obras oE2 = new Escultoricas(2000.0, "2", "Conocido");
        listaObrasEscult.add((Escultoricas) oE2); // hago como un casting para que no me de error. 
        listaObrasEscult.forEach(System.out::println);
        
        // Creo diferentes salas y añado dichas salas a la lista. 
        System.out.println("\n Lista de Salas \n");
        
        Salas sala1 = new Fija("Cerraada", 0, new Temperatura(20, 1), new Humedad(20, 2), oE2);
        Salas sala2 = new Temporal(LocalDate.of(2000, Month.APRIL, 20), LocalDate.now(), 2, new Temperatura(20, 1), new Humedad(20, 2), oP1);
        listaSalas.add(sala1);
        listaSalas.add(sala2);
        listaSalas.forEach(System.out::println);
        
        // Contrata a dos conservadores, uno escultórico y otro pictórico. 
        System.out.println("\n Lista de Empleados \n");
        
        Empleado consEscult = new ConsEscultorico(listaObrasEscult, "21", "654582357A", "Tomás");
        Empleado consPintu = new ConsPinturico(listaObrasPintu, "22", "46543575B", "Ariel");
        listaEmpleados.add(consPintu);
        listaEmpleados.add(consEscult);
        listaEmpleados.forEach(System.out::println);
        
        //Realiza la restauración de las obras del museo por parte del conservador pictórico.
        
        System.out.println("\n Conservadores \n");
        for (Empleado e : listaEmpleados) {
            if (e instanceof ConsEscultorico) {
                ((ConsEscultorico) e).restaurarObra();
            } else {
                ((ConsPinturico) e).restaurarObra();
            }
        }
    }
}
