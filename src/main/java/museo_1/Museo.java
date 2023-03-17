/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Museo {

    // Declaro los atributos correspondientes. 
    private String nombre;
    private String direccion;
    private List<Empleado> listaEmpleados;
    private List<Salas> listaSalas;

    // Constructor parametrizado. 
    public Museo(String nombre, String direccion, List<Empleado> listaEmpleados, List<Salas> listaSalas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = listaEmpleados;
        this.listaSalas = listaSalas;
    }

    // Getters y Setters. 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Salas> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Salas> listaSalas) {
        this.listaSalas = listaSalas;
    }

    // Métodos para contratar y despedir empleados. 
    public static List<Empleado> contratarEmpleado(Empleado emAux) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(emAux);
        return listaEmpleados;
    }

    public static List<Empleado> despedirEmpleado(Empleado emAux) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.remove(emAux);
        return listaEmpleados;
    }

    // Métodos para añadir y elinminar salas;
    public static List<Salas> añadirSala(Salas salasAux) {
        List<Salas> listaSalas = new ArrayList<>();
        listaSalas.add(salasAux);
        return listaSalas;
    }

    public static List<Salas> eliminarSala(Salas salasAux) {
        List<Salas> listaSalas = new ArrayList<>();
        listaSalas.remove(salasAux);
        return listaSalas;
    }

}
