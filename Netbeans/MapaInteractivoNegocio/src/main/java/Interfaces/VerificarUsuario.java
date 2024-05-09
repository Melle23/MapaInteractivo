package Interfaces;

import POJOs.DatosPOJO;
import POJOs.UsuarioPOJO;

/**
 *
 * @author JOSUE GOMEZ
 */
public interface VerificarUsuario {

    public UsuarioPOJO verificarUsuario(String usuario, String contra);
}
