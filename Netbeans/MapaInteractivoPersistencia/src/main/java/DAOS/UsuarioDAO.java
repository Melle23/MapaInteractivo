package DAOS;

import ConexionBD.ConexionBD;
import com.mycompany.mapainteractivopersistencia.UsuarioDTO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author molin
 */
public class UsuarioDAO {

    ConexionBD conexion = new ConexionBD();
    
    public UsuarioDAO() {
    }
    
    public UsuarioDTO obtenerUsuario(String usuario, String contra) {
        // Crear una instancia de la clase ConexionBD
        ConexionBD conexion = new ConexionBD();
        // Obtener la colección
        MongoCollection<Document> collection = conexion.CrearConexion();
        
        try {
            // Buscar el usuario en la colección
            Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario)).first();
            if (usuarioEncontrado != null) {
                // Obtener la contraseña almacenada
                String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
                // Verificar si las contraseñas coinciden
                if (contraseñaAlmacenada.equals(contra)) {
                    // Cerrar la conexión
                    conexion.cerrarConexion();
                    // Retornar un nuevo UsuarioDTO con los datos encontrados
                    return new UsuarioDTO(usuarioEncontrado.getString("nombre"), usuarioEncontrado.getString("contrasena"));
                }
            }
        } finally {
            // Asegurarse de cerrar la conexión incluso si ocurre una excepción
            conexion.cerrarConexion();
        }
        
        // Si no se encuentra el usuario o las contraseñas no coinciden, retornar null
        return null;
    }
}
