/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.old.Listado_Usuarios;
import componentes.Reloj;
import componentes.traerIP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import logica.usuarioBO;
import sistema.Global;
import vista.frmListadoBase;
import vista.frmPrincipal;

/**
 *
 * @author solmedo
 */
public class ctrPrincipal implements ActionListener {

    private Reloj hilo;
    private frmPrincipal Principal;
    
    private frmListadoBase frmListado;
    

    public ctrPrincipal(frmPrincipal v) {
        this.Principal = v;
        TareasInicio();

    }

    private void TareasInicio() {
        //Titulo ventana - 
        Principal.setTitle("Sistema - MRG");
        Principal.setLocationRelativeTo(null);
        Principal.setExtendedState(Principal.MAXIMIZED_BOTH);//estado maximizado

        this.Principal.lblIp.setText(traerIP.getIP());
        this.Principal.lblHost.setText(traerIP.getHostname());

        this.Principal.lblUsuario.setText(Global.UsuarioActual.getNombres());

        hilo = new Reloj(this.Principal.lbHora, this.Principal.lblFecha);
        hilo.start();

        //Se añade las acciones a los controles del formulario padre
        this.Principal.mnuSalir.setActionCommand("SALIR");
        this.Principal.mnuUsuarios.setActionCommand("USUARIOS");

        //Se pone a escuchar las acciones del usuario
        this.Principal.mnuSalir.addActionListener(this);
        this.Principal.mnuUsuarios.addActionListener(this);

        
        cargarDatos();
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
                case "Estructura":
                    //AbrirListado("Estructura");

                    break;
                case "USUARIOS":
                    AbrirListado("USUARIOS");
                    break;
                case "Normativa":
                    //AbrirListado("Normativa");
                    break;
                case "ParametrizaEncuadre":
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
         

        frmListado = new frmListadoBase();

        switch (AcComando) {
            case "USUARIOS":
                
                new Listado_Usuarios(frmListado).go();
                break;
                
            case "Estructura":
                Listado = false;
                //new ctrAreas(frmEdicion).go();
                break;
            case "Normativa":
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

        if (Listado) {
            frmListado.setClosable(true);
            frmListado.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            frmListado.toFront();
            frmListado.setLocation(this.Principal.escritorio.getWidth() / 2 - frmListado.getWidth() / 2, this.Principal.escritorio.getHeight() / 2 - frmListado.getHeight() / 2);
            this.Principal.escritorio.add(frmListado);
            try {
                frmListado.setMaximum(true); //OPCIONAL
            } catch (Exception ex) {
                System.out.println("Principal.ControladorPrincipal.AbrirListado()");
            }
        } else {
            //frmEdicion.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            //frmEdicion.setClosable(true);
            //frmEdicion.setLocation(this.Principal.escritorio.getWidth() / 2 - frmListado.getWidth() / 2, this.Principal.escritorio.getHeight() / 2 - frmListado.getHeight() / 2);
            //frmEdicion.toFront();
            //this.Principal.escritorio.add(frmEdicion);
            //try {
              //  frmEdicion.setMaximum(true); //OPCIONAL
            //} catch (Exception ex) {
              //  System.out.println("Principal.ControladorPrincipal.AbrirListado()");
            //}
        }

    }

    private void cargarDatos() {
        usuarioBO boUsuario = new usuarioBO();
        //String n = String.valueOf(boUsuario.getTotalUsuarios());
        //this.Principal.lblCantidadUsuarios.setText( n );
        
    }

}
