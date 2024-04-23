package Vistas;

import Controladora.ControlPresentacion;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author RAUL EDUARDO GOMEZ
 */
public class frmPrincipal extends javax.swing.JFrame {

    ControlPresentacion control = new ControlPresentacion();

    /**
     * Creates new form MapaInteractivo
     *
     * @param parent
     * @param modal
     */
    public frmPrincipal(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    public frmPrincipal() {
        initComponents();
        this.setVisible(true);

        initComponents();

        txtBusqueda.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Borrar el texto predeterminado cuando el JTextField obtiene el foco
                if (txtBusqueda.getText().equals("Búsqueda...")) {
                    txtBusqueda.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // No es necesario hacer nada cuando se pierde el foco
            }
        });
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
        Boton_Ajustes = new javax.swing.JButton();
        Boton_TusSalones = new javax.swing.JButton();
        Label_LogoITSON = new javax.swing.JLabel();
        Label_Mapa = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Boton_PuntosDeInteres = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        Boton_Ajustes1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mapa ITSON");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Ajustes.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Boton_Ajustes.setText("cerrar");
        Boton_Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AjustesActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 80, 20));

        Boton_TusSalones.setBackground(new java.awt.Color(231, 231, 231));
        Boton_TusSalones.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Boton_TusSalones.setForeground(new java.awt.Color(25, 111, 196));
        Boton_TusSalones.setText("Tus salones");
        jPanel1.add(Boton_TusSalones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 120, -1));

        Label_LogoITSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1).png"))); // NOI18N
        jPanel1.add(Label_LogoITSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 80));
        jPanel1.add(Label_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 330));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 850, 10));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Boton_PuntosDeInteres.setBackground(new java.awt.Color(231, 231, 231));
        Boton_PuntosDeInteres.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Boton_PuntosDeInteres.setForeground(new java.awt.Color(25, 111, 196));
        Boton_PuntosDeInteres.setText("Puntos interés");

        txtBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBusqueda.setText("Búsqueda...");
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        Boton_Ajustes1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Boton_Ajustes1.setText("---");
        Boton_Ajustes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Ajustes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton_Ajustes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Boton_PuntosDeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Boton_Ajustes1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(Boton_PuntosDeInteres)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 250, 550));

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

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed

    }//GEN-LAST:event_txtBusquedaActionPerformed


    private void Boton_AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AjustesActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Boton_AjustesActionPerformed

    private void Boton_Ajustes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Ajustes1ActionPerformed
        control.deplegarAjustes();
        dispose();
    }//GEN-LAST:event_Boton_Ajustes1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Ajustes;
    private javax.swing.JButton Boton_Ajustes1;
    private javax.swing.JButton Boton_PuntosDeInteres;
    private javax.swing.JButton Boton_TusSalones;
    private javax.swing.JLabel Label_LogoITSON;
    private javax.swing.JLabel Label_Mapa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
