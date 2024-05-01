package Controladora;

import Vistas.DlgAjustes;
import Vistas.DlgHorario;
import Vistas.DlgInicioSesion;
import Vistas.DlgRegistroLocacion;
import Vistas.frmMenu;
import Vistas.frmMapa;
import com.mycompany.mapainteractivopersistencia.UsuarioDTO;

/**
 *
 * @author molin
 */
public class ControlPresentacion {
UsuarioDTO sesion = new UsuarioDTO();

    public ControlPresentacion(UsuarioDTO sesion) {
        this.sesion = sesion;
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
    
    public void desplegatHorario(){
        DlgHorario horario = new DlgHorario(sesion);
    }
    
    public void desplegarAjustes(){
        DlgAjustes ajustes = new DlgAjustes(sesion);
    }
    
    public void desplegarRegistroLocacion() {
        DlgRegistroLocacion registro = new DlgRegistroLocacion(sesion);
    }
}
