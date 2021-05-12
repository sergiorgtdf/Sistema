
package sistema;

import Controlador.ctrPrincipalMetro;
import static java.awt.image.ImageObserver.ERROR;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import vista.SplashScreen;
import vista.frmPrincipal;
import vista.frmPrincipalMetro;



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
                    //Nimbus
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    //Metal
                    //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    //CDE/Motif
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    
                    //Windows
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    //Windows Clasico
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en en Look and Feel", "Error", ERROR);
                }
                frmPrincipalMetro v = new frmPrincipalMetro();
                new ctrPrincipalMetro(v).go();
                //new frmPrincipalMetro().setVisible(true);
                //new SplashScreen().setVisible(true);
            }
        });
    }
    
}
