package Interfaces;

import POJOs.UsuarioPOJO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface UsuariosDAO {
    
    public UsuarioPOJO obtenerUsuario(String usuario, String contra);
     
    public List<Map<String, String>> obtenerClases(UsuarioPOJO usuario);
}
