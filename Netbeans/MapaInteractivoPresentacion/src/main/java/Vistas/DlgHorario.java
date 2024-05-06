package Vistas;

import Controladora.ControlPresentacion;
import POJOs.DatosPOJO;
import POJOs.UsuarioPOJO;
import javax.swing.ImageIcon;

/**
 *
 * @author molin
 */
public class DlgHorario extends javax.swing.JDialog {

    UsuarioPOJO sesion;
    ControlPresentacion control;
    String imagePath;
    String absolutePath;
    ImageIcon icon;

    public DlgHorario(UsuarioPOJO usuario) {
        initComponents();
        this.sesion = usuario;
        control = new ControlPresentacion(usuario);
        System.out.println("---------------------------------------------------------------------------"
                + "\nfrmHorario - Imprimiento tu sesion: " + sesion
                + "\n---------------------------------------------------------------------------");
        this.setVisible(true);
        this.desplegarHorario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        imagenHorario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonRegreso = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Horario");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("HORARIO");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(867, 867, 867)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresoActionPerformed
        // TODO add your handling code here:
        control.deplegarMenu();
        dispose();
    }//GEN-LAST:event_ButtonRegresoActionPerformed
  private void desplegarHorario() {
    String nombre = sesion.getDatos().getNombre();
    switch (nombre) {
        case "Roberto Favela":
            break;
        case "Josue Gomez":
            System.out.println("Desplegando horario de Josue");
            icon = new ImageIcon(getClass().getResource("/imagenes/horarioJosue.png"));
            break;
        case "Adriana Gutierrez":
            icon = new ImageIcon(getClass().getResource("/imagenes/horarioAdriana.png"));
            break;
        default:
            System.out.println("No tienes la sesión iniciada :v.");
            break;
    }

    if (icon != null) {
        imagenHorario.setIcon(icon);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegreso;
    private javax.swing.JLabel imagenHorario;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
