package Controladora;

import Vistas.DlgInicioSesion;
import Vistas.frmAjustes;
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

    public void deplegarAjustes() {
        frmAjustes frmajustes = new frmAjustes();
    }

    public void desplegarInicioSesion() {
        DlgInicioSesion inicioSesion = new DlgInicioSesion();
    }
}
