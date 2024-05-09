package Vistas;

import Controladora.ControlPresentacion;
import Validaciones.ValidacionesUsuario;
import POJOs.UsuarioPOJO;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author JOSUE GOMEZ
 */
public class DlgInicioSesion extends javax.swing.JDialog {

    ControlPresentacion control;
    ValidacionesUsuario vUsuario = new ValidacionesUsuario();
    UsuarioPOJO sesion = new UsuarioPOJO();

    public DlgInicioSesion() {
        initComponents();
        this.setVisible(true);
        this.transparenciaBoton();
        this.configurarCamposTexto();
       control = new ControlPresentacion(sesion);
    }
public void configurarCamposTexto() {
    // Configuración del campo de contraseña
    txtContrasena.setEchoChar((char) 0); // Para que el texto se muestre normalmente
    txtContrasena.setText("Ingrese su contraseña");
    txtContrasena.setForeground(Color.GRAY);
    txtContrasena.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (String.valueOf(txtContrasena.getPassword()).equals("Ingrese su contraseña")) {
                txtContrasena.setText("");
                txtContrasena.setForeground(Color.BLACK);
                txtContrasena.setEchoChar('*'); 
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                txtContrasena.setEchoChar((char) 0);
                txtContrasena.setForeground(Color.GRAY);
                txtContrasena.setText("Ingrese su contraseña");
            }
        }
    });

    // Configuración del campo de usuario
    txtUsuario.setText("Ingrese su ID...");
    txtUsuario.setForeground(Color.GRAY);
    txtUsuario.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (txtUsuario.getText().equals("Ingrese su ID...")) {
                txtUsuario.setText("");
                txtUsuario.setForeground(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (txtUsuario.getText().isEmpty()) {
                txtUsuario.setText("Ingrese su ID...");
                txtUsuario.setForeground(Color.GRAY);
            }
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
        btnRegreso = new javax.swing.JButton();
        btnMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSinConexin = new javax.swing.JButton();
        btnIniciarSesion2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar sesión");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegreso.setBackground(new java.awt.Color(0, 51, 102));
        btnRegreso.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegreso.setForeground(new java.awt.Color(255, 255, 255));
        btnRegreso.setText("Salir");
        btnRegreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 30));

        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_ITSON (1).png"))); // NOI18N
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 880, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSinConexin.setBackground(new java.awt.Color(0, 51, 102));
        btnSinConexin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSinConexin.setForeground(new java.awt.Color(255, 255, 255));
        btnSinConexin.setText("Ver mapa sin conexion");
        btnSinConexin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSinConexin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinConexinActionPerformed(evt);
            }
        });
        jPanel2.add(btnSinConexin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnIniciarSesion2.setBackground(new java.awt.Color(0, 51, 102));
        btnIniciarSesion2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnIniciarSesion2.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion2.setText("INICIAR SESIÓN");
        btnIniciarSesion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 30));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su id...");
        txtUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cisco.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 880, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        String[] botones = {"Si", "No"};

        int variable = JOptionPane.showOptionDialog(null, "¿Desea cerrar la aplicacion?",
                "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null/*icono*/, botones, botones[0]);

        if (variable == 0) {
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnRegresoActionPerformed

    private void btnSinConexinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinConexinActionPerformed
        dispose();
        sesion = null;
        control = new ControlPresentacion(sesion);
        control.desplegarMapa();
    }//GEN-LAST:event_btnSinConexinActionPerformed

    private void btnIniciarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion2ActionPerformed
        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor de ingresar un Usuario y Contraseña.",
                    "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String usuario = txtUsuario.getText();
        String contra = txtContrasena.getText();
        System.out.println(usuario + " - " + contra);
        sesion = vUsuario.verificarUsuario(usuario, contra);
        System.out.println("\n---------------------------------------------------------------------------"
                + "DlgInicioSesion - Imprimiento tu sesion: " + sesion
                + "\n---------------------------------------------------------------------------");
        if (sesion != null) {

            control = new ControlPresentacion(sesion);
            control.desplegarMapa();
             this.dispose();
        }
    }//GEN-LAST:event_btnIniciarSesion2ActionPerformed

    public void transparenciaBoton() {
        btnSinConexin.setOpaque(false);
        btnSinConexin.setContentAreaFilled(false);
        btnSinConexin.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion2;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JButton btnSinConexin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
