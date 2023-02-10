/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciavehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the commaand line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo(123, "a1a1a1a1", "Kia", "Ceed", "Negro", 27.5, true);
        System.out.println(v1.toString());
        
        
        VehiculoElectrico vE1 = new VehiculoElectrico(1, "111AAA","Testa", "Model-s", "rodjo", 150, true, 9, 240);
        System.out.println(vE1);
         VehiculoCombustion vC1 = new VehiculoCombustion(60, "VVARbae", "walnag","tu", "Negro", 50, true, 60, TipoCombustible.DIESEL);
        
//        // SONBREESCRITURA Y POLIMORFISMO.
//        v1.arrancar();// suyo
//        vE1.arrancar();// suyo
//        vC1.arrancar();// padre
        /*
        papel delante y hacr esquema de clases para saber como acceder a las distintas clases del paquete
        */
        System.out.println("------------------------------------------------------------------------------");
        
        List<Vehiculo> lista = new ArrayList<>();
        // en la lista puedo meter todo lo que sea de la clase vehicudlo
        lista.add(v1);
        lista.add(vE1);
        // las siguientes lineeas son conversiones implicitas. 
        // es decir, guardo dos tipos de vehiculos, pero siguen siendo vehiculos. 
        lista.add(vC1);
        
        
        for (Vehiculo v : lista) {
            System.out.println(v);
            v.arrancar();
            if (v instanceof VehiculoElectrico) {
                System.out.println("------ Un vehiculo cambiará sus baterias ------");
                ((VehiculoElectrico) v).cambiarBateria();//?¿
            }
        }
        
    }
    
}
