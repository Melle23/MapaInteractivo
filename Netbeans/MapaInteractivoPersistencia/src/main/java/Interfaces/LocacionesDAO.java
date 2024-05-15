/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import POJOs.LocacionPOJO;
import java.util.List;

/**
 *
 * @author Josue
 */
public interface LocacionesDAO {

    /**
     * Registra una locación en la base de datos MongoDB.
     * 
     * @param nombre El nombre de la locación.
     * @param descripcion La descripción de la locación.
     * @param x La coordenada X de la locación.
     * @param y La coordenada Y de la locación.
     * @return La locación registrada como un objeto LocacionPOJO.
     */
    public LocacionPOJO RegistrarLocacion(String nombre, String descripcion,int x, int y);

    /**
     * Elimina una locación de la colección de locaciones y la imagen asociada en GridFS.
     * 
     * @param nombre El nombre de la locación que se desea eliminar.
     */
    public void eliminarLocacion(String nombre);
  /**
     * Obtiene una locación de la colección de locaciones.
     * 
     * @param nombre El nombre de la locación que se desea obtener.
     * @return La locación obtenida como un objeto LocacionPOJO, o null si no se encontró.
     */
    public LocacionPOJO obtenerLocacion(String nombre);

    /**
     * Obtiene la imagen asociada a una locación desde GridFS.
     * 
     * @param nombre El nombre de la locación de la cual se desea obtener la imagen.
     * @return Los bytes de la imagen como un array de bytes, o null si no se encontró la imagen.
     */
    public byte[] obtenerImagenLocacion(String nombre);

    /**
     * Obtiene una lista de nombres de todas las locaciones en la base de datos.
     * 
     * @return Una lista de nombres de locaciones.
     */
    public List<String> obtenerNombresLocaciones();
 
    /**
     * Edita una locación en la base de datos MongoDB.
     * 
     * @param nombreAnterior El nombre original de la locación.
     * @param nuevoNombre El nuevo nombre de la locación.
     * @param nuevaDescripcion La nueva descripción de la locación.
     */
    public void editarLocacion(String nombreAnterior, String nuevoNombre, String nuevaDescripcion);
}
