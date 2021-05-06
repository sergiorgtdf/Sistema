/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistema.Global;
import vista.frmPrincipal;

/**
 *
 * @author solmedo
 */
public class ctrPrincipal implements ActionListener {

    private frmPrincipal Principal;

    public ctrPrincipal(frmPrincipal v) {
        this.Principal = v;
        TareasInicio();

    }

    private void TareasInicio() {
        //Titulo ventana - 
        Principal.setTitle("Sistema - MRG");
        Principal.setLocationRelativeTo(null);
        Principal.setExtendedState(Principal.MAXIMIZED_BOTH);//estado maximizado

        this.Principal.lblUsuario.setText(Global.UsuarioActual.getNombres());
    }

    private void Salir() {
        if (JOptionPane.showConfirmDialog(this.Principal, "¿Desea salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    //___________________________________________________________________________________ Soy una barra separadora :)
/* muestra la vista al usuario */
    public void go() {
        this.Principal.setVisible(true);
    }
//___________________________________________________________________________________ Soy una barra separadora :)

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
