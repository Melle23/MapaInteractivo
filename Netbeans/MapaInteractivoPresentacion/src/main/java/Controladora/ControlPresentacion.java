package Controladora;

import Vistas.DlgAjustes;
import Vistas.DlgHorario;
import Vistas.DlgInicioSesion;
import Vistas.frmMenu;
import Vistas.frmPrincipal;

/**
 *
 * @author molin
 */
public class ControlPresentacion {

    public ControlPresentacion() {

    }

    public void desplegarPrincipal() {
        frmPrincipal frmprincipal = new frmPrincipal();
    }

    public void deplegarMenu() {
        frmMenu menu = new frmMenu();
    }

    public void desplegarInicioSesion() {
        DlgInicioSesion inicioSesion = new DlgInicioSesion();
    }
    
    public void desplegatHorario(){
        DlgHorario horario = new DlgHorario();
    }
    
    public void desplegarAjustes(){
        DlgAjustes ajustes = new DlgAjustes();
    }
}
