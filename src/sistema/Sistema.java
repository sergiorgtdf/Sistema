
package sistema;

import static java.awt.image.ImageObserver.ERROR;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import vista.SplashScreen;
import vista.frmPrincipal;



public class Sistema {
        private final Connection cx = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en en Look and Feel", "Error", ERROR);
                }
                
                new SplashScreen().setVisible(true);
            }
        });
    }
    
}
