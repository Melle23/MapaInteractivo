/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import POJOs.UsuarioPOJO;

/**
 *
 * @author Admin
 */
public interface UsuariosDAO {
    
    public UsuarioPOJO obtenerUsuario(String usuario, String contra);
     
     
}
