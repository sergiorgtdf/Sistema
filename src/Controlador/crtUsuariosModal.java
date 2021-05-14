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
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import usuarios.usuarioBO;
import modelo.usuarioVO;

import vista.frmModal;
import usuarios.pnlUsuario;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class crtUsuariosModal implements ActionListener {

    private frmModal modal;
    
    private frmPrincipalMetro principal;
    private int idEditar = 0;

    private usuarioVO ModifUsuario;

    usuarioBO bo;

    pnlUsuario pan;

    public crtUsuariosModal(int pid, JPanel pPanel) {
        
        //System.out.println(this.PanelMostrar.toString());
        this.idEditar = pid;
        if (idEditar !=0){
            Iniciar();
        }else{
            modal = new frmModal(pPanel);
        }
        
        
        
        //System.out.println("Constructor crtUsuarioModal");
        modal.setVisible(true);
        
        Iniciar();

    }

    private void Iniciar() {

        try {

            pan = new pnlUsuario();

            //pan.setLocation(0, 59);
            this.modal.add(pan);



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
        //modal = new frmModal(PanelMostrar);
        modal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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

                if (bo.ActualizarUsuario(ModifUsuario)) {
                    JOptionPane.showMessageDialog(null, "Registro actualizado", "Sistema", JOptionPane.OK_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el Registro: ", "Sistema", JOptionPane.OK_OPTION);
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

    
//     
//    

}
