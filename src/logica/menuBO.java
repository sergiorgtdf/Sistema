
package logica;

import DataAccess.menuDA;
import usuarios.usuarioDA;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.menuVO;
import modelo.usuarioVO;
public class menuBO {
    
    private menuDA da;

    public menuBO() {
        try {
            da = new menuDA();
        } catch (Exception e) {
            
        } 
    }
    
    
    public ArrayList<menuVO> getCargarMenu (int id_depende){
        ArrayList<menuVO> datos ;
        try {
            datos = da.ObtenerMenu(0);
        } catch (Exception e) {
            System.out.println("Logica.usuarioBO.getListado()");
            throw e;
        }
        return datos;
    }
    
   
    
}
