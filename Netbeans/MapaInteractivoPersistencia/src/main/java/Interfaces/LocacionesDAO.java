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

    public LocacionPOJO RegistrarLocacion(String nombre, String descripcion);

    public void eliminarLocacion(String nombre);

    public LocacionPOJO obtenerLocacion(String nombre);

    public byte[] obtenerImagenLocacion(String nombre);

    public List<String> obtenerNombresLocaciones();
 
    public void editarLocacion(String nombreAnterior, String nuevoNombre, String nuevaDescripcion);
}
