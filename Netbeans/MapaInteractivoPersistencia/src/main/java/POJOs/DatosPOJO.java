/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

/**
 *
 * @author JOSUE GOMEZ
 */
public class DatosPOJO {
      private String nombre;
    private String carreraUniversitaria;
    private int semestre;

    // Constructor
    public DatosPOJO(String nombre, String carreraUniversitaria, int semestre) {
        this.nombre = nombre;
        this.carreraUniversitaria = carreraUniversitaria;
        this.semestre = semestre;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarreraUniversitaria() {
        return carreraUniversitaria;
    }

    public void setCarreraUniversitaria(String carreraUniversitaria) {
        this.carreraUniversitaria = carreraUniversitaria;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método toString para representación de cadena
    @Override
    public String toString() {
        return "Datos{" +
                "nombre='" + nombre + '\'' +
                ", carreraUniversitaria='" + carreraUniversitaria + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}
