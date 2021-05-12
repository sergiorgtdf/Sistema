/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.old;

import Controlador.old.crtUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.usuarioBO;
import modelo.usuarioVO;
import vista.frmListadoBase;

/**
 *
 * @author solmedo
 */
public class Listado_Usuarios implements ActionListener {

    frmListadoBase formListado = new frmListadoBase();
    usuarioBO bo;

    DefaultTableModel modelo = new DefaultTableModel();

    public Listado_Usuarios(frmListadoBase v) {
        this.formListado = v;
        Iniciar();
    }

    private void Iniciar() {
        String Titulo = "Listado de Usuarios";
        this.formListado.lblTitulo.setText(Titulo);
        this.formListado.setTitle(Titulo);
        
        this.formListado.btnEditar.addActionListener(this);
        this.formListado.btnNuevo.addActionListener(this);
        this.formListado.btnImprimir.addActionListener(this);
        this.formListado.txtBuscar.addActionListener(this);
        bo = new usuarioBO();
        CargarDatos(0, "");
        
    }
    
    public void go() {
        this.formListado.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formListado.btnNuevo) {

            Nuevo();

        }

        if (e.getSource() == formListado.btnEditar) {

            
            Editar();

        }

        if (e.getSource() == formListado.btnImprimir) {

            JOptionPane.showMessageDialog(null, "En construccion", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    
    private void Nuevo() {
       new crtUsuarios(formListado,0).go();
       
    }
    
    private void Editar() {
        int Seleccionado = 0;
        int idSeleccionado = 0;

        
        try {
            Seleccionado = this.formListado.TablaDatos.getSelectedRow();
            if (Seleccionado == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");

            } else {
                idSeleccionado = Integer.parseInt(String.valueOf(this.formListado.TablaDatos.getValueAt(Seleccionado, 0).toString()));
                System.out.println("idseleccionado: " + idSeleccionado);
                try {
                    new crtUsuarios(formListado,idSeleccionado).go();
                } catch (Exception e) {
                    System.out.println("Controlador.Listado_Usuarios.Editar()");
                }

      

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void CargarDatos(int pid, String pBusqueda) {

        String strBusqueda = this.formListado.txtBuscar.getText();
        try {

            DefaultTableModel modelotabla;

            Object columnas[] = {"id", "Nombre", "Apellidos", "Tipo Doc", "Documento", "Fecha de Nacimento", "Fecha Alta", "Fecha Baja", "Estado", "Eliminado", "Nombre Usuario", "Contraseña", "Fecha Contraseña"};

            //Crea el modelo de la tabla y hace que las columnas no sean editables
            modelotabla = new DefaultTableModel(columnas, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
                    //Cambiar el 3 por el maximo numero de columnas de la tabla
                    if (column == 13) {
                        return true;
                    } else {
                        return false;
                    }
                }

            };

            this.formListado.TablaDatos.setModel(modelotabla);

            ArrayList<usuarioVO> filas = bo.getListado(0, strBusqueda);

            for (int i = 0; i < filas.size(); i++) {
            //{"id", "Nombre", "Apellidos", "Tipo Doc", "Documento", "Fecha de Nacimento", "Fecha Alta", "Fecha Baja", "Estado", "Eliminado", "Nombre Usuario", "Contraseña", "Fecha Contraseña"};
                modelotabla.addRow(new Object[]{filas.get(i).getId(), filas.get(i).getNombres(), filas.get(i).getApellidos(), filas.get(i).getTipo_doc(), filas.get(i).getDocumento(), filas.get(i).getFecha_nacimiento(),
                filas.get(i).getFecha_alta(), filas.get(i).getFecha_baja(), filas.get(i).getEstado(), filas.get(i).getEliminado(), filas.get(i).getUsuario(), filas.get(i).getPass(), filas.get(i).getFechaPass()});
            }
           this.formListado.lblCantidadRegistros.setText( String.valueOf(filas.size()));
        } catch (Exception e) {
            System.out.println("Controlador.Listado_Usuarios.CargarDatos()");
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

   
    
}
