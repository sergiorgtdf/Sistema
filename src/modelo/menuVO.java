/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author solmedo
 */
public class menuVO {
    private int id;
    private String nombre_menu;
    private String descripcion;
    private String formulario;
    private int id_depende;
    private int estado;
    private String eliminado;

    public menuVO() {
    }

    public menuVO(int id, String nombre_menu, String descripcion, String formulario, int id_depende, int estado, String eliminado) {
        this.id = id;
        this.nombre_menu = nombre_menu;
        this.descripcion = descripcion;
        this.formulario = formulario;
        this.id_depende = id_depende;
        this.estado = estado;
        this.eliminado = eliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_menu() {
        return nombre_menu;
    }

    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public int getId_depende() {
        return id_depende;
    }

    public void setId_depende(int id_depende) {
        this.id_depende = id_depende;
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
