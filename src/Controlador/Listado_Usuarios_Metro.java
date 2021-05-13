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
import vista.usuarios.ListadoUsuarios;
import vista.usuarios.pnlUsuario;
import vista.frmPrincipalMetro;

/**
 *
 * @author solmedo
 */
public class Listado_Usuarios_Metro implements ActionListener {

    frmPrincipalMetro Principal; //= new frmPrincipalMetro();
    ListadoUsuarios ListaUser = new ListadoUsuarios();
    usuarioBO bo;

int cont = 0;

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

        ListaUser.btnNuevo.setActionCommand("NUEVO");
        ListaUser.btnNuevo.addActionListener(this);

        CargarDatos(0, "");
    }

    public void go() {
        Iniciar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Captura en String el comando accionado por el usuario
        String comando = e.getActionCommand();
        //..........................................................................................
        /* Acciones del formulario padre */

        try {
            switch (comando) {
                case "NUEVO":
                    //Nuevo();

                    break;
                case "EDITAR":
                    Editar();
                    break;
                case "USUARIOS":
                   
                    break;
                case "Normativa":
                   
                    break;
                case "ParametrizaEncuadre":
                   
                    break;
                case "Agentes":
                   
                   
                    break;
                case "SALIR":


                    break;

                default:
                    throw new AssertionError();
            }
        } catch (Exception ex) {
            System.out.println("Principal.ControladorPrincipal.actionPerformed() " + ex.getMessage());
        }

    }

    private void Nuevo() {
            
        cont++;
        System.out.println("Paso: " + cont + " veces");

        System.out.println("Controlador.Listado_Usuarios_Metro.Nuevo()");
        //pnlUsuario pnl = new pnlUsuario();
        //new crtUsuariosModal(0, pnl);

        if (cont<2){
            new crtUsuariosModal(0, new pnlUsuario());
        }
        

    }

    private void CargarDatos(int pid, String pBusqueda) {

        bo = new usuarioBO();
        String strBusqueda = ListaUser.txtBuscar.getText();
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

            ListaUser.datos.setModel(modelotabla);

            ArrayList<usuarioVO> filas = bo.getListado(0, strBusqueda);

            for (int i = 0; i < filas.size(); i++) {
                //{"id", "Nombre", "Apellidos", "Tipo Doc", "Documento", "Fecha de Nacimento", "Fecha Alta", "Fecha Baja", "Estado", "Eliminado", "Nombre Usuario", "Contraseña", "Fecha Contraseña"};
                modelotabla.addRow(new Object[]{filas.get(i).getId(), filas.get(i).getNombres(), filas.get(i).getApellidos(), filas.get(i).getTipo_doc(), filas.get(i).getDocumento(), filas.get(i).getFecha_nacimiento(),
                    filas.get(i).getFecha_alta(), filas.get(i).getFecha_baja(), filas.get(i).getEstado(), filas.get(i).getEliminado(), filas.get(i).getUsuario(), filas.get(i).getPass(), filas.get(i).getFechaPass()});
            }
            ListaUser.lblCantidadRegistros.setText(String.valueOf(filas.size()));
        } catch (Exception e) {
            System.out.println("Controlador.Listado_Usuarios.CargarDatos()");
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    
    private void Editar() {
        int Seleccionado = 0;
        int idSeleccionado = 0;

        try {
            Seleccionado = ListaUser.datos.getSelectedRow();
            if (Seleccionado == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");

            } else {
                idSeleccionado = Integer.parseInt(String.valueOf(ListaUser.datos.getValueAt(Seleccionado, 0).toString()));
                System.out.println("idseleccionado: " + idSeleccionado);
                try {
                    new crtUsuariosModal(idSeleccionado, new pnlUsuario());
                } catch (Exception e) {
                    System.out.println("Controlador.Listado_Usuarios.Editar()");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
