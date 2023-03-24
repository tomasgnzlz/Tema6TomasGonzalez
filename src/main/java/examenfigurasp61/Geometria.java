/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasp61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tomas
 */
public class Geometria {

    public static void main(String[] args) {

        // 1. 
        // Crea un conjunto de objetos Figura y añade dos objetos de cada tipo al conjunto.
        Set<Figura> conjuntoFiguras = new TreeSet<>();

        // Creo los diferentes tipos de objetos para añadirlos al conjunto
        Point puntoCirculo1 = new Point(5, 5);
        Point puntoCirculo2 = new Point(7, 7);
        Figura c1 = new Circulo(5, puntoCirculo1, "c1", "Rojo"); // CONVERSION IMPLICITA
        Figura c2 = new Circulo(5, puntoCirculo2, "c2", "Azul"); // CONVERSION IMPLICITA
        Point puntoRec1 = new Point(1, 3); // Esquina sup izq
        Point puntoRec2 = new Point(5, 3); // Esquina sup der
        Point puntoRec3 = new Point(1, 1); // Esquina inf izq
        Point puntoRec4 = new Point(5, 1); // Esquina inf der
        Figura r1 = new Rectangulo(puntoRec1, puntoRec2, puntoRec3, puntoRec4, 4, 2, 4, "R1", "Rojo");// CONVERSION IMPLICITA
        Point puntoTri1 = new Point(0, 0); // Esquina sup
        Point puntoTri2 = new Point(0, 3); // Esquina inf der
        Point puntoTri3 = new Point(3, 0); // Esquina inf izq
        Figura t1 = new Triangulo(puntoTri1, puntoTri2, puntoTri3, 3, 2, 3, "T1", "Azul");// CONVERSION IMPLICITA

//        conjuntoFiguras.add(c1);
//        conjuntoFiguras.add(c2);
//        conjuntoFiguras.add(r1);
//        conjuntoFiguras.add(t1);
////        2. Muestra los datos de las figuras usando un foreach, 
////        mostrando también el área de cada una.
//          conjuntoFiguras.forEach(System.out::println); 
////        // NOSE PORQUE ME DA ERRROR AL EJECUTAR EL CODIGO, CREO QUE ESTÁ TODO BIEN. 
        // 3. 
        // Crea una lista a partir del conjunto de figuras. 
        System.out.println("LISTA DE FIGURAS");
        List<Figura> listaFiguras = new ArrayList<>(conjuntoFiguras);
        listaFiguras.add(c1);
        listaFiguras.add(c2);
        listaFiguras.add(r1);
        listaFiguras.add(t1);
        listaFiguras.forEach(System.out::println);
        // Muestro el área de cada una de las figuras.
        System.out.println("\n EL ÁREA DE LAS FIGURAS");
        for (Figura l : listaFiguras) {
            double areaFigurad = l.area();
            System.out.println("El área del " + l.getId() + " es: " + areaFigurad);
        }

        // 4.
        // Ordena la lista de figuras por color y por id, haciendo uso de <<Comparator>> 
        // y una expresión lambda. Muestra la lista de figuras ordenadas.
        System.out.println("\nLISTA DE FIGURAS ORDENADAS POR COLOR Y ADEMÁS POR ID");
        Comparator<Figura> segunColor = (p1, p2) -> p1.getColor().compareToIgnoreCase(p2.getColor());
        Comparator<Figura> segunId = (p1, p2) -> p1.getId().compareToIgnoreCase(p2.getId());
        // Ordeno las listas usando ambos criterios, primero se ordenan por color y ademas por su id. 
        Collections.sort(listaFiguras, segunColor.thenComparing(segunId));
        listaFiguras.forEach(System.out::println);

        // 5. 
        // Solicita al usuario por teclado que introduzca un id de una figura. 
        // Realiza la búsqueda binaria según el id introducido, mostrando 
        // la posición que ocupa en la lista, si existe.
        Scanner teclado = new Scanner(System.in);
        String idFigura;
        System.out.println("\n  Introduce el id de una figura para realizar la busqueda binaria por favor\n");
        //idFigura = teclado.nextLine();
        //Collections.binarySearch(listaFiguras, idFigura, segunColor);

        // 6. 
        // Recorre la lista de figuras y guarda en una nueva lista todas aquellas que sean dibujables,
        // en otra todas aquellas que sean movibles y aquellas que sean Comparable. 
        System.out.println("\n LISTA DE OBJETOS DIBUJABLES");
        List<Dibujable> listaObjetosDibujables = new ArrayList<>();
        for (Figura l : listaFiguras) {
            if (l instanceof Dibujable) {
                listaObjetosDibujables.add((Dibujable) l); // CONVERSIÓN EXPLICITA
            }
        }
        listaObjetosDibujables.forEach(System.out::println);

        System.out.println("\n LISTA DE OBJETOS MOVIBLES");
        List<Movible> listaObjetosMovibles = new ArrayList<>();
        for (Figura l : listaFiguras) {
            if (l instanceof Movible) {
                listaObjetosMovibles.add((Movible) l); // CONVERSIÓN EXPLICITA
            }
        }
        listaObjetosMovibles.forEach(System.out::println);

        System.out.println("\n LISTA DE OBJETOS COMPARABLE");
        List<Comparable> listaObjetosComparable = new ArrayList<>();
        for (Figura l : listaFiguras) {
            if (l instanceof Comparable) {
                listaObjetosComparable.add((Comparable) l); // CONVERSIÓN EXPLICITA
            }
        }
        listaObjetosComparable.forEach(System.out::println);

        // 7. 
        // Recorre la lista de objetos Dibujable y llama al método dibujar de cada uno.
        for (Dibujable l : listaObjetosDibujables) {
            if (l instanceof Dibujable) {
                ((Dibujable) l).dibujar(); // CONVERSIÓN EXPLICITA
                // No hace nada porque todavia no he metido código dentro de esa interfaz.
            }
        }

        // 8. 
        // Recorre la lista de objetos Movible y mueve a la derecha dos unidades 
        // aquellos objetos Rectángulo y tres unidades arriba los objetos Circulo.
        int moverDosDerecha = 2;
        int moverTresArriba = 3;
        for (Movible l : listaObjetosMovibles) {
            // Instance of para mover solo aquellos objetos que sean Rectangulos.
            if (l instanceof Rectangulo) {
                l.moverDer(moverDosDerecha);
            }
            // Instance of para mover solo aquellos objetos que sean Circulos.
            if (l instanceof Circulo) {
                l.moverArr(moverTresArriba);
            }
        }

        // 9. Añade comentarios en el código indicando donde hay conversiones implícitas y explícitas.
    }

}
