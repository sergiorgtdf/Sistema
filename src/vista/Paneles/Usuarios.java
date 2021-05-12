/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Paneles;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.usuarioBO;
import modelo.usuarioVO;

/**
 *
 * @author Sergio Olmedo
 */
public class Usuarios extends javax.swing.JPanel {

    usuarioBO bo;
    
    public Usuarios() {
        initComponents();
        Iniciar();
    }
    
    private void Iniciar() {
        
        
        bo = new usuarioBO();
        CargarDatos(0, "");
        
    }
    
    public static void main(String[] args) {
        new Usuarios().setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblCantidadRegistros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(datos);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Usuarios");

        txtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        lblCantidadRegistros.setText("0");

        jLabel1.setText("Cantidad de Registros");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCantidadRegistros)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadRegistros)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editaUsuario user = new editaUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void Editar() {
        int Seleccionado = 0;
        int idSeleccionado = 0;

        
        try {
            Seleccionado = datos.getSelectedRow();
            if (Seleccionado == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");

            } else {
                idSeleccionado = Integer.parseInt(String.valueOf(datos.getValueAt(Seleccionado, 0).toString()));
                System.out.println("idseleccionado: " + idSeleccionado);
                try {
                    //new crtUsuarios(formListado,idSeleccionado).go();
                } catch (Exception e) {
                    System.out.println("Controlador.Listado_Usuarios.Editar()");
                }

      

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void CargarDatos(int pid, String pBusqueda) {

        String strBusqueda = txtBuscar.getText();
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

            datos.setModel(modelotabla);

            ArrayList<usuarioVO> filas = bo.getListado(0, strBusqueda);

            for (int i = 0; i < filas.size(); i++) {
            //{"id", "Nombre", "Apellidos", "Tipo Doc", "Documento", "Fecha de Nacimento", "Fecha Alta", "Fecha Baja", "Estado", "Eliminado", "Nombre Usuario", "Contraseña", "Fecha Contraseña"};
                modelotabla.addRow(new Object[]{filas.get(i).getId(), filas.get(i).getNombres(), filas.get(i).getApellidos(), filas.get(i).getTipo_doc(), filas.get(i).getDocumento(), filas.get(i).getFecha_nacimiento(),
                filas.get(i).getFecha_alta(), filas.get(i).getFecha_baja(), filas.get(i).getEstado(), filas.get(i).getEliminado(), filas.get(i).getUsuario(), filas.get(i).getPass(), filas.get(i).getFechaPass()});
            }
           lblCantidadRegistros.setText( String.valueOf(filas.size()));
        } catch (Exception e) {
            System.out.println("Controlador.Listado_Usuarios.CargarDatos()");
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidadRegistros;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
