package Validaciones;

import DAOS.LocacionDAO;
import Interfaces.ValidacionesLocaciones;
import POJOs.LocacionPOJO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author favela,Josue Gomez
 */
public class ValidacionesLocacion implements ValidacionesLocaciones {

    LocacionDAO lDAO = new LocacionDAO();
   List<JLabel> puntos = new ArrayList<>();
    public ValidacionesLocacion() {
    }

    @Override
    public LocacionPOJO registrarLocacion(String nombre, String descripcion, int x, int y) {
        LocacionPOJO NuevaLocacion = lDAO.RegistrarLocacion(nombre, descripcion, x, y);

        if (NuevaLocacion != null) {
            return NuevaLocacion;
        } else {
            JOptionPane.showMessageDialog(null, "No se registró la locación.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }

    @Override
    public LocacionPOJO verificarLocacion(String nombre) {
        LocacionPOJO locacion = lDAO.obtenerLocacion(nombre);
        if (locacion != null) {
            byte[] imagen = lDAO.obtenerImagenLocacion(nombre);
            return new LocacionPOJO(locacion.getNombre(), locacion.getDescripcion(), imagen);
        } else {
            System.out.println("ValidacionesLocacion: No encontro la locacion");
        }
        return null;
    }

    @Override
    public List<String> buscarLocaciones(String busqueda) {
        List<String> nombresLocaciones = lDAO.obtenerNombresLocaciones();

        List<String> resultadosBusqueda = nombresLocaciones.stream()
                .filter(nombre -> nombre.toLowerCase().contains(busqueda.toLowerCase()))
                .collect(Collectors.toList());

        return resultadosBusqueda;
    }

    @Override
    public void eliminarLocacion(String nombre) {
        if (lDAO.obtenerLocacion(nombre) != null) {
            lDAO.eliminarLocacion(nombre);
            JOptionPane.showMessageDialog(null, "Locación eliminada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "La locación no existe, por lo que no puede ser eliminada.");
        }
    }

    @Override
    public void editarLocacion(String nombreAnterior, String nuevoNombre, String nuevaDescripcion) {
        lDAO.editarLocacion(nombreAnterior, nuevoNombre, nuevaDescripcion);
    }
   
     public List<JLabel> devolverListaLabels(){
       return lDAO.obtenerLocacionesComoJLabels();
    }
     
     public void insertarImagenLocacion(String nombre, File file){
         lDAO.guardarImagenLocacion(nombre, file);
     }

}