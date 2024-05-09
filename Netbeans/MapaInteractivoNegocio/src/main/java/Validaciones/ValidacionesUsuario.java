package Validaciones;

import DAOS.UsuarioDAO;
import Interfaces.ValidacionesUsuarios;
import POJOs.UsuarioPOJO;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE GOMEZ
 */
public class ValidacionesUsuario implements ValidacionesUsuarios {

    UsuarioDAO uDAO = new UsuarioDAO();

    public ValidacionesUsuario() {
    }

    @Override
    public UsuarioPOJO verificarUsuario(String usuario, String contra) {
        if (uDAO.obtenerUsuario(usuario, contra) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el usuario, vuelva a intentarlo.");
            return null;
        } else {
            return uDAO.obtenerUsuario(usuario, contra);
        }
    }

}
