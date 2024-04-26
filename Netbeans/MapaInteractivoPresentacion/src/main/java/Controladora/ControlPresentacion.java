package Controladora;

import Vistas.DlgAjustes;
import Vistas.DlgHorario;
import Vistas.DlgInicioSesion;
import Vistas.frmMenu;
import Vistas.frmMapa;

/**
 *
 * @author molin
 */
public class ControlPresentacion {

    public ControlPresentacion() {
    }

    public void desplegarMapa() {
        frmMapa mapa = new frmMapa();
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
