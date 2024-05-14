package DAOS;

import ConexionBD.ConexionBD;
import Interfaces.UsuariosDAO;
import POJOs.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import POJOs.DatosPOJO;
import POJOs.HorarioPOJO;
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
    public class UsuarioDAO implements UsuariosDAO {

        ConexionBD conexion;
 private List<HorarioPOJO> listaHorarios;
        public UsuarioDAO() {
        }

        @Override
       public UsuarioPOJO obtenerUsuario(String usuario, String contra) {
    conexion = new ConexionBD();
    MongoCollection<Document> collection = conexion.obtenerColeccion("Personas");

    try {
        Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario))
                .projection(Projections.fields(
                        Projections.include("contrasena", "nivelAuditoria", "datos", "horario"), // Asegúrate de que el nombre del campo sea correcto
                        Projections.excludeId()))
                .first();

        if (usuarioEncontrado != null) {
            String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
            boolean nivelAuditoria = usuarioEncontrado.getBoolean("nivelAuditoria", false);
            if (contraseñaAlmacenada.equals(contra)) {
                Document datosUsuarioDoc = usuarioEncontrado.get("datos", Document.class);

                DatosPOJO datosUsuario = new DatosPOJO(
                        datosUsuarioDoc.getString("nombre"),
                        datosUsuarioDoc.getString("carreraUniversitaria"),
                        datosUsuarioDoc.getInteger("semestre")
                );

                List<HorarioPOJO> horarios = new ArrayList<>();
                List<Document> horariosDocs = usuarioEncontrado.getList("horario", Document.class);
                if (horariosDocs != null) {
                    for (Document horarioDoc : horariosDocs) {
                        HorarioPOJO horario = new HorarioPOJO(
                                horarioDoc.getString("salon"),
                                  horarioDoc.getString("materia"),
                                horarioDoc.getString("hora_entrada"),
                                horarioDoc.getString("hora_salida")
                               
                        );
                        horarios.add(horario);
                        System.out.println("...................................");
                        System.out.println(horarios);
                        System.out.println("...................................");
                    }
                }

                UsuarioPOJO usuarioPOJO = new UsuarioPOJO(usuario, contra, nivelAuditoria, datosUsuario);
                usuarioPOJO.setHorario(horarios);
                this.listaHorarios = horarios; 
                return usuarioPOJO;
            }
        }
    } finally {
        conexion.cerrarConexion();
    }
    return null;
}

        @Override
       public List<HorarioPOJO> obtenerClases(UsuarioPOJO usuario) {
          return listaHorarios; 

    }

    }
