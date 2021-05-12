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
import vista.Paneles.Dash;
import vista.Paneles.ListadoUsuarios;
import vista.frmListadoBase;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class ctrDash implements ActionListener {

    frmPrincipalMetro Principal;
    usuarioBO bo;

    DefaultTableModel modelo = new DefaultTableModel();

    public ctrDash() {
    
        
    }

    private void Iniciar() {
        Dash dash = new Dash();
        Principal.removeAll();
        Principal.Contenedor.add(dash);
        Principal.Contenedor.revalidate();
        Principal.repaint();
        
        
        
        
        
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
    
   
    
  
    
}
