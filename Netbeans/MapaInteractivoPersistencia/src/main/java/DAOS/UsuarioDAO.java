package DAOS;

import com.mycompany.mapainteractivopersistencia.UsuarioDTO;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author molin
 */
public class UsuarioDAO {

    private MongoCollection<Document> collection;

    public UsuarioDAO() {
    }
    
    public void CrearConexion() {
        String cadenaConexion = "mongodb+srv://luisfavela246853:4qvAKxlMSD7P7LuP@cluster0.bmevjzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String database = "mongoBD";
        String coleccion = "Personas";

        com.mongodb.client.MongoClient mongoClient = MongoClients.create(cadenaConexion);
        MongoDatabase mongoDataBase = mongoClient.getDatabase(database);
        this.collection = mongoDataBase.getCollection(coleccion);
    }

    public UsuarioDTO obtenerUsuario(String usuario, String contra) {
        
        this.CrearConexion();
        org.bson.Document documento=new org.bson.Document("usuario", "insertado").append("contrasena", "funciona");
        collection.insertOne(documento);
        
        Document usuarioEncontrado = collection.find(Filters.eq("usuario", usuario)).first();
        System.out.println(usuarioEncontrado);
        
        if (usuarioEncontrado != null) {
            String contraseñaAlmacenada = usuarioEncontrado.getString("contrasena");
            if (contraseñaAlmacenada.equals(contra)) {
                System.out.println(usuarioEncontrado.getString("usuario"));
                System.out.println(usuarioEncontrado.getString("contrasena"));
                return new UsuarioDTO(usuarioEncontrado.getString("nombre"), usuarioEncontrado.getString("contrasena"));
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
