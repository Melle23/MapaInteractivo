package Vistas;

import Controladora.ControlPresentacion;
import POJOs.UsuarioPOJO;
import Validaciones.ValidacionesLocacion;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author favela
 */
public class DlgEliminarLocacion extends javax.swing.JFrame {

    UsuarioPOJO sesion;
    ControlPresentacion control;
    ValidacionesLocacion vLocacion = new ValidacionesLocacion();

    /**
     * Creates new form DlgEliminarLocacion
     *
     * @param usuario
     */
    public DlgEliminarLocacion(UsuarioPOJO usuario) {
        initComponents();
        this.sesion = usuario;
        control = new ControlPresentacion(sesion);
        this.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminarLocacion = new javax.swing.JButton();
        nombreLocacion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(25, 111, 196));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre de locación:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 280, 30));

        btnEliminarLocacion.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnEliminarLocacion.setText("Eliminar Locación");
        btnEliminarLocacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLocacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLocacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarLocacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 230, 40));
        jPanel2.add(nombreLocacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 270, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1)_2.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarLocacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLocacionActionPerformed
        if(validarCamposTexto(nombreLocacion)){
             String nombre = nombreLocacion.getText();
        vLocacion.eliminarLocacion(nombre);
        nombreLocacion.setText("");
        }else{
       JOptionPane.showMessageDialog(null, "Favor de rellenar todos los campos.");
        }
    }//GEN-LAST:event_btnEliminarLocacionActionPerformed
 public static boolean validarCamposTexto(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        control.desplegarMenuLocaciones();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarLocacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField nombreLocacion;
    // End of variables declaration//GEN-END:variables
}
