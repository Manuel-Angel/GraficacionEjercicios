/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaciondeformas3d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3f;

/**
 *
 * @author AKGI
 */
public class OyenteMovimiento implements ActionListener {
    
    protected PanelMovimiento panel;
    protected boolean bandera;
    
    public OyenteMovimiento(PanelMovimiento panel) {
        this.panel = panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!bandera) {
            bandera = true;
            new HiloMovimiento().start();
        }
    }
    
    class HiloMovimiento extends Thread {

        public void run() {
            int angulo = 0;
            double r = 0.5;
            Transform3D t3d = new Transform3D();
            for (;;) {
                double rad = Math.toRadians(angulo);
                float x = (float) (r * Math.cos(rad));
                float y = (float) (r * Math.sin(rad));
                t3d.setTranslation(new Vector3f(x, y, 0f));
                panel.getTg().setTransform(t3d);
                angulo += 3;
                
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                    System.out.println("Error" + ex);
                    System.exit(0);
                }
            }
        }
    }
    
}
