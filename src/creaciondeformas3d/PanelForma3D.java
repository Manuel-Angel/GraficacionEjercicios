/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaciondeformas3d;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import modelos3d.Forma3D;
import modelos3d.Panel3D;

/**
 *
 * @author AKGI
 */
public class PanelForma3D extends Panel3D {

    private Forma3D forma; //Panel que me va  a presentar todas las formas

    public PanelForma3D(Forma3D forma) {
        this.forma = forma;
        addUniverso();
        setOrbitBehavior(true);

    }

    @Override
    public Node addNodoPrincipal() {
        BranchGroup bg = new BranchGroup();
        bg.addChild(forma);
        return bg;
    }

}
