/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import static net.ucanaccess.converters.Functions.date;

/**
 *
 * @author Sergio Olmedo
 */



public class personaVO {
 
    private int id;
    private String nombres;
    private String apellidos;
    private int tipo_doc;
    private String documento;
    private Date fecha_nacimiento;
    private Date fecha_alta;
    private Date fecha_baja;
    private int estado;
    private String eliminado;

    public personaVO() {
    }

    public personaVO(int id, String nombres, String apellidos, int tipo_doc, String documento, Date fecha_nacimiento, Date fecha_alta, Date fecha_baja, int estado, String eliminado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo_doc = tipo_doc;
        this.documento = documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_alta = fecha_alta;
        this.fecha_baja = fecha_baja;
        this.estado = estado;
        this.eliminado = eliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(int tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    
   
    
}
