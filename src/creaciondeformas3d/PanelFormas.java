/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaciondeformas3d;

import modelos3d.Anillos3D;
import modelos3d.Dodecaedro;
import modelos3d.Lineas3D;
import modelos3d.Octaedro;
import modelos3d.Poliedro;
import modelos3d.PrismaHexagonal;
import modelos3d.PrismaRectangular;
import modelos3d.PrismaTriangular;
import modelos3d.Sombrilla;

/**
 *
 * @author AKGI
 */
public class PanelFormas extends javax.swing.JPanel {

    /**
     * Creates new form PanelFormas
     */
    public PanelFormas() {
        initComponents();
        panelCentro.addTab("Lineas",new PanelForma3D(new Lineas3D()));
        panelCentro.addTab("Prisma Triangular",new PanelForma3D(new PrismaTriangular(0.4f,0.8f)));
        panelCentro.addTab("Prisma Rectangular",new PanelForma3D(new PrismaRectangular(0.4f,0.3f,0.8f)));
        panelCentro.addTab("Prisma Hexagonal",new PanelForma3D(new PrismaHexagonal(0.4f,0.7f)));
        panelCentro.addTab("Sombrilla",new PanelForma3D(new Sombrilla(7, 0.7f)));
        panelCentro.addTab("Octaedro",new PanelForma3D(new Octaedro(0.4f)));
        panelCentro.addTab("Poliedro",new PanelForma3D(new Poliedro(0.4f,0.8f,0.3f)));
        panelCentro.addTab("Dodecaedro",new PanelForma3D(new Dodecaedro(0.4f)));
        panelCentro.addTab("Anillos",new PanelForma3D(new Anillos3D(0.5f,0.3f,0.3f)));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentro = new javax.swing.JTabbedPane();

        setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
        setLayout(new java.awt.BorderLayout());
        add(panelCentro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane panelCentro;
    // End of variables declaration//GEN-END:variables
}
