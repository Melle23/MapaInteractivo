package POJOs;

import java.util.List;
import java.util.Map;
import org.bson.types.ObjectId;

/**
 *
 * @author Josue Gomez
 */

/**
 * La clase UsuarioPOJO representa la información de un usuario.
 * Incluye el identificador, el nombre de usuario, la contraseña, 
 * el nivel de auditoría, los datos personales y el horario del usuario.
 * Proporciona métodos para acceder y modificar estos datos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     DatosPOJO datos = new DatosPOJO("Juan Pérez", "Ingeniería", 3);
 *     UsuarioPOJO usuario = new UsuarioPOJO("juanp", "password123", true, datos);
 * </pre>
 * </p>
 * 
 * @version 1.0
 * @since 2024-05-15
 * 
 */
public class UsuarioPOJO {

    /**
     * El identificador único del usuario.
     */
    private ObjectId id;

    /**
     * El nombre de usuario.
     */
    private String usuario;

    /**
     * La contraseña del usuario.
     */
    private String contraseña;

    /**
     * El nivel de auditoría del usuario.
     */
    private boolean nivelAuditoria;

    /**
     * Los datos personales del usuario.
     */
    private DatosPOJO datos;

    /**
     * El horario del usuario.
     */
    private List<HorarioPOJO> horario;

    /**
     * Constructor por defecto.
     */
    public UsuarioPOJO() {
    }

    /**
     * Constructor que inicializa un objeto UsuarioPOJO con el nombre de usuario y la contraseña especificados.
     *
     * @param usuario       El nombre de usuario.
     * @param contraseña    La contraseña del usuario.
     */
    public UsuarioPOJO(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Constructor que inicializa un objeto UsuarioPOJO con el nombre de usuario, la contraseña y los datos personales especificados.
     *
     * @param usuario       El nombre de usuario.
     * @param contraseña    La contraseña del usuario.
     * @param datos         Los datos personales del usuario.
     */
    public UsuarioPOJO(String usuario, String contraseña, DatosPOJO datos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.datos = datos;
    }

    /**
     * Constructor que inicializa un objeto UsuarioPOJO con el nombre de usuario, la contraseña, el nivel de auditoría y los datos personales especificados.
     *
     * @param usuario          El nombre de usuario.
     * @param contraseña       La contraseña del usuario.
     * @param nivelAuditoria   El nivel de auditoría del usuario.
     * @param datos            Los datos personales del usuario.
     */
    public UsuarioPOJO(String usuario, String contraseña, boolean nivelAuditoria, DatosPOJO datos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivelAuditoria = nivelAuditoria;
        this.datos = datos;
    }

    /**
     * Constructor que inicializa un objeto UsuarioPOJO con el nombre de usuario, la contraseña, el nivel de auditoría, los datos personales y el horario especificados.
     *
     * @param usuario          El nombre de usuario.
     * @param contraseña       La contraseña del usuario.
     * @param nivelAuditoria   El nivel de auditoría del usuario.
     * @param datos            Los datos personales del usuario.
     * @param horario          El horario del usuario.
     */
    public UsuarioPOJO(String usuario, String contraseña, boolean nivelAuditoria, DatosPOJO datos, List<HorarioPOJO> horario) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivelAuditoria = nivelAuditoria;
        this.datos = datos;
        this.horario = horario;
    }

    /**
     * Obtiene los datos personales del usuario.
     *
     * @return Los datos personales del usuario.
     */
    public DatosPOJO getDatos() {
        return datos;
    }

    /**
     * Establece los datos personales del usuario.
     *
     * @param datos Los nuevos datos personales del usuario.
     */
    public void setDatos(DatosPOJO datos) {
        this.datos = datos;
    }

    /**
     * Obtiene el nivel de auditoría del usuario.
     *
     * @return El nivel de auditoría del usuario.
     */
    public boolean isNivelAuditoria() {
        return nivelAuditoria;
    }

    /**
     * Establece el nivel de auditoría del usuario.
     *
     * @param nivelAuditoria El nuevo nivel de auditoría del usuario.
     */
    public void setNivelAuditoria(boolean nivelAuditoria) {
        this.nivelAuditoria = nivelAuditoria;
    }

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return El identificador único del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del usuario.
     *
     * @param id El nuevo identificador único del usuario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param usuario El nuevo nombre de usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contraseña La nueva contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el horario del usuario.
     *
     * @return El horario del usuario.
     */
    public List<HorarioPOJO> getHorario() {
        return horario;
    }

    /**
     * Establece el horario del usuario.
     *
     * @param horario El nuevo horario del usuario.
     */
    public void setHorario(List<HorarioPOJO> horario) {
        this.horario = horario;
    }
}
