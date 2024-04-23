package Vistas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author RAUL EDUARDO GOMEZ
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MapaInteractivo
     * @param parent
     * @param modal
     */
    public frmPrincipal(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    public frmPrincipal() {
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
        AV1400 = new javax.swing.JLabel();
        AV1000 = new javax.swing.JLabel();
        AV1500 = new javax.swing.JLabel();
        LV1500 = new javax.swing.JLabel();
        PoliDeportivo = new javax.swing.JLabel();
        CentroIdiomas = new javax.swing.JLabel();
        AudioVisual = new javax.swing.JLabel();
        LV500 = new javax.swing.JLabel();
        PasilloEstudiantil = new javax.swing.JLabel();
        CISCO = new javax.swing.JLabel();
        AlbercaOlimpica = new javax.swing.JLabel();
        Kiawa = new javax.swing.JLabel();
        CAD = new javax.swing.JLabel();
        Resiedencias = new javax.swing.JLabel();
        LV1800 = new javax.swing.JLabel();
        AV800 = new javax.swing.JLabel();
        Biblioteca = new javax.swing.JLabel();
        AV600 = new javax.swing.JLabel();
        AV700 = new javax.swing.JLabel();
        LV300 = new javax.swing.JLabel();
        Alamos = new javax.swing.JLabel();
        LV1100 = new javax.swing.JLabel();
        CanchaTennis = new javax.swing.JLabel();
        Civil = new javax.swing.JLabel();
        RegistroEscolar = new javax.swing.JLabel();
        AV1600 = new javax.swing.JLabel();
        LV800 = new javax.swing.JLabel();
        LV700 = new javax.swing.JLabel();
        AV1100 = new javax.swing.JLabel();
        AV1200 = new javax.swing.JLabel();
        AV1300 = new javax.swing.JLabel();
        Enfermeria = new javax.swing.JLabel();
        Tutorias = new javax.swing.JLabel();
        Label_LogoITSON = new javax.swing.JLabel();
        AV1700 = new javax.swing.JLabel();
        Cultura = new javax.swing.JLabel();
        Movilidad = new javax.swing.JLabel();
        CasaClub = new javax.swing.JLabel();
        AulaMagna = new javax.swing.JLabel();
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

        AV1400.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1400, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));
        AV1400.setVisible(false);

        AV1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));
        AV1000.setVisible(false);

        AV1500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));
        AV1500.setVisible(false);

        LV1500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));
        LV1500.setVisible(false);

        PoliDeportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(PoliDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));
        PoliDeportivo.setVisible(false);

        CentroIdiomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(CentroIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));
        CentroIdiomas.setVisible(false);

        AudioVisual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));
        AudioVisual.setVisible(false);

        LV500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV500, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));
        LV500.setVisible(false);

        PasilloEstudiantil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(PasilloEstudiantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));
        PasilloEstudiantil.setVisible(false);

        CISCO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(CISCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));
        CISCO.setVisible(false);

        AlbercaOlimpica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AlbercaOlimpica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));
        AlbercaOlimpica.setVisible(false);

        Kiawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Kiawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));
        Kiawa.setVisible(false);

        CAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(CAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));
        CAD.setVisible(false);

        Resiedencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Resiedencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));
        Resiedencias.setVisible(false);

        LV1800.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV1800, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));
        LV1800.setVisible(false);

        AV800.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV800, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));
        AV800.setVisible(false);

        Biblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));
        Biblioteca.setVisible(false);

        AV600.setVisible(false);
        AV600.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV600, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        AV700.setVisible(false);
        AV700.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV700, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        LV300.setVisible(false);
        LV300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV300, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        Alamos.setVisible(false);
        Alamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Alamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        LV1100.setVisible(false);
        LV1100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV1100, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        CanchaTennis.setVisible(false);
        CanchaTennis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(CanchaTennis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        Civil.setVisible(false);
        Civil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        RegistroEscolar.setVisible(false);
        RegistroEscolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(RegistroEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        AV1600.setVisible(false);
        AV1600.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1600, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        LV800.setVisible(false);
        LV800.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV800, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        LV700.setVisible(false);
        LV700.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(LV700, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        AV1100.setVisible(false);
        AV1100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1100, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        AV1200.setVisible(false);
        AV1200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1200, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        AV1300.setVisible(false);
        AV1300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1300, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        Enfermeria.setVisible(false);
        Enfermeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Enfermeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        Tutorias.setVisible(false);
        Tutorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Tutorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        Label_LogoITSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1)_1.png"))); // NOI18N
        jPanel1.add(Label_LogoITSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 80));

        AV1700.setVisible(false);
        AV1700.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AV1700, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        Cultura.setVisible(false);
        Cultura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Cultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        Movilidad.setVisible(false);
        Movilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(Movilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        CasaClub.setVisible(false);
        CasaClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(CasaClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        AulaMagna.setVisible(false);
        AulaMagna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5860579.png"))); // NOI18N
        jPanel1.add(AulaMagna, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        Label_Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/croquis-nainari.jpg"))); // NOI18N
        jPanel1.add(Label_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 450));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 850, 10));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Boton_PuntosDeInteres.setBackground(new java.awt.Color(231, 231, 231));
        Boton_PuntosDeInteres.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); 
        Boton_PuntosDeInteres.setForeground(new java.awt.Color(25, 111, 196));
        Boton_PuntosDeInteres.setText("Puntos interés");

        Boton_PuntosDeInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_PuntosDeInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PuntosDeInteresActionPerformed(evt);
            }
        });
        Boton_PuntosDeInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        txtBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        txtBusqueda.setText("Búsqueda...");
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        Boton_Ajustes1.setBackground(new java.awt.Color(204, 204, 204));
        Boton_Ajustes1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 

        Boton_Ajustes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opcion.png"))); // NOI18N
        Boton_Ajustes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Boton_Ajustes1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Boton_Ajustes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opcion.png"))); // NOI18N
        Boton_Ajustes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Ajustes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Ajustes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Boton_PuntosDeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton_Ajustes1)
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Boton_Ajustes1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
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

    
    
    private void Boton_Ajustes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Ajustes1ActionPerformed
        // TODO add your handling code here:
        frmAjustes control = new frmAjustes();
        control.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_Ajustes1ActionPerformed

    private void Boton_PuntosDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PuntosDeInteresActionPerformed
        Biblioteca.setVisible(true);
        PasilloEstudiantil.setVisible(true);
        Kiawa.setVisible(true);
        CISCO.setVisible(true);
        Alamos.setVisible(true);
        RegistroEscolar.setVisible(true);
        
    }//GEN-LAST:event_Boton_PuntosDeInteresActionPerformed

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
    private javax.swing.JLabel AV1000;
    private javax.swing.JLabel AV1100;
    private javax.swing.JLabel AV1200;
    private javax.swing.JLabel AV1300;
    private javax.swing.JLabel AV1400;
    private javax.swing.JLabel AV1500;
    private javax.swing.JLabel AV1600;
    private javax.swing.JLabel AV1700;
    private javax.swing.JLabel AV600;
    private javax.swing.JLabel AV700;
    private javax.swing.JLabel AV800;
    private javax.swing.JLabel Alamos;
    private javax.swing.JLabel AlbercaOlimpica;
    private javax.swing.JLabel AudioVisual;
    private javax.swing.JLabel AulaMagna;
    private javax.swing.JLabel Biblioteca;
    private javax.swing.JButton Boton_Ajustes1;
    private javax.swing.JButton Boton_PuntosDeInteres;
    private javax.swing.JLabel CAD;
    private javax.swing.JLabel CISCO;
    private javax.swing.JLabel CanchaTennis;
    private javax.swing.JLabel CasaClub;
    private javax.swing.JLabel CentroIdiomas;
    private javax.swing.JLabel Civil;
    private javax.swing.JLabel Cultura;
    private javax.swing.JLabel Enfermeria;
    private javax.swing.JLabel Kiawa;
    private javax.swing.JLabel LV1100;
    private javax.swing.JLabel LV1500;
    private javax.swing.JLabel LV1800;
    private javax.swing.JLabel LV300;
    private javax.swing.JLabel LV500;
    private javax.swing.JLabel LV700;
    private javax.swing.JLabel LV800;
    private javax.swing.JLabel Label_LogoITSON;
    private javax.swing.JLabel Label_Mapa;
    private javax.swing.JLabel Movilidad;
    private javax.swing.JLabel PasilloEstudiantil;
    private javax.swing.JLabel PoliDeportivo;
    private javax.swing.JLabel RegistroEscolar;
    private javax.swing.JLabel Resiedencias;
    private javax.swing.JLabel Tutorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
