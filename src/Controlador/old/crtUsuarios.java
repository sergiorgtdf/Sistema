/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.old;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import logica.usuarioBO;
import modelo.usuarioVO;
import vista.*;
import vista.Paneles.pnlUsuario;

/**
 *
 * @author solmedo
 */
public class crtUsuarios implements ActionListener {

    private frmListadoBase padre;
    private frmAbmDialog formDialog;
    private frmPrincipal principal;
    private int idEditar = 0;

    private usuarioVO ModifUsuario;
    
    usuarioBO bo;

    pnlUsuario pan;

    public crtUsuarios(frmListadoBase padre, int pid) {

        this.padre = padre;
        this.idEditar = pid;
        Iniciar();
        
    }

    private void Iniciar() {
        this.formDialog = new frmAbmDialog(principal, true);
        try {
            
            
            String Titulo = "Usuarios";
            this.formDialog.lblTitulo.setText(Titulo);
            this.formDialog.setTitle(Titulo);

            this.formDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            this.formDialog.btnGuardar.setVisible(true);
            
            this.formDialog.btnImprimir.setVisible(false);

            this.formDialog.btnGuardar.addActionListener(this);
            this.formDialog.btnCancelar.addActionListener(this);
            
            pan = new pnlUsuario();

            //pan.setLocation(0, 59);
            this.formDialog.panContenedor.add(pan);
            pan.setSize(500, 500);
            //pan.setLocation(50, 50);
            
            pan.repaint();
            
            
            formDialog.repaint();
            formDialog.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            formDialog.setLocationRelativeTo(null);
            //formDialog.toFront();

            formDialog.setSize(1500,500);
            this.formDialog.pack();
            bo = new usuarioBO();

            if (idEditar != 0) {
                pan.txtId.setText(String.valueOf(idEditar));
                CargarDatos();
            }
            pan.txtId.setVisible(true);
            

        } catch (Exception e) {
            System.out.println("Controlador.crtUsuarios.Iniciar()");
        }

    }

    public void go() {
        this.formDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formDialog.btnCancelar) {
            this.formDialog.dispose();
        }

        if (e.getSource() == formDialog.btnGuardar) {
            Guardar();
        }

    }
    
    private void CargarDatos() {
        ArrayList<usuarioVO> datos = bo.getListado(idEditar, "");
        for (usuarioVO dato : datos) {
            pan.txtNombres.setText(dato.getNombres());
            pan.txtAplellidos.setText(dato.getApellidos());
            pan.txtDocumento.setText(dato.getDocumento());
            pan.txtUser.setText(dato.getUsuario());
            pan.txtPass.setText(dato.getPass());
            pan.dtpFechaNac.setDate(dato.getFecha_nacimiento());
            pan.dtpFechaPass.setDate(dato.getFechaPass());
            
        }
    }

    
    
     private void Guardar() {
         ModifUsuario = new usuarioVO();
        if (!pan.txtId.getText().equalsIgnoreCase("")) {
            try {
                

                ModifUsuario.setId(Integer.parseInt(pan.txtId.getText()));
                ModifUsuario.setNombres(pan.txtNombres.getText());
                ModifUsuario.setApellidos(pan.txtAplellidos.getText());
                ModifUsuario.setTipo_doc(2);
                ModifUsuario.setDocumento(pan.txtDocumento.getText());
                ModifUsuario.setUsuario(pan.txtUser.getText());
                ModifUsuario.setPass(pan.txtPass.getText());
                ModifUsuario.setEstado(Integer.parseInt(pan.cmbEstado.getSelectedItem().toString()));
                
                if (bo.ActualizarUsuario(ModifUsuario)){
                    JOptionPane.showMessageDialog(null, "Registro actualizado", "Sistema", JOptionPane.OK_OPTION);
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el Registro: " , "Sistema", JOptionPane.OK_OPTION);
                }
                    
                //JOptionPane.showMessageDialog(null, bo.Actualizar(Integer.parseInt(pan.txtId.getText()), "", pan.txtNombre.getText(), pan.txtDescripcion.getText(), pan.txtRutaArchivo.getText()));

            } catch (Exception e) {
                System.out.println("Controlador.crtUsuarios.Guardar()");
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } else {
            try {
                JOptionPane.showMessageDialog(null, "Actualizar");
//JOptionPane.showMessageDialog(null, bo.Insertar(pan.txtNombre.getText(), pan.txtDescripcion.getText(), pan.txtRutaArchivo.getText()));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }

}
