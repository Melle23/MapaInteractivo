/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

import DAOS.UsuarioDAO;
import Interfaces.ValidacionesUsuarios;
import Interfaces.VerificarUsuario;
import POJOs.DatosPOJO;
import POJOs.UsuarioPOJO;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE GOMEZ
 */
public class ValidacionesUsuario implements ValidacionesUsuarios{
   UsuarioDAO uDAO = new UsuarioDAO();
   
    public ValidacionesUsuario() {
    }

    @Override
    public UsuarioPOJO verificarUsuario(String usuario, String contra) {
       if(uDAO.obtenerUsuario(usuario, contra) == null){
           JOptionPane.showMessageDialog(null,"No se encontró el usuario, vuelva a intentarlo.");
           return null;
       }else{
           return uDAO.obtenerUsuario(usuario, contra);
       }
    }
    

    
}
