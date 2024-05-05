package DAOS;

import ConexionBD.ConexionBD;
import com.mycompany.mapainteractivopersistencia.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.mapainteractivopersistencia.DatosPOJO;
import org.bson.Document;

/**
 *
 * @author molin
 */
public class UsuarioDAO {

    ConexionBD conexion = new ConexionBD();
    
    public UsuarioDAO() {
    }
    
public UsuarioPOJO obtenerUsuario(String usuario, String contra) {
    System.out.println(contra);
    ConexionBD conexion = new ConexionBD();
    MongoCollection<Document> collection = conexion.obtenerColeccion("Personas");

    try {
        Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario)).first();
        System.out.println(usuarioEncontrado);
        if (usuarioEncontrado != null) {
            String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
            if (contraseñaAlmacenada.equals(contra)) {
                // Acceder a la colección anidada "datos"
                Document datosUsuarioDoc = usuarioEncontrado.get("datos", Document.class);
                // Crear un objeto DatosPOJO con los datos de la colección anidada
                DatosPOJO datosUsuario = new DatosPOJO(
                        datosUsuarioDoc.getString("nombre"),
                        datosUsuarioDoc.getString("carreraUniversitaria"),
                        datosUsuarioDoc.getInteger("semestre")
                );
                // Crear y retornar un objeto UsuarioPOJO que contenga tanto el usuario como los datos adicionales
                return new UsuarioPOJO(usuario, contra, datosUsuario);
            }
        }
    } finally {
        conexion.cerrarConexion();
    }
    return null;
}

}
