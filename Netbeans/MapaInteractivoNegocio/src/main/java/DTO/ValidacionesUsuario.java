/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAOS.UsuarioDAO;
import Interfaces.VerificarUsuario;
import com.mycompany.mapainteractivopersistencia.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE GOMEZ
 */
public class ValidacionesUsuario implements VerificarUsuario{
   UsuarioDAO uDAO = new UsuarioDAO();
   
    public ValidacionesUsuario() {
    }

    @Override
    public UsuarioDTO verificarUsuario(String usuario, String contra) {
       if(uDAO.obtenerUsuario(usuario, contra) == null){
           JOptionPane.showMessageDialog(null,"No se encontró el usuario, vuelva a intentarlo.");
       }else{
           uDAO.obtenerUsuario(usuario, contra);
       }
       return null;
    }
    

    
}