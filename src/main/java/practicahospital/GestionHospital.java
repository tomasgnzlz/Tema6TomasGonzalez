/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author tomas
 */
public class GestionHospital {

    // Declaración de los atribtuos. 
    Hospital hospital;

    // Constructor de hospital. 
    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public static void main(String[] args) {

        // Creo un hospital. 
        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Paciente> listaPacientes = new ArrayList<>();
        Hospital h1 = new Hospital("Hospital de Estepona", "Estepona", 5000, listaEmpleados, listaPacientes);

        h1.ingresarPaciente(new Paciente("1", "Juan5", "Juan25", new NIF()));
        h1.ingresarPaciente(new Paciente("2", "Tomas", "Gonzalez", new NIF()));
        h1.ingresarPaciente(new Paciente("3", "Ariel", "Atienza", new NIF()));
        h1.ingresarPaciente(new Paciente("4", "Juan", "Carlos", new NIF()));
        h1.ingresarPaciente(new Paciente("5", "Carlos", "Juan", new NIF()));

        h1.contratarEmpleado(new Medico("Cirugía", "12345678", 3000.0, "Ariel", "Ariel2", new NIF()));
        h1.contratarEmpleado(new Medico("Otorrinolaringología", "12345678", 3000.0, "Tomas", "Tomas2", new NIF()));

        h1.contratarEmpleado(new Administrativo(Grupo.C, "123987456", 2000.0, "Messi", "Leo", new NIF()));
        h1.contratarEmpleado(new Administrativo(Grupo.D, "98745213", 3000.0, "LEo", "Messi", new NIF()));
        h1.contratarEmpleado(new Administrativo(Grupo.E, "417852963", 4000.0, "Cristiano", "Ronaldo", new NIF()));
        System.out.println("   LISTA DE EMPLEADOS DEL HOSPITAL \n                         ");
        listaEmpleados.forEach(System.out::println);
        System.out.println("\n LISTA DE PACIENTES DEL HOSPITAL \n                         ");
        listaPacientes.forEach(System.out::println);

        // Obtener un medico y un paciente aleatorio.
        // ----
        Random random = new Random();
        int numPacientesHospital = listaPacientes.size();
        int numRamUno = random.nextInt(numPacientesHospital);
        Paciente pacienteRandom = listaPacientes.get(numRamUno);
        String nombrePacienteAleatorio = pacienteRandom.getNombre();
        // ----
        int numMedicosHospital = listaEmpleados.size();
        int numRamDos = random.nextInt(numMedicosHospital);
        Empleado empleadoRandom = listaEmpleados.get(numRamDos);
        String nombreMedico = empleadoRandom.getNombre();

        System.out.println("El paciente " + nombrePacienteAleatorio + " está siendo atendido por el medico llamado"
                + nombreMedico + " que le está suministrando Paracetamol");

        // Calculando el IRPF de los Empleados.
        System.out.println("\n      EL IRPF DE LOS EMPLEADOS            \n");
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Medico) {
                Medico med = (Medico) empleado;
                System.out.println("El IRPF del médico es " + med.calcularIRPF());
            } else if (empleado instanceof Administrativo) {
                Administrativo admin = (Administrativo) empleado;
                System.out.println("El IRPF del Administrativo es " + admin.calcularIRPF());
            }
        }

    }

}
//
//  //Creo los médicos, administrativos y los pacientes del hospital. 
//        Persona p1= new Paciente("12345678", "Juan", "Juan2",new NIF());
//        h1.ingresarPaciente((Paciente)p1); // Le hago un casting. 
//        /*LE HAGO UN CASTING PARA QUE LA PERSONA QUE YO HE CREADO SIGA SIENDO UN PACIENTE, 
//        DE LO CONTRARIO EL MÉTODO NO ME VA A DEJAR CREAR ESO XQ PACIENTE ES UN PACIENTE Y UNA PERSONA,
//        PERO UNA PERSONA NO PUEDE SER UN PACIENTE.*/
