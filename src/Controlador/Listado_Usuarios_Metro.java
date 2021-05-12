/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.usuarioBO;
import modelo.usuarioVO;
import vista.Paneles.ListadoUsuarios;
import vista.Paneles.pnlUsuario;
import vista.Paneles.widget;
import vista.frmListadoBase;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class Listado_Usuarios_Metro implements ActionListener {

    frmPrincipalMetro Principal; //= new frmPrincipalMetro();
    ListadoUsuarios ListaUser = new ListadoUsuarios();
    usuarioBO bo;

    DefaultTableModel modelo = new DefaultTableModel();

    public Listado_Usuarios_Metro(frmPrincipalMetro p) {

        this.Principal = p;
        Iniciar();
    }

    private void Iniciar() {
        Principal.Contenedor.removeAll();
        Principal.Contenedor.add(ListaUser);

        ListaUser.lblTitulo.setText("Usuarios ctr");
        ListaUser.btnEditar.setActionCommand("EDITAR");
        ListaUser.btnEditar.addActionListener(this);

        bo = new usuarioBO();

    }

    public void go() {
        Iniciar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ListaUser.btnEditar) {

            Nuevo();
            
        }
//
//        if (e.getSource() == ListaUser.btnEditar) {
//
//            
//            Editar();
//
//        }
//
//        if (e.getSource() == formListado.btnImprimir) {
//
//            JOptionPane.showMessageDialog(null, "En construccion", "Sistema", JOptionPane.INFORMATION_MESSAGE);
//
//        }
    }

    private void Nuevo() {

        try {
            System.out.println("Controlador.Listado_Usuarios_Metro.Nuevo()");
            pnlUsuario pnl = new pnlUsuario();
            new crtUsuariosModal(0, pnl);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }

    }

}
