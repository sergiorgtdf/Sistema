/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Paneles;


import componentes.modal.FadeEffect;


public class editaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form editaUsuario
     */
    public editaUsuario() {
        initComponents();
        FadeEffect.transp(this);
        FadeEffect.fadeInFrame(this, 15, 0.5f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new componentes.modal.JEImagePanel();
        jPanel1 = new javax.swing.JPanel();
        btnnewuser1 = new javax.swing.JLabel();
        btnnewuser2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setUndecorated(true);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/modal/img/fondotransparente.png"))); // NOI18N
        jEImagePanel1.setLayout(new java.awt.GridBagLayout());

        btnnewuser1.setBackground(new java.awt.Color(255, 102, 102));
        btnnewuser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnnewuser1.setForeground(new java.awt.Color(255, 255, 255));
        btnnewuser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnewuser1.setText("Cancel");
        btnnewuser1.setOpaque(true);
        btnnewuser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewuser1MouseClicked(evt);
            }
        });

        btnnewuser2.setBackground(new java.awt.Color(91, 192, 222));
        btnnewuser2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnnewuser2.setForeground(new java.awt.Color(255, 255, 255));
        btnnewuser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnewuser2.setText("Save");
        btnnewuser2.setOpaque(true);
        btnnewuser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewuser2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(btnnewuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnewuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnewuser2)
                    .addComponent(btnnewuser1))
                .addGap(31, 31, 31))
        );

        jEImagePanel1.add(jPanel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewuser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewuser1MouseClicked
        dispose();
    }//GEN-LAST:event_btnnewuser1MouseClicked

    private void btnnewuser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewuser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewuser2MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(editaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnnewuser1;
    private javax.swing.JLabel btnnewuser2;
    private componentes.modal.JEImagePanel jEImagePanel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
