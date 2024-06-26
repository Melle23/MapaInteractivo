/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author JOSUE GOMEZ
 */
public class MapaClick extends javax.swing.JFrame {
 int x;
 int y;
    /**
     * Creates new form MapaClick
     */
    public MapaClick() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(608, 594));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/croquis-nainari.png"))); // NOI18N
        getContentPane().add(jLabel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
         x = evt.getX();
         y = evt.getY();
        System.out.println("Posición del clic - X: " + x + ", Y: " + y);

        JLabel posicionLabel = new JLabel();

        posicionLabel.setBounds(x, y, 100, 100);

         String imagePath = "/imagenes/5860579.png";
    ImageIcon icon = new ImageIcon(getClass().getResource(imagePath)); // Cargando la imagen correctamente
        posicionLabel.setIcon(icon);

        getContentPane().add(posicionLabel);

        revalidate();
        repaint();
        dispose();
    }//GEN-LAST:event_formMouseClicked

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
