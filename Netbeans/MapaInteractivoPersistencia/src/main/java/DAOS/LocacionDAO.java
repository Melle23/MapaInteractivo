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
    
    public LocacionDTO obtenerLocacion(String nombre) {
        
        ConexionBD conexion = new ConexionBD();
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
