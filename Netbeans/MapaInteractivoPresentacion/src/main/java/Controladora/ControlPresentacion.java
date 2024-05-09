package Controladora;

import Vistas.DlgAjustes;
import Vistas.DlgMenuLocaciones;
import Vistas.DlgHorario;
import Vistas.DlgInicioSesion;
import Vistas.DlgRegistroLocacion;
import Vistas.frmMenu;
import Vistas.frmMapa;
import POJOs.UsuarioPOJO;
import Vistas.DlgEliminarLocacion;

/**
 *
 * @author molin
 */
public class ControlPresentacion {
UsuarioPOJO sesion = new UsuarioPOJO();

    public ControlPresentacion(UsuarioPOJO sesion) {
        this.sesion = sesion;
    }

    public ControlPresentacion() {
    }
    

    public void desplegarMapa() {
        frmMapa mapa = new frmMapa(sesion);
    }

    
    /*
    se saltaron la S
                  |
                  V
    */
    public void deplegarMenu() {
        frmMenu menu = new frmMenu(sesion);
    }

    public void desplegarInicioSesion() {
        DlgInicioSesion inicioSesion = new DlgInicioSesion();
    }
    
    public void desplegarHorario(){
        DlgHorario horario = new DlgHorario(sesion);
    }
    
    public void desplegarAjustes(){
        DlgAjustes ajustes = new DlgAjustes(sesion);
        
    }
    
    public void desplegarRegistroLocacion() {
        DlgRegistroLocacion registro = new DlgRegistroLocacion(sesion);
    }
    
    public void desplegarMenuLocaciones() {
        DlgMenuLocaciones Locaciones = new DlgMenuLocaciones(sesion);
    }
    
    public void desplegarEliminarLocacion(){
        DlgEliminarLocacion eliminar = new DlgEliminarLocacion(sesion);
    }
}
