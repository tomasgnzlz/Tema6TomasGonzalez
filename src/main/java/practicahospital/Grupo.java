/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package practicahospital;

/**
 *
 * @author tomas
 */
public enum Grupo {
    // Creo los tipo de irpf con sus respectivos % para la realización del calculo del mismo. 
    C(17.5), D(18.0), E(18.5);
    
    private Double irpf;

    private Grupo(Double irpf) {
        this.irpf = irpf;
    }

    public Double getIrpf() {
        return irpf;
    }

    public void setIrpf(Double irpf) {
        this.irpf = irpf;
    }
    
    
    
    
}
