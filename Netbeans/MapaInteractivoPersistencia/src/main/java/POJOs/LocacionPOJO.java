package POJOs;

import org.bson.types.ObjectId;

/**
 *
 * @author favela,Josue Gomez
 */

/**
 * La clase LocacionPOJO representa la información de una locación.
 * Incluye el identificador, el nombre, la descripción y una imagen de la locación.
 * Proporciona métodos para acceder y modificar estos datos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     LocacionPOJO locacion = new LocacionPOJO("Biblioteca", "Biblioteca principal");
 *     locacion.setImagen(imageBytes);
 * </pre>
 * </p>
 */
public class LocacionPOJO {

    /**
     * El identificador único de la locación.
     */
    private ObjectId id;

    /**
     * El nombre de la locación.
     */
    private String nombre;

    /**
     * La descripción de la locación.
     */
    private String descripcion;

    /**
     * La imagen de la locación.
     */
    private byte[] imagen;

    /**
     * Constructor por defecto.
     */
    public LocacionPOJO() {
    }

    /**
     * Constructor que inicializa un objeto LocacionPOJO con el nombre y la descripción especificados.
     *
     * @param nombre        El nombre de la locación.
     * @param descripcion   La descripción de la locación.
     */
    public LocacionPOJO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Constructor que inicializa un objeto LocacionPOJO con el nombre, la descripción y la imagen especificados.
     *
     * @param nombre        El nombre de la locación.
     * @param descripcion   La descripción de la locación.
     * @param imagen        La imagen de la locación.
     */
    public LocacionPOJO(String nombre, String descripcion, byte[] imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Obtiene la imagen de la locación.
     *
     * @return La imagen de la locación.
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen de la locación.
     *
     * @param imagen La nueva imagen de la locación.
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el identificador único de la locación.
     *
     * @return El identificador único de la locación.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único de la locación.
     *
     * @param id El nuevo identificador único de la locación.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la locación.
     *
     * @return El nombre de la locación.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la locación.
     *
     * @param nombre El nuevo nombre de la locación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la locación.
     *
     * @return La descripción de la locación.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la locación.
     *
     * @param descripcion La nueva descripción de la locación.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
