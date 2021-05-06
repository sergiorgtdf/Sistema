/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.frmListadoBase;

/**
 *
 * @author solmedo
 */
public class Listado_Usuarios implements ActionListener {

    frmListadoBase vista = new frmListadoBase();
    DefaultTableModel modelo = new DefaultTableModel();

    public Listado_Usuarios(frmListadoBase v) {
        this.vista = v;
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnImprimir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnNuevo) {

            JOptionPane.showMessageDialog(null, "En construccion", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == vista.btnEditar) {

            int fila = vista.TablaDatos.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debee Seleccionar Una fila..!!");
            } else {
                int id = Integer.parseInt((String) vista.TablaDatos.getValueAt(fila, 0).toString());
                
            }

            JOptionPane.showMessageDialog(null, "En construccion", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == vista.btnImprimir) {

            JOptionPane.showMessageDialog(null, "En construccion", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        }
    }

}
