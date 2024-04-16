package Vistas;

/**
 *
 * @author RAUL EDUARDO GOMEZ
 */
public class DlgInicioSesion extends javax.swing.JDialog {

    /**
     * Creates new form InicioSesion
     * @param parent
     * @param modal
     */
    public DlgInicioSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgInicioSesion() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ButtonRegreso = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar sesión");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonRegreso.setBackground(new java.awt.Color(47, 109, 202));
        ButtonRegreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonRegreso.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegreso.setBorder(null);
        ButtonRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 102, 204));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        txtContraseña.setText("jPasswordField1");
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 190, 30));

        btnRegreso.setBackground(new java.awt.Color(0, 102, 204));
        btnRegreso.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegreso.setForeground(new java.awt.Color(255, 255, 255));
        btnRegreso.setText("Volver");
        btnRegreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("USUARIO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("CONTRASEÑA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\molin\\OneDrive\\Documentos\\MapaInteractivoNuevo\\MapaInteractivo\\Netbeans\\MapaInteractivoPresentacion\\src\\main\\java\\Utilerias\\logoPotrosInicio.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresoActionPerformed

        frmAjustes ajustes = new frmAjustes();
        ajustes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonRegresoActionPerformed

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        // TODO add your handling code here:
        frmPrincipal control = new frmPrincipal();
        control.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegreso;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
