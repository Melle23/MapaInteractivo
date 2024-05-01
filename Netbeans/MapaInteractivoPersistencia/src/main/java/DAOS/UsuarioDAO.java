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
        
        ConexionBD conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.CrearConexionUsuarios();
        
        try {
            Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario)).first();
            if (usuarioEncontrado != null) {
                String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
                if (contraseñaAlmacenada.equals(contra)) {
                    conexion.cerrarConexion();
                    return new UsuarioDTO(usuarioEncontrado.getString("nombre"), usuarioEncontrado.getString("contrasena"));
                }
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }
}
