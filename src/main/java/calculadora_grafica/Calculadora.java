/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_grafica;

import javax.swing.JFrame;

/**
 *
 * @author tomas
 *
 */
public class Calculadora {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora Tomás");
        frame.setBounds(300, 300, 0, 0);
        frame.add(new PanelPrincipal());
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }

}
