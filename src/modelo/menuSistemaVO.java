/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sergio Olmedo
 */
public class menuSistemaVO {

    private int codMenu;
    private String Menu;
    private String Descripcion;
    private boolean menu_item;
    private int item_orden;
    private int fk_codMenu;
    private String Evento;

    public menuSistemaVO() {
    }

    public menuSistemaVO(int codMenu, String Menu, String Descripcion, boolean menu_item, int item_orden, int fk_codMenu, String Evento) {
        this.codMenu = codMenu;
        this.Menu = Menu;
        this.Descripcion = Descripcion;
        this.menu_item = menu_item;
        this.item_orden = item_orden;
        this.fk_codMenu = fk_codMenu;
        this.Evento = Evento;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isMenu_item() {
        return menu_item;
    }

    public void setMenu_item(boolean menu_item) {
        this.menu_item = menu_item;
    }

    public int getItem_orden() {
        return item_orden;
    }

    public void setItem_orden(int item_orden) {
        this.item_orden = item_orden;
    }

    public int getFk_codMenu() {
        return fk_codMenu;
    }

    public void setFk_codMenu(int fk_codMenu) {
        this.fk_codMenu = fk_codMenu;
    }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }
    
    
            
    
}
