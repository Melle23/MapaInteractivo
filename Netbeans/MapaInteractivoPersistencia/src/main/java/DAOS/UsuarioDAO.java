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

    private final MongoDatabase dataBase;

    public UsuarioDAO() {
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        ConnectionString cadenaConexion = new ConnectionString("mongodb://localhost/27017");

        MongoClientSettings clientsSettings = MongoClientSettings.builder()
                .applyConnectionString(cadenaConexion)
                .codecRegistry(codecRegistry)
                .build();

        MongoClient dbServer = MongoClients.create(clientsSettings);

        this.dataBase = dbServer.getDatabase("mongoBD");
    }

    public UsuarioDTO obtenerUsuario(String usuario) {

        MongoCollection<Document> collection = dataBase.getCollection("Personas");

        Document usuarioDoc = collection.find(Filters.eq("usuario", usuario)).first();

        if (usuarioDoc != null) {
            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setUsuario(usuarioDoc.getString("usuario"));
            usuarioDTO.setContraseña(usuarioDoc.getString("contraseña"));
            return usuarioDTO;
        } else {
            return null;
        }
    }
}
