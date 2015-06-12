/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaciondeformas3d;

import javax.swing.JFrame;

/**
 *
 * @author AKGI
 */
public class Movimiento3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PanelMovimiento panel = new PanelMovimiento();
        OyenteMovimiento oyente = new OyenteMovimiento(panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Movimiento 3D");
        f.setSize(800, 600);
        f.setLocation(50, 50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);

    }

}
