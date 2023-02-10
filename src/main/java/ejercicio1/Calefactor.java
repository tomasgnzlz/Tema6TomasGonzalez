/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Calefactor {
    
    private Integer temperatura;
    private String marca;

    public Calefactor(Integer temperatura, String marca) {
        this.temperatura = temperatura;
        this.marca = marca;
    }
    

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + ", marca=" + marca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.temperatura);
        hash = 73 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calefactor other = (Calefactor) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.temperatura, other.temperatura);
    }

    // Métodos necesarios en está clase. 
    public void encenderCalefactor(){
        System.out.println("El calefactor está encendido");
    }
    
    public void apagarCalefactor(){
        System.out.println("El calefactor está apagado");
    }
    
    public void fijarTemperatura(Integer t){// int tbn vale
        System.out.println("Temperatura calefactor: " + t);
    }
    
    
    
    
    
}
