package ConexionBD;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author favel
 */
public class ConexionBD {
    
    private MongoClient mongoClient;
    public MongoDatabase mongoDatabase;
    
    // Constructor que inicializa la conexión
    public ConexionBD() {
        String cadenaConexion = "mongodb+srv://luisfavela246853:4qvAKxlMSD7P7LuP@cluster0.bmevjzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String database = "mongoBD";

        mongoClient = MongoClients.create(cadenaConexion);
        mongoDatabase = mongoClient.getDatabase(database);
    }
    
    // Método para obtener una colección específica
    public MongoCollection<Document> obtenerColeccion(String nombreColeccion) {
        return mongoDatabase.getCollection(nombreColeccion);
    }
    
    // Método para cerrar la conexión
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
    
    // Método para obtener la base de datos
    public MongoDatabase getDatabase() {
        return mongoDatabase;
    }
}

