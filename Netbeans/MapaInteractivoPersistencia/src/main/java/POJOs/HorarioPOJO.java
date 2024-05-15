/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

/**
 *
 * @author JOSUE GOMEZ
 */
/**
 * La clase HorarioPOJO representa la información de un horario académico.
 * Incluye el salón de clases, la materia, la hora de entrada y la hora de salida.
 * Proporciona métodos para acceder y modificar estos datos.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     HorarioPOJO horario = new HorarioPOJO("LV-1800", "Base de datos Avanzadas", "16:30", "18:00");
 *     String materia = horario.getMateria();
 *     horario.setHoraSalida("11:00");
 * </pre>
 * </p>

 */
public class HorarioPOJO {
  
    /**
     * El salón de clases.
     */
    private String salon;

    /**
     * La materia impartida en el horario.
     */
    private String materia;

    /**
     * La hora de entrada de la clase.
     */
    private String horaEntrada;

    /**
     * La hora de salida de la clase.
     */
    private String horaSalida;

    /**
     * Constructor que inicializa un objeto HorarioPOJO con los valores especificados.
     *
     * @param salon        El salón de clases.
     * @param materia      La materia impartida.
     * @param horaEntrada  La hora de entrada de la clase.
     * @param horaSalida   La hora de salida de la clase.
     */
    public HorarioPOJO(String salon, String materia, String horaEntrada, String horaSalida) {
        this.salon = salon;
        this.materia = materia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    /**
     * Obtiene el salón de clases.
     *
     * @return El salón de clases.
     */
    public String getSalon() {
        return salon;
    }

    /**
     * Establece el salón de clases.
     *
     * @param salon El nuevo salón de clases.
     */
    public void setSalon(String salon) {
        this.salon = salon;
    }

    /**
     * Obtiene la materia impartida en el horario.
     *
     * @return La materia impartida.
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Establece la materia impartida en el horario.
     *
     * @param materia La nueva materia impartida.
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Obtiene la hora de entrada de la clase.
     *
     * @return La hora de entrada de la clase.
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * Establece la hora de entrada de la clase.
     *
     * @param horaEntrada La nueva hora de entrada de la clase.
     */
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * Obtiene la hora de salida de la clase.
     *
     * @return La hora de salida de la clase.
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * Establece la hora de salida de la clase.
     *
     * @param horaSalida La nueva hora de salida de la clase.
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
}

