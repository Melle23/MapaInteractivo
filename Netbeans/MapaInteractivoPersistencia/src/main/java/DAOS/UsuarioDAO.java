package DAOS;

import ConexionBD.ConexionBD;
import Interfaces.UsuariosDAO;
import POJOs.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import POJOs.DatosPOJO;
import org.bson.Document;

/**
 *
 * @author josue
 */
public class UsuarioDAO implements UsuariosDAO{

    ConexionBD conexion = new ConexionBD();

    public UsuarioDAO() {
    }

 public UsuarioPOJO obtenerUsuario(String usuario, String contra) {
         conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.obtenerColeccion("Personas");

        try {

            Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario)).projection(new Document("contrasena", 1)).first();

            if (usuarioEncontrado != null) {
                String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");

                if (contraseñaAlmacenada.equals(contra)) {

                    Document datosUsuarioDoc = collection.find(Filters.eq("usuario", usuario))
                            .projection(new Document("datos", 1))
                            .first()
                            .get("datos", Document.class);

                    DatosPOJO datosUsuario = new DatosPOJO(
                            datosUsuarioDoc.getString("nombre"),
                            datosUsuarioDoc.getString("carreraUniversitaria"),
                            datosUsuarioDoc.getInteger("semestre")
                    );

                    return new UsuarioPOJO(usuario, contra, datosUsuario);
                }
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }
}
