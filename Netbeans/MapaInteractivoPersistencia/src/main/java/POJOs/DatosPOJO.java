package POJOs;

/**
 *
 * @author JOSUE GOMEZ
 */
/**
 * La clase DatosPOJO representa la información personal y académica de un usuario.
 * Incluye el nombre del usuario, su carrera universitaria y el semestre en el que se encuentra.
 * Proporciona métodos para acceder y modificar estos datos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     DatosPOJO datos = new DatosPOJO("Juan Pérez", "Ingeniería Informática", 5);
 *     String nombre = datos.getNombre();
 *     datos.setSemestre(6);
 * </pre>
 * </p>
 */
public class DatosPOJO {

    /**
     * El nombre del usuario.
     */
    private String nombre;

    /**
     * La carrera universitaria del usuario.
     */
    private String carreraUniversitaria;

    /**
     * El semestre en el que se encuentra el usuario.
     */
    private int semestre;

    /**
     * Constructor que inicializa un objeto DatosPOJO con los valores especificados.
     *
     * @param nombre              El nombre del usuario.
     * @param carreraUniversitaria La carrera universitaria del usuario.
     * @param semestre            El semestre en el que se encuentra el usuario.
     */
    public DatosPOJO(String nombre, String carreraUniversitaria, int semestre) {
        this.nombre = nombre;
        this.carreraUniversitaria = carreraUniversitaria;
        this.semestre = semestre;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la carrera universitaria del usuario.
     *
     * @return La carrera universitaria del usuario.
     */
    public String getCarreraUniversitaria() {
        return carreraUniversitaria;
    }

    /**
     * Establece la carrera universitaria del usuario.
     *
     * @param carreraUniversitaria La nueva carrera universitaria del usuario.
     */
    public void setCarreraUniversitaria(String carreraUniversitaria) {
        this.carreraUniversitaria = carreraUniversitaria;
    }

    /**
     * Obtiene el semestre en el que se encuentra el usuario.
     *
     * @return El semestre en el que se encuentra el usuario.
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre en el que se encuentra el usuario.
     *
     * @param semestre El nuevo semestre en el que se encuentra el usuario.
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Devuelve una representación en forma de cadena de los datos del usuario.
     * 
     * @return Una cadena que representa los datos del usuario.
     */
    @Override
    public String toString() {
        return "Datos{"
                + "nombre='" + nombre + '\''
                + ", carreraUniversitaria='" + carreraUniversitaria + '\''
                + ", semestre=" + semestre
                + '}';
    }
}
