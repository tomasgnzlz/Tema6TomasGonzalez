/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo2_tarea6b;

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
        Museo m1 = new Museo("Tucasa", "Micasa", listaEmpleados, listaSalas);
        
        // Creo diferentes obras. 
        Obras o1 = new Pinturicas(300000.0, "1", "Tu_MAdre");
        
        
        
    }
    
    
}
