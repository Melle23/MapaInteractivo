/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAOS.LocacionDAO;
import com.mycompany.mapainteractivopersistencia.LocacionDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author favel
 */
public class ValidacionesLocacion {

    LocacionDAO lDAO = new LocacionDAO();

    public ValidacionesLocacion() {
    }

    public LocacionDTO registrarLocacion(String nombre, String descripcion) {
        LocacionDTO NuevaLocacion = lDAO.RegistrarLocacion(nombre, descripcion);
        
        if (NuevaLocacion == null) {
            return NuevaLocacion;
        } else {
            JOptionPane.showMessageDialog(null,"No se registro la locacion.");
        }
        return null;
    }
    
    public LocacionDTO verificarLocacion(String nombre) {
        if (lDAO.obtenerLocacion(nombre) != null) {
            return lDAO.obtenerLocacion(nombre);
        } else {
            System.out.println("No encontro la locacion");
        }
        return null;
    }
}
