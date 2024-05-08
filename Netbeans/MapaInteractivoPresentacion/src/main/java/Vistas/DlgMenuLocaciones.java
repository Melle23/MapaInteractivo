/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladora.ControlPresentacion;
import POJOs.UsuarioPOJO;

/**
 *
 * @author favela
 */
public class DlgMenuLocaciones extends javax.swing.JFrame {

    UsuarioPOJO sesion;
    ControlPresentacion control;
    
    /**
     * Creates new form DlgEdicionLocaciones
     */
    public DlgMenuLocaciones(UsuarioPOJO usuario) {
        initComponents();
        this.sesion = usuario;
        this.transparenciaBoton();
        System.out.println("---------------------------------------------------------------------------"
                         + "\nDlgMenuLocaciones - Imprimiento tu sesion: " + sesion 
                       + "\n---------------------------------------------------------------------------");
        control = new ControlPresentacion(sesion);
        this.setVisible(true);
    }
      public void transparenciaBoton() {

        bntRegistro.setOpaque(false);
        bntRegistro.setContentAreaFilled(false);
        bntRegistro.setBorderPainted(false);

        btnEditar.setOpaque(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setBorderPainted(false);

        btnEliminar.setOpaque(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setBorderPainted(false);

        ButtonRegreso.setOpaque(false);
        ButtonRegreso.setContentAreaFilled(false);
        ButtonRegreso.setBorderPainted(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonRegreso = new javax.swing.JButton();
        bntRegistro = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonRegreso.setBackground(new java.awt.Color(0, 102, 204));
        ButtonRegreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonRegreso.setForeground(new java.awt.Color(0, 102, 255));
        ButtonRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-back.png"))); // NOI18N
        ButtonRegreso.setBorder(null);
        ButtonRegreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        bntRegistro.setForeground(new java.awt.Color(255, 255, 255));
        bntRegistro.setText("Registrar Locacion");
        bntRegistro.setBorder(null);
        bntRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(bntRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 150, 40));

        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Locacion");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 150, 40));

        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Locacion");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresoActionPerformed
        control.deplegarMenu();
        dispose();
    }//GEN-LAST:event_ButtonRegresoActionPerformed

    private void bntRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistroActionPerformed
        control.desplegarRegistroLocacion();
        dispose();
    }//GEN-LAST:event_bntRegistroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
control.desplegarEliminarLocacion();
dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegreso;
    private javax.swing.JButton bntRegistro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}