
package examenu3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3f;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class OyenteMovimiento implements ActionListener{
    protected PanelMovimiento panel;
    protected boolean bandera;
    public OyenteMovimiento(PanelMovimiento panel) {
        this.panel=panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!bandera){
            new HiloMovimiento().start();
            bandera=true;
        }
    }
    class HiloMovimiento extends Thread{
        @Override
        public void run(){
            int angulo=0;
            double r=0.5;
            Transform3D t3d= new Transform3D();
            while(true){
                double rad= Math.toRadians(angulo);
                float x=(float)(r*Math.cos(rad));
                float y=(float)(r*Math.sin(rad));
                t3d.setTranslation(new Vector3f(x,y,0f));
                panel.getTg().setTransform(t3d);
                angulo+=3;
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OyenteMovimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
