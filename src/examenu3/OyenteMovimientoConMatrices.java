/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu3;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.j3d.*;
import javax.vecmath.*;


/**
 *
 * @author Manuel Angel Muñoz S
 */
public class OyenteMovimientoConMatrices extends OyenteMovimiento{
    //PanelMovimiento panel;
    public OyenteMovimientoConMatrices(PanelMovimiento p){
        super(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!bandera) {
        bandera = true;
            new HiloMovimiento().start();
        }
    }
    class HiloMovimiento extends Thread {

        @Override
        public void run() {
           int anguloT = 0;
           int cambioT=-1;
           int anguloR = 0;
           double r = 0.7;
           Transform3D t3d = new Transform3D();
           Matrix4f matrizT = new Matrix4f(); //Matriz con ceros
           Matrix4f matrizR = new Matrix4f();
           for(;;){
                double rad= Math.toRadians(anguloT);
                float x= (float)(r*Math.cos(rad));
                float y= (float)(r*Math.sin(rad));
                float z=0;
                matrizT.setIdentity();
                matrizT.setM03(x);
                matrizT.setM13(y);
                matrizT.setM23(z);

                rad= Math.toRadians(anguloR);
                float seno= (float)Math.sin(rad);
                float coseno=(float)Math.cos(rad);
                matrizR.setIdentity();
                matrizR.setM00(coseno);
                matrizR.setM22(coseno);
                matrizR.setM02(seno);
                matrizR.setM20(-seno);
                
                matrizT.mul(matrizR);
                t3d.set(matrizT);
                panel.getTg().setTransform(t3d);
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                }
                anguloT+=cambioT;
                anguloR+=3;
                if(Math.abs(anguloT)>=360){
                    cambioT*=-1;
                }
           }
        }
    }
}
