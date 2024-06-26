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
public class DlgEditarLocacion extends javax.swing.JFrame {

    UsuarioPOJO sesion;
    ControlPresentacion control;
    ValidacionesLocacion vl = new ValidacionesLocacion();

    /**
     * Creates new form DlgEditarLocacion
     *
     * @param usuario
     */
    public DlgEditarLocacion(UsuarioPOJO usuario) {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreLocacionAnterior = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionLocacion = new javax.swing.JTextArea();
        btnEditarLocacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombreLocacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel2.setBackground(new java.awt.Color(25, 111, 196));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Descripción de locación:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 280, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre de locación anterior:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 30));

        nombreLocacionAnterior.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jPanel2.add(nombreLocacionAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 320, -1));

        descripcionLocacion.setColumns(20);
        descripcionLocacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcionLocacion.setRows(5);
        jScrollPane1.setViewportView(descripcionLocacion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 320, 170));

        btnEditarLocacion.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnEditarLocacion.setText("Editar Locación");
        btnEditarLocacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarLocacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLocacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarLocacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 230, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nombre de locación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 280, 30));

        nombreLocacion.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jPanel2.add(nombreLocacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        control.desplegarMenuLocaciones();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static boolean validarCamposTexto(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    private void btnEditarLocacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLocacionActionPerformed
       String nombreAnterior = nombreLocacionAnterior.getText();
    String nombreNuevo = nombreLocacion.getText();
    String descripcionNueva = descripcionLocacion.getText();

    if (validarCamposTexto(nombreLocacionAnterior, nombreLocacion)) {
        
     
        if (descripcionNueva.isEmpty()) {
            int opcion = JOptionPane.showConfirmDialog(null, "La descripción está vacía. ¿Desea editar la locación sin descripción?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                return; 
            }
        }

     
        vl.editarLocacion(nombreAnterior, nombreNuevo, descripcionNueva);
        JOptionPane.showMessageDialog(null, "Se ha editado la ubicación con éxito.");
        dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
    }
    }//GEN-LAST:event_btnEditarLocacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarLocacion;
    private javax.swing.JTextArea descripcionLocacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField nombreLocacion;
    private javax.swing.JTextField nombreLocacionAnterior;
    // End of variables declaration//GEN-END:variables
}
