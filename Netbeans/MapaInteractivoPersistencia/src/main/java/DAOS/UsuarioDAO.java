package DAOS;

import ConexionBD.ConexionBD;
import Interfaces.UsuariosDAO;
import POJOs.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import POJOs.DatosPOJO;
import com.mongodb.client.model.Projections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @Override
    public List<Map<String, String>> obtenerClases(UsuarioPOJO usuario) {
        List<Map<String, String>> clases = new ArrayList<>();
        List<Map<String, String>> horario = usuario.getHorario();

        if (horario != null) {
            System.out.println("Tamaño de la lista de horarios: " + horario.size()); 
            for (Map<String, String> clase : horario) {
                Map<String, String> claseMap = new HashMap<>();
                claseMap.put("salon", clase.get("salon"));
                claseMap.put("materia", clase.get("materia"));
                claseMap.put("hora_entrada", clase.get("hora_entrada"));
                claseMap.put("hora_salida", clase.get("hora_salida"));
                clases.add(claseMap);
            }
        } else {
            System.out.println("No se encontraron clases en el horario."); 
        }

        System.out.println("Clases:");
        for (Map<String, String> clase : clases) {
            System.out.println(clase);
        }

        return clases;
    }

}
