package Interfaces;

import POJOs.HorarioPOJO;
import POJOs.UsuarioPOJO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface UsuariosDAO {
     /**
     * Obtiene un usuario de la base de datos dado su nombre de usuario y
     * contraseña.
     *
     * @param usuario El nombre de usuario.
     * @param contra La contraseña del usuario.
     * @return Un objeto UsuarioPOJO si el usuario y la contraseña coinciden, de
     * lo contrario, null.
     */
    public UsuarioPOJO obtenerUsuario(String usuario, String contra);
     
      /**
     * Obtiene la lista de clases (horarios) de un usuario.
     * 
     * @param usuario El usuario del cual se quieren obtener las clases.
     * @return Una lista de objetos HorarioPOJO correspondientes a las clases del usuario.
     */
    public List<HorarioPOJO> obtenerClases(UsuarioPOJO usuario);
}
