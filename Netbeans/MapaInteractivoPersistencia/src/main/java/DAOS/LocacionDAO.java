package DAOS;

import ConexionBD.ConexionBD;
import Interfaces.LocacionesDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import POJOs.LocacionPOJO;
import org.bson.Document;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.gridfs.model.GridFSUploadOptions;
import com.mongodb.client.model.Updates;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author favela, Josue Gomez
 */
/**
 * La clase LocacionDAO proporciona métodos para interactuar con la colección de
 * locaciones en la base de datos MongoDB, incluyendo el registro, eliminación,
 * edición y obtención de locaciones y sus imágenes asociadas.
 */
public class LocacionDAO implements LocacionesDAO{

    ConexionBD conexion = new ConexionBD();
    MongoCollection<Document> collection = conexion.obtenerColeccion("Locaciones");
    GridFSBucket gridFSBucket = GridFSBuckets.create(conexion.mongoDatabase, "imagenes");

    /**
     * Registra una locación en la base de datos MongoDB.
     * 
     * @param nombre El nombre de la locación.
     * @param descripcion La descripción de la locación.
     * @param x La coordenada X de la locación.
     * @param y La coordenada Y de la locación.
     * @return La locación registrada como un objeto LocacionPOJO.
     */
    @Override
    public LocacionPOJO RegistrarLocacion(String nombre, String descripcion, int x, int y) {
        conexion = new ConexionBD();
        try {
            Document locacionNueva = new Document("nombre", nombre)
                    .append("descripcion", descripcion).append("posicionX", x)
                    .append("posicionY", y);
            collection.insertOne(locacionNueva);
              LocacionPOJO l = new LocacionPOJO(nombre,descripcion,x,y);
            return l;
        } finally {
          
            conexion.cerrarConexion();
        }
    }

    /**
     * Elimina una locación de la colección de locaciones y la imagen asociada en GridFS.
     * 
     * @param nombre El nombre de la locación que se desea eliminar.
     */
    @Override
    public void eliminarLocacion(String nombre) {
        conexion = new ConexionBD();
        try {
            collection.deleteOne(Filters.eq("nombre", nombre));

            GridFSFile gridFSFile = gridFSBucket.find(Filters.eq("filename", nombre + ".jpg")).first();
            if (gridFSFile != null) {
                gridFSBucket.delete(gridFSFile.getObjectId());
            }
        } finally {
            conexion.cerrarConexion();
        }
    }

    /**
     * Obtiene una locación de la colección de locaciones.
     * 
     * @param nombre El nombre de la locación que se desea obtener.
     * @return La locación obtenida como un objeto LocacionPOJO, o null si no se encontró.
     */
    @Override
    public LocacionPOJO obtenerLocacion(String nombre) {
        conexion = new ConexionBD();
        try {
            Document locacionEncontrada = collection.find(Filters.eq("nombre", nombre)).first();
            if (locacionEncontrada != null) {
                return new LocacionPOJO(locacionEncontrada.getString("nombre"), locacionEncontrada.getString("descripcion"));
            }
        } finally {
            conexion.cerrarConexion();
        }
        return null;
    }

    /**
     * Obtiene la imagen asociada a una locación desde GridFS.
     * 
     * @param nombre El nombre de la locación de la cual se desea obtener la imagen.
     * @return Los bytes de la imagen como un array de bytes, o null si no se encontró la imagen.
     */
    @Override
    public byte[] obtenerImagenLocacion(String nombre) {
        conexion = new ConexionBD();
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

    /**
     * Obtiene una lista de nombres de todas las locaciones en la base de datos.
     * 
     * @return Una lista de nombres de locaciones.
     */
    @Override
    public List<String> obtenerNombresLocaciones() {
        conexion = new ConexionBD();
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

    /**
     * Edita una locación en la base de datos MongoDB.
     * 
     * @param nombreAnterior El nombre original de la locación.
     * @param nuevoNombre El nuevo nombre de la locación.
     * @param nuevaDescripcion La nueva descripción de la locación.
     */
    @Override
    public void editarLocacion(String nombreAnterior, String nuevoNombre, String nuevaDescripcion) {
        conexion = new ConexionBD();
        try {
            collection.updateOne(
                    Filters.eq("nombre", nombreAnterior),
                    Updates.combine(
                            Updates.set("nombre", nuevoNombre),
                            Updates.set("descripcion", nuevaDescripcion)
                    )
            );

            GridFSFile gridFSFile = gridFSBucket.find(Filters.eq("filename", nombreAnterior + ".jpg")).first();
            if (gridFSFile != null) {
                Document newMetadata = new Document("filename", nuevoNombre + ".jpg");
                gridFSBucket.rename(gridFSFile.getObjectId(), nuevoNombre + ".jpg");
            }
        } finally {
            conexion.cerrarConexion();
        }
    }
    
      public List<JLabel> obtenerLocacionesComoJLabels() {
        List<JLabel> locacionesJLabels = new ArrayList<>();
        conexion = new ConexionBD();
        try {
            MongoCursor<Document> cursor = collection.find(Filters.and(Filters.ne("posicionX", 0), Filters.ne("posicionY", 0))).iterator();
            while (cursor.hasNext()) {
                Document locacionDoc = cursor.next();
                int x = locacionDoc.getInteger("posicionX");
                int y = locacionDoc.getInteger("posicionY");
                String nombre = locacionDoc.getString("nombre");
                JLabel labelLocacion = new JLabel();
                labelLocacion.setBounds(x, y, 100, 100); // Puedes ajustar el tamaño según sea necesario
                labelLocacion.setName(nombre);
                locacionesJLabels.add(labelLocacion);
            }
        } finally {
            conexion.cerrarConexion();
        }
        return locacionesJLabels;
    }
      
    public void guardarImagenLocacion(String nombre, File file) {
        conexion = new ConexionBD();
        try (InputStream streamToUploadFrom = new FileInputStream(file)) {
            GridFSUploadOptions options = new GridFSUploadOptions()
                    .chunkSizeBytes(1024)
                    .metadata(new Document("type", "image")
                    .append("content_type", "image/jpeg"));

            gridFSBucket.uploadFromStream(nombre + ".jpg", streamToUploadFrom, options);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }
}
