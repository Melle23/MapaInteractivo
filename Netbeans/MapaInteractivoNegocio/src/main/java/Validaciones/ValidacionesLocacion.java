package Validaciones;

import DAOS.LocacionDAO;
import Interfaces.ValidacionesLocaciones;
import POJOs.LocacionPOJO;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author favel
 */
public class ValidacionesLocacion implements ValidacionesLocaciones {

    LocacionDAO lDAO = new LocacionDAO();

    public ValidacionesLocacion() {
    }

    @Override
    public LocacionPOJO registrarLocacion(String nombre, String descripcion) {
        LocacionPOJO NuevaLocacion = lDAO.RegistrarLocacion(nombre, descripcion);

        if (NuevaLocacion == null) {
            return NuevaLocacion;
        } else {
            JOptionPane.showMessageDialog(null, "No se registró la locación.","Error",JOptionPane.ERROR_MESSAGE);
        }
        return null;
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

        // Filtrar la lista de nombres de locaciones que contienen la cadena de búsqueda
        List<String> resultadosBusqueda = nombresLocaciones.stream()
                .filter(nombre -> nombre.toLowerCase().contains(busqueda.toLowerCase()))
                .collect(Collectors.toList());

        return resultadosBusqueda;
    }

    @Override
    public void eliminarLocacion(String nombre) {
     if(lDAO.obtenerLocacion(nombre) != null){
         lDAO.eliminarLocacion(nombre);
         JOptionPane.showMessageDialog(null, "Locación eliminada con éxito.");
     }else{
         JOptionPane.showMessageDialog(null, "La locación no existe, por lo que no puede ser eliminada.");
     }  
    }

    @Override
    public void editarLocacion(String nombreAnterior, String nuevoNombre, String nuevaDescripcion) {
       lDAO.editarLocacion(nombreAnterior, nuevoNombre, nuevaDescripcion);
    }

}
