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
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import usuarios.usuarioBO;
import sistema.Global;
import vista.Paneles.Dash;
import vista.frmListadoBase;
import vista.frmPrincipal;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class ctrPrincipalMetro implements ActionListener {

    private Reloj hilo;
    private frmPrincipalMetro Principal;
    
    
    

    public ctrPrincipalMetro(frmPrincipalMetro v) {
        this.Principal = v;
        TareasInicio();

    }

    private void TareasInicio() {
        //Titulo ventana - 
        Principal.setTitle("Sistema - MRG - ctr");
        Principal.lblTitulo.setText("Sistema - MRG - ctr");
        Principal.setLocationRelativeTo(null);
        Principal.setExtendedState(Principal.MAXIMIZED_BOTH);//estado maximizado

        //this.Principal.lblIp.setText(traerIP.getIP());
        //this.Principal.lblHost.setText(traerIP.getHostname());

        //this.Principal.lblUsuario.setText(Global.UsuarioActual.getNombres());

        hilo = new Reloj(this.Principal.lbHora, this.Principal.lblFecha);
        hilo.start();

        //Se añade las acciones a los controles del formulario padre
        this.Principal.btnSalir.setActionCommand("SALIR");
        this.Principal.btnDash.setActionCommand("DASH");
        this.Principal.btnUsuarios.setActionCommand("USUARIOS");
        this.Principal.btnConfig.setActionCommand("CONFIG");

        //Se pone a escuchar las acciones del usuario
        this.Principal.btnSalir.addActionListener(this);
        this.Principal.btnUsuarios.addActionListener(this);
        this.Principal.btnDash.addActionListener(this);
        this.Principal.btnConfig.addActionListener(this);
        
        cargarDatos();
    }

    private void Salir() {
        if (JOptionPane.showConfirmDialog(this.Principal, "¿Desea salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.out.println("Boton Salir ctr");    
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

        //Captura en String el comando accionado por el usuario
        String comando = e.getActionCommand();
        //..........................................................................................
        /* Acciones del formulario padre */

        try {
            switch (comando) {
                case "USUARIO":
                    AbrirListado("USUARIO");
                    //ConfGeneral();

                    break;
                case "DASH":
                    AbrirListado("DASH");

                    break;
                case "USUARIOS":
                    AbrirListado("USUARIOS");
                    break;
                case "CONFIG":
                    //AbrirListado("Normativa");
                    break;
                case "XXX":
                    //AbrirListado("ParametrizaEncuadre");
                    break;
                case "Agentes":
                    //Agentes();
                    //AbrirListado("Agentes");
                    break;
                case "SALIR":

                    CerrarApp();

                    break;

                default:
                    throw new AssertionError();
            }
        } catch (Exception ex) {
            System.out.println("Principal.ControladorPrincipal.actionPerformed() " + ex.getMessage());
        }

    }

    private void formClosing(java.awt.event.WindowEvent evt) {
        CerrarApp();
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        CerrarApp();
    }

    private void CerrarApp() {
        if (JOptionPane.showConfirmDialog(Principal, "¿Desea salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            hilo.detenerReloj();
            
            System.exit(0);
        }
    }
    
    
       //___________________________________________________________________________________ Soy una barra separadora :)
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
 /*::::::::::::::: FORMULARIOS  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
 /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
//___________________________________________________________________________________ Soy una barra separadora :)
    private void AbrirListado(String AcComando) {
        boolean Listado = true;
        frmPrincipalMetro m = this.Principal;
        
        switch (AcComando) {
            case "USUARIOS":
                
                new Listado_Usuarios_Metro(m).go();
                break;
                
            case "DASH":
                
                new ctrDash(m).go();
                //new ctrAreas(frmEdicion).go();
                break;
            case "CONFIG":
            System.out.println("Abrir listado CONFIG");
//new ctrNormativaListado(frmListado).go();
                break;

            case "ParametrizaEncuadre":
                //new ctrListadoEncuadreTipo(frmListado).go();
                break;
            case "Agentes":
                //new ctrListadoAgentes(frmListado).go();
                break;

            default:
                throw new AssertionError();
        }

        

    }

    private void cargarDatos() {
        
        AbrirListado("DASH");
        
        
    }

}
