package DAOS;

import ConexionBD.ConexionBD;
import Interfaces.UsuariosDAO;
import POJOs.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import POJOs.DatosPOJO;
import com.mongodb.client.model.Projections;
import org.bson.Document;

/**
 *
 * @author josue
 */
public class UsuarioDAO implements UsuariosDAO{

    ConexionBD conexion = new ConexionBD();

    public UsuarioDAO() {
    }

    @Override
   public UsuarioPOJO obtenerUsuario(String usuario, String contra) {
    ConexionBD conexion = new ConexionBD();
    MongoCollection<Document> collection = conexion.obtenerColeccion("Personas");

    try {
        Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario))
                                                .projection(Projections.fields(
                                                        Projections.include("contrasena", "nivelAuditoria", "datos"),
                                                        Projections.excludeId()))
                                                .first();

        if (usuarioEncontrado != null) {
            String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
            boolean nivelAuditoria = usuarioEncontrado.getBoolean("nivelAuditoria", false); // Establecer un valor por defecto si nivelAuditoria es null
            if (contraseñaAlmacenada.equals(contra)) {
                Document datosUsuarioDoc = usuarioEncontrado.get("datos", Document.class);

                DatosPOJO datosUsuario = new DatosPOJO(
                        datosUsuarioDoc.getString("nombre"),
                        datosUsuarioDoc.getString("carreraUniversitaria"),
                        datosUsuarioDoc.getInteger("semestre")
                );

                return new UsuarioPOJO(usuario, contra, nivelAuditoria, datosUsuario);
            }
        }
    } finally {
        conexion.cerrarConexion();
    }
    return null;
}


}
