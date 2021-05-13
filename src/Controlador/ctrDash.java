/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import componentes.Reloj;
import componentes.traerIP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.usuarioBO;
import modelo.usuarioVO;
import vista.Paneles.Dash;
import vista.usuarios.ListadoUsuarios;
import vista.frmListadoBase;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class ctrDash implements ActionListener {

    frmPrincipalMetro Principal;
    Dash dInfo = new Dash();
    usuarioBO bo;

    private Reloj hilo;

    DefaultTableModel modelo = new DefaultTableModel();

    public ctrDash(frmPrincipalMetro m) {
        this.Principal = m;
        Iniciar();

    }

    private void Iniciar() {
        bo = new usuarioBO();
        Principal.Contenedor.removeAll();
        Principal.Contenedor.add(dInfo);

        Principal.Contenedor.revalidate();
        Principal.Contenedor.repaint();

        CargarDatosDash();

    }

    public void go() {
        Iniciar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == formListado.btnNuevo) {
//
//            Nuevo();
//
//        }
//
//        if (e.getSource() == formListado.btnEditar) {
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
        //new crtUsuarios(formListado,0).go();

    }

    private void CargarDatosDash() {

        try {
            //Cantidad de Usuarios
            String n = String.valueOf(bo.getTotalUsuarios());
            dInfo.lblDashUsuarios.setText(n);
            //ip - hOST
            dInfo.lblIp.setText(traerIP.getIP());
            dInfo.lblHost.setText(traerIP.getHostname());

        } catch (Exception e) {
            System.out.println("Error cargar datos usuario " + e.getMessage());
        }

    }

}
