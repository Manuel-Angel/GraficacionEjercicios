
package examenu3;

import javax.swing.JFrame;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class Movimiento3D {
    public static void main(String[] args) {
        PanelMovimiento panel= new PanelMovimiento();
        OyenteMovimiento oyente= new OyenteMovimiento(panel);
        panel.addEventos(oyente);
        JFrame f= new JFrame("Movimiento en 3D");
        f.setSize(800,600);
        f.setLocation(50,10);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);
    }
    
}
