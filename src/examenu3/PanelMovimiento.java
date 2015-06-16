/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu3;

import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.Node;
import javax.media.j3d.TransformGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelos3d.Panel3D;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class PanelMovimiento extends Panel3D{
    protected TransformGroup tg;
    private JButton botonIniciar;
    public PanelMovimiento(){
        setOrbitBehavior(true);
        addComponentes();
    }
    public void addEventos(OyenteMovimiento o){
        botonIniciar.addActionListener(o);
    }
    @Override
    public Node addNodoPrincipal() {
        tg= new TransformGroup();
        tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        //tg.addChild(new ColorCube(0.1));
        tg.addChild(new Tetraedro(0.5f));
        return tg;
    }

    /**
     * @return the tg
     */
    public TransformGroup getTg() {
        return tg;
    }

    /**
     * @param tg the tg to set
     */
    public void setTg(TransformGroup tg) {
        this.tg = tg;
    }

    private void addComponentes() {
        JPanel panelNorte= new JPanel();
        botonIniciar= new JButton("Iniciar movimiento");
        panelNorte.add(botonIniciar);
        add(panelNorte,"North");
    }
}