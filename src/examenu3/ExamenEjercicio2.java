/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu3;

import javax.swing.JFrame;
/**
 *
 * @author Manuel Angel Muñoz S
 */
public class ExamenEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PanelMovimiento panel= new PanelMovimiento();
        OyenteMovimiento oyente= new OyenteMovimientoConMatrices(panel);
        panel.addEventos(oyente);
        
        JFrame f= new JFrame("Movimiento en 3D con matrices");
        f.setSize(800,600);
        f.setLocation(50,10);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);
    }
}