package POJOs;

import java.util.List;
import java.util.Map;
import org.bson.types.ObjectId;

/**
 *
 * @author Admin
 */
public class UsuarioPOJO {

    private ObjectId id;
    private String usuario;
    private String contraseña;
    private boolean nivelAuditoria;
    private DatosPOJO datos;
    private List<HorarioPOJO> horario;

    public UsuarioPOJO() {
    }

    public UsuarioPOJO(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public DatosPOJO getDatos() {
        return datos;
    }

    public void setDatos(DatosPOJO datos) {
        this.datos = datos;
    }

    public UsuarioPOJO(String usuario, String contraseña, DatosPOJO datos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.datos = datos;
    }

    public UsuarioPOJO(String usuario, String contraseña, boolean nivelAuditoria, DatosPOJO datos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivelAuditoria = nivelAuditoria; // Corregir asignación aquí
        this.datos = datos;
    }

    public UsuarioPOJO(String usuario, String contraseña, boolean nivelAuditoria, DatosPOJO datos, List<HorarioPOJO> horario) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivelAuditoria = nivelAuditoria;
        this.datos = datos;
        this.horario = horario;
    }

    public boolean isNivelAuditoria() {
        return nivelAuditoria;
    }

    public void setNivelAuditoria(boolean nivelAuditoria) {
        this.nivelAuditoria = nivelAuditoria;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

     public List<HorarioPOJO> getHorario() {
        return horario;
    }

    public void setHorario(List<HorarioPOJO> horario) {
        this.horario = horario;
    }
}
