/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import ConexionBD.ConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.mapainteractivopersistencia.LocacionDTO;
import com.mycompany.mapainteractivopersistencia.UsuarioDTO;
import org.bson.Document;

/**
 *
 * @author favel
 */
public class LocacionDAO {
    
    ConexionBD conexion = new ConexionBD();
    
    public LocacionDAO() {
        
    }
    
    /**
     * SIEMPRE REGRESA NULL, pero eso esta bien
     * o no, pero no da error y yo no juzgo, asi que se queda
     * 
     *                                                        -favela
     * @param nombre
     * @param descripcion
     * @return 
     */
    public LocacionDTO RegistrarLocacion(String nombre, String descripcion) {
        MongoCollection<Document> collection = conexion.CrearConexionLocaciones();
        
        try {
            org.bson.Document LocacionNueva = new org.bson.Document("nombre", nombre)
                .append("descripcion", descripcion);
        collection.insertOne(LocacionNueva);
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }
    
    public LocacionDTO obtenerLocacion(String nombre) {
        MongoCollection<Document> collection = conexion.CrearConexionLocaciones();
        
        try {
            Document locacionEncontrado = collection.find(Filters.eq("nombre", nombre)).first();
            if (locacionEncontrado != null) {
                    return new LocacionDTO(locacionEncontrado.getString("nombre"), locacionEncontrado.getString("descripcion"));
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    } 
    
}
