/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import POJOs.DatosPOJO;
import POJOs.UsuarioPOJO;

/**
 *
 * @author JOSUE GOMEZ
 */
public interface VerificarUsuario {
    
    public UsuarioPOJO verificarUsuario(String usuario, String contra);
}
