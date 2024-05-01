/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> collection;
    
    public MongoCollection<Document> CrearConexionUsuarios() {
        String cadenaConexion = "mongodb+srv://luisfavela246853:4qvAKxlMSD7P7LuP@cluster0.bmevjzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String database = "mongoBD";
        String coleccion = "Personas";

        mongoClient = MongoClients.create(cadenaConexion);
        mongoDatabase = mongoClient.getDatabase(database);
        collection = mongoDatabase.getCollection(coleccion);
        
        return collection;
    }
    
    public MongoCollection<Document> CrearConexionLocaciones() {
        String cadenaConexion = "mongodb+srv://luisfavela246853:4qvAKxlMSD7P7LuP@cluster0.bmevjzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String database = "mongoBD";
        String coleccion = "Locaciones";

        mongoClient = MongoClients.create(cadenaConexion);
        mongoDatabase = mongoClient.getDatabase(database);
        collection = mongoDatabase.getCollection(coleccion);
        
        return collection;
    }
    
    // Método para cerrar la conexión
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
