package ConexionBD;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author favela,Josue Gomez
 */
/**
 * La clase ConexionBD proporciona métodos para conectar y desconectar a una
 * base de datos MongoDB, así como para obtener colecciones específicas dentro
 * de dicha base de datos.
 */
public class ConexionBD {

    /**
     * Cliente de MongoDB para gestionar la conexión con el servidor de MongoDB.
     */
    private MongoClient mongoClient;

    /**
     * Base de datos de MongoDB.
     */
    public MongoDatabase mongoDatabase;

    /**
     * Constructor que inicializa la conexión con MongoDB utilizando los
     * parámetros especificados en la cadena de conexión y el nombre de la base
     * de datos.
     */
    public ConexionBD() {
        String cadenaConexion = "mongodb+srv://luisfavela246853:4qvAKxlMSD7P7LuP@cluster0.bmevjzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String database = "mongoBD";

        mongoClient = MongoClients.create(cadenaConexion);
        mongoDatabase = mongoClient.getDatabase(database);
    }

    /**
     * Obtiene una colección específica de la base de datos MongoDB.
     *
     * @param nombreColeccion El nombre de la colección que se desea obtener.
     * @return La colección de MongoDB especificada.
     */
    public MongoCollection<Document> obtenerColeccion(String nombreColeccion) {
        return mongoDatabase.getCollection(nombreColeccion);
    }

    /**
     * Cierra la conexión con el servidor de MongoDB.
     */
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    /**
     * Obtiene la base de datos de MongoDB.
     *
     * @return La base de datos de MongoDB.
     */
    public MongoDatabase getDatabase() {
        return mongoDatabase;
    }
}
