/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

/**
 *
 * @author JOSUE GOMEZ
 */
public class HorarioPOJO {
    private String salon;
    private String materia;
    private String horaEntrada;
    private String horaSalida;

    public HorarioPOJO(String salon, String materia, String horaEntrada,String horaSalida) {
        this.salon = salon;
        this.materia = materia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}

