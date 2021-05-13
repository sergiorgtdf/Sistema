/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import componentes.Reloj;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.Paneles.Config;
import vista.Paneles.Dash;
import vista.usuarios.ListadoUsuarios;
import vista.usuarios.pnlUsuario;

/**
 *
 * @author Sergio Olmedo
 */
public class frmPrincipalMetro extends javax.swing.JFrame {

    private Reloj hilo;
    JPanel PanelActual;

    Dash dash = new Dash();
    /**
     * Creates new form frmPrincipalMetro
     */
    public frmPrincipalMetro() {

        initComponents();

        Iniciar();

    }

    private void Iniciar() {
        
        String tituloVentana = "Sistema - MRG - directo";
        //Titulo ventana - 

        this.setTitle(tituloVentana);
        this.lblTitulo.setText(tituloVentana);
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);//estado maximizado

        //Iniciar Reloj
        hilo = new Reloj(this.lbHora, this.lblFecha);
        hilo.start();

        //Mostrar Dash
        btnDash.setSelected(true);
        MostrarPanel(dash);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonera = new javax.swing.ButtonGroup();
        Panel_Botonera = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDash = new javax.swing.JToggleButton();
        btnUsuarios = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        btnConfig = new javax.swing.JToggleButton();
        Panel_BarraTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panHora = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        Panel_Botonera.setBackground(new java.awt.Color(34, 45, 49));

        lblTitulo.setBackground(new java.awt.Color(54, 127, 168));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Sistema");
        lblTitulo.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(54, 127, 168));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_user_24px.png"))); // NOI18N

        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        botonera.add(btnDash);
        btnDash.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDash.setForeground(new java.awt.Color(255, 255, 255));
        btnDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_dashboard_24px.png"))); // NOI18N
        btnDash.setText("Dashboard");
        btnDash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDash.setIconTextGap(6);
        btnDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(34, 45, 49));
        botonera.add(btnUsuarios);
        btnUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_user_24px.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(6);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(34, 45, 49));
        botonera.add(btnSalir);
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_exit_24px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(6);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnConfig.setBackground(new java.awt.Color(34, 45, 49));
        botonera.add(btnConfig);
        btnConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(255, 255, 255));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_settings_24px.png"))); // NOI18N
        btnConfig.setText("Configuración");
        btnConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfig.setIconTextGap(6);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotoneraLayout = new javax.swing.GroupLayout(Panel_Botonera);
        Panel_Botonera.setLayout(Panel_BotoneraLayout);
        Panel_BotoneraLayout.setHorizontalGroup(
            Panel_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addGroup(Panel_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_BotoneraLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        Panel_BotoneraLayout.setVerticalGroup(
            Panel_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BotoneraLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnDash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfig)
                .addGap(103, 103, 103)
                .addComponent(btnSalir)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(Panel_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_BotoneraLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );

        Panel_BarraTitulo.setBackground(new java.awt.Color(54, 127, 168));
        Panel_BarraTitulo.setPreferredSize(new java.awt.Dimension(533, 22));

        jLabel1.setBackground(new java.awt.Color(54, 127, 168));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icons8_user_24px.png"))); // NOI18N
        jLabel1.setText("Admin");

        javax.swing.GroupLayout Panel_BarraTituloLayout = new javax.swing.GroupLayout(Panel_BarraTitulo);
        Panel_BarraTitulo.setLayout(Panel_BarraTituloLayout);
        Panel_BarraTituloLayout.setHorizontalGroup(
            Panel_BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BarraTituloLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        Panel_BarraTituloLayout.setVerticalGroup(
            Panel_BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BarraTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Contenedor.setBackground(new java.awt.Color(204, 204, 204));
        Contenedor.setLayout(new java.awt.GridLayout(1, 0));

        panHora.setBackground(new java.awt.Color(238, 240, 165));
        panHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("jLabel2");

        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHora.setText("jLabel2");

        javax.swing.GroupLayout panHoraLayout = new javax.swing.GroupLayout(panHora);
        panHora.setLayout(panHoraLayout);
        panHoraLayout.setHorizontalGroup(
            panHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
            .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panHoraLayout.setVerticalGroup(
            panHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHoraLayout.createSequentialGroup()
                .addComponent(lbHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_BarraTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_BarraTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Panel_Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashActionPerformed
        MostrarPanel(dash);

    }//GEN-LAST:event_btnDashActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

        ListadoUsuarios listUsuario = new ListadoUsuarios();
        MostrarPanel(listUsuario);
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        CerrarApp();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        Config config = new Config();
        MostrarPanel(config);

    }//GEN-LAST:event_btnConfigActionPerformed

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
      
    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CerrarApp();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        CerrarApp();
    }//GEN-LAST:event_formWindowClosed

    
    
    private void MostrarPanel(JPanel pPanel) {

        Contenedor.removeAll();
        Contenedor.add(pPanel);

        Contenedor.revalidate();
        Contenedor.repaint();
        

    }
    
    private void CerrarApp() {
        if (JOptionPane.showConfirmDialog(this, "¿Desea salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            hilo.detenerReloj();
            
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalMetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Panel_BarraTitulo;
    private javax.swing.JPanel Panel_Botonera;
    private javax.swing.ButtonGroup botonera;
    public javax.swing.JToggleButton btnConfig;
    public javax.swing.JToggleButton btnDash;
    public javax.swing.JToggleButton btnSalir;
    public javax.swing.JToggleButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbHora;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panHora;
    // End of variables declaration//GEN-END:variables
}
