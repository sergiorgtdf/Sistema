/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.personaVO;
import java.sql.Date;

/**
 *
 * @author Sergio Olmedo
 */
public class usuarioVO extends personaVO {

    private String usuario;
    private String pass;
    private Date FechaPass;

    public usuarioVO() {
    }

    /**
     * *
     * @param id
     * @param nombres
     * @param apellidos
     * @param tipo_doc
     * @param documento
     * @param fecha_nacimiento
     * @param fecha_alta
     * @param fecha_baja
     * @param estado
     * @param eliminado
     * @param usuario
     * @param pass
     * @param FechaPass
     */
    public usuarioVO(int id, String nombres, String apellidos, int tipo_doc, String documento, Date fecha_nacimiento, Date fecha_alta, Date fecha_baja, int estado, String eliminado, String usuario, String pass, Date FechaPass) {
        super(id, nombres, apellidos, tipo_doc, documento, fecha_nacimiento, fecha_alta, fecha_baja, estado, eliminado);
        this.usuario = usuario;
        this.pass = pass;
        this.FechaPass = FechaPass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getFechaPass() {
        return FechaPass;
    }

    public void setFechaPass(Date FechaPass) {
        this.FechaPass = FechaPass;
    }

}
