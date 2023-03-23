/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class MiTienda {

    public static void main(String[] args) {
        //Crea una lista de productos y añade dos objetos de cada tipo de producto distinto a la misma
        List<Producto> listaProductos = new ArrayList<>();
        System.out.println("\nLista de Productos");

        Producto pa1 = new Pantalon(40, "P&B", 21, 22.5, 15.5, "Pantalon cargo negro");
        Producto pa2 = new Pantalon(40, "P&B", 21, 22.5, 15.5, "Pantalon cargo blanco");
        Producto l1 = new LibroPapel(200, "54879231320962", 31, 39.99, 17, "Libro lengua");
        Producto l2 = new LibroDigital(476, "5824358273452", 32, 29.99, 12, "Libro lengua digital");
        Producto m1 = new Musica("EL", 121, 23.5, 5.9, "Cancion de el");
        Producto m2 = new Musica("ELLA", 122, 53.6, 9.7, "Cancion de ella");

        listaProductos.add(pa1);
        listaProductos.add(pa2);
        listaProductos.add(l1);
        listaProductos.add(l2);
        listaProductos.add(m1);
        listaProductos.add(m2);
        // Muestra los datos de los productos usando un foreach.
        listaProductos.forEach(System.out::println);

        // Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y
        // una expresión lambda. Muestra la lista de productos ordenados por precio.
        System.out.println("\nLista ordenada según los precios");
        Comparator<Producto> segunPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        listaProductos.sort(segunPrecio);
        listaProductos.forEach(System.out::println);

        // Lo mismo pero por el código.
        System.out.println("\nLista ordenada según los códigos");
        Comparator<Producto> segunCodigo = (p1, p2) -> Double.compare(p1.getCodigo(), p2.getCodigo());
        listaProductos.sort(segunCodigo);
        listaProductos.forEach(System.out::println);

        // Recorre la lista de productos y guarda todos los libros en una lista de libros.
        List<Libro> listaLibros = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p); // Hago un casting. // Conversion Explicita
            }
        }
        
        //  Busqueda binaria. 
        Collections.binarySearch(listaProductos, m2, segunCodigo);

        // Muestra los datos de la lista de libros usando un objeto Iterator.
        System.out.println("\nLista de Libros usando un Iterator");
        Iterator<Libro> iterador = listaLibros.iterator();
        while (iterador.hasNext()) {
            Libro libro = iterador.next();
            System.out.println(libro.getDescripcion());
        }

        // Ordenar según ISBN, haciendo uso de <<Comparable>> y muestala. 
        System.out.println("\nLista ordenada por su ISBN");
        Collections.sort(listaLibros);
        listaLibros.forEach(System.out::println);

        // Recorre de nuevo la lista de libros y en cada iteración, 
        // ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("\n Envio/Descarga de Libros");
        for (Libro libros : listaLibros) {
            if (libros instanceof LibroPapel) {
                String direccion = "Casa del comprador";
                ((LibroPapel) libros).enviar(direccion);; // Conversion Explicita
            }
            if (libros instanceof LibroDigital) {
                ((LibroDigital) libros).descargar(); // Conversion Explicita
            }
        }

        // Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("\n ¿Existe o no existen los libros?");
        if (listaLibros.contains(l1)) {
            System.out.println("Existe el libro " + l1.getDescripcion() + "?");
        } else {
            System.out.println("El libro " + l1.getDescripcion() + " no existe.");
        }

        // Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        // Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        System.out.println("\n Lista nueva de productos");
        List<SeEnvia> listaNuevaProductosEnvian = new ArrayList<>();
        // Tengo que especificar el tipo de objetos que meter dentro de la lista, 
        // para que fuera del bucle for no se puedan meter objetos de otro tipo, 
        // De ésta manera solo se podrán meter meter valores a la lista que tengan
        // implementada la interfaz SeEnvia
        String direccion = "TuDirección"; // Está dirección se la deberia de meter el usuario por consola. 
        for (Producto p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaNuevaProductosEnvian.add((SeEnvia) p);
                ((SeEnvia) p).enviar(direccion); // Casting, conversion explicita
            }
        }
        listaNuevaProductosEnvian.forEach(System.out::println);

        // Inventa un método abstracto en la clase Libros e implementalo en sus hijas y mustra su funcionalidad poor conosla. 
        System.out.println("\n Método abstracto de la clase libro que dice algo diferente segun el tipo de libro que sea");
        for (Libro libros : listaLibros) {
            if (libros instanceof LibroPapel) {
                libros.comentarioPostLectura();
            }
            if (libros instanceof LibroDigital) {
                libros.comentarioPostLectura();
            }
        }
    }
}
