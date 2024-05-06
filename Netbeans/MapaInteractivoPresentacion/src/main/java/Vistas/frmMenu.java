package Vistas;

import Controladora.ControlPresentacion;
import POJOs.UsuarioPOJO;

/**
 *
 * @author RAUL EDUARDO GOMEZ
 */
public final class frmMenu extends javax.swing.JFrame {
    UsuarioPOJO sesion;
    ControlPresentacion control;

    /**
     * Creates new form Ajustes
     *
     * @param usuario
     */
    public frmMenu(UsuarioPOJO usuario) {
        initComponents();
        this.sesion = usuario;
         control = new ControlPresentacion(sesion);
        System.out.println("---------------------------------------------------------------------------"
                + "\nfrmMenu - Imprimiento tu sesion: " + sesion.getDatos().getNombre()
                + "\n---------------------------------------------------------------------------");
        this.setVisible(true);
        this.transparenciaBoton();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ButtonRegreso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        btnVerHorario = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnEditarLocaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonRegreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonRegreso.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-back.png"))); // NOI18N
        ButtonRegreso.setBorder(null);
        ButtonRegreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1)_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulIS.png"))); // NOI18N
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulISS.png"))); // NOI18N
        if (sesion == null) {
            this.setVisible(false);
        }
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 170, -1));

        btnVerHorario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulVerHorario.png"))); // NOI18N
        btnVerHorario.setBorder(null);
        btnVerHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerHorario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulVerHorarioS.png"))); // NOI18N
        btnVerHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHorarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, 60));

        btnAjustes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAjustes.setForeground(new java.awt.Color(255, 255, 255));
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulA.png"))); // NOI18N
        btnAjustes.setBorder(null);
        btnAjustes.setBorderPainted(false);
        btnAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAjustes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectanguloAzulAS.png"))); // NOI18N
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        jPanel2.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 170, 60));

        btnEditarLocaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarLocaciones.setForeground(new java.awt.Color(0, 102, 255));
        btnEditarLocaciones.setText("Gestionar Locaciones");
        btnEditarLocaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarLocaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLocacionesActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarLocaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cisco.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 915, 540));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 880, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        control.desplegarAjustes();
        dispose();
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnVerHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHorarioActionPerformed
  control.desplegarHorario();
      dispose();
    }//GEN-LAST:event_btnVerHorarioActionPerformed

    private void ButtonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresoActionPerformed
        control.desplegarMapa();
        dispose();
    }//GEN-LAST:event_ButtonRegresoActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        control.desplegarMapa();
        dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnEditarLocacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLocacionesActionPerformed
        control.desplegarMenuLocaciones();
        dispose();
    }//GEN-LAST:event_btnEditarLocacionesActionPerformed
    public void transparenciaBoton() {

        btnAjustes.setOpaque(false);
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setBorderPainted(false);

        btnVerHorario.setOpaque(false);
        btnVerHorario.setContentAreaFilled(false);
        btnVerHorario.setBorderPainted(false);

        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setBorderPainted(false);

        ButtonRegreso.setOpaque(false);
        ButtonRegreso.setContentAreaFilled(false);
        ButtonRegreso.setBorderPainted(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegreso;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnEditarLocaciones;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnVerHorario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
