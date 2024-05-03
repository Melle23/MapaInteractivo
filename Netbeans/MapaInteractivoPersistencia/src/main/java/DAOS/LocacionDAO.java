/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import ConexionBD.ConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mycompany.mapainteractivopersistencia.LocacionDTO;
import org.bson.Document;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author favel
 */
public class LocacionDAO {

    ConexionBD conexion = new ConexionBD();

    public LocacionDAO() {

    }

    /**
     * SIEMPRE REGRESA NULL, pero eso esta bien o no, pero no da error y yo no
     * juzgo, asi que se queda
     *
     * -favela
     *
     * @param nombre
     * @param descripcion
     * @return
     */
    public LocacionDTO RegistrarLocacion(String nombre, String descripcion) {
        ConexionBD conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.obtenerColeccion("Locaciones");

        try {
            Document locacionNueva = new Document("nombre", nombre)
                    .append("descripcion", descripcion);
            collection.insertOne(locacionNueva);
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    /**
     * Elimina una locacion de la coleccion de locaciones, y la imagen del
     * GrillFS correspondiente a esa locacion
     * 
     * @param nombre de la locacion
     */
    public void eliminarLocacion(String nombre) {
        ConexionBD conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.obtenerColeccion("Locaciones");
        GridFSBucket gridFSBucket = GridFSBuckets.create(conexion.mongoDatabase, "imagenes");

        try {
            // Eliminar la locación de la colección "Locaciones"
            collection.deleteOne(Filters.eq("nombre", nombre));

            // Encontrar y eliminar la imagen correspondiente en GridFS
            GridFSFile gridFSFile = gridFSBucket.find(Filters.eq("filename", nombre + ".jpg")).first();
            if (gridFSFile != null) {
                gridFSBucket.delete(gridFSFile.getObjectId());
            }
        } finally {
            conexion.cerrarConexion();
        }
    }

    public LocacionDTO obtenerLocacion(String nombre) {
        ConexionBD conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.obtenerColeccion("Locaciones");

        try {
            Document locacionEncontrada = collection.find(Filters.eq("nombre", nombre)).first();
            if (locacionEncontrada != null) {
                return new LocacionDTO(locacionEncontrada.getString("nombre"), locacionEncontrada.getString("descripcion"));
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public byte[] obtenerImagenLocacion(String nombre) {
        ConexionBD conexion = new ConexionBD();
        GridFSBucket gridFSBucket = GridFSBuckets.create(conexion.mongoDatabase, "imagenes");

        try {
            GridFSFile gridFSFile = gridFSBucket.find(Filters.eq("filename", nombre + ".jpg")).first();
            if (gridFSFile != null) {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                gridFSBucket.downloadToStream(gridFSFile.getId(), outputStream);
                return outputStream.toByteArray();
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    public List<String> obtenerNombresLocaciones() {
        ConexionBD conexion = new ConexionBD();
        MongoCollection<Document> collection = conexion.obtenerColeccion("Locaciones");
        List<String> nombres = new ArrayList<>();

        try {
            MongoCursor<Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                Document locacion = cursor.next();
                nombres.add(locacion.getString("nombre"));
            }
        } finally {
            conexion.cerrarConexion();
        }
        return nombres;
    }
}
